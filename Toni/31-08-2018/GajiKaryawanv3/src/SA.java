//import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class SA extends Karyawan implements Potongan, Tunjangan, Umk{
	
	int lembur;
	public SA(String name, String nik, String penempatan, Boolean menikah, int masaKerja, int lembur, String tingkatJabatan) {
		super(name, nik, penempatan, menikah, masaKerja, tingkatJabatan, "system analist");
		this.lembur = lembur;
		
		tunjangan = new HashMap<String, Double>();
		potongan = new HashMap<String, Double>();
		gaji = new HashMap<String, Double>();
		
		gaji.put("pokok", gajiPokok());
		
		tunjangan.put("Tunjangan Pegawai", round(hitungTPegawai()));
		tunjangan.put("Tunjangan Keluarga", round(hitungTKeluarga()));
		if(penempatan.equals("jakarta"))
			tunjangan.put("Tunjangan Transport", round(tarifTTransport));
		
		potongan.put("Potongan PPH", round(hitungPph()));
		potongan.put("Pot. BPJS Kesehatan", round(potonganBPJS()));
		potongan.put("Pot. BPJS Ketenagakerjaan", round(potonganBPJS()));
		
		gaji.put("kotor", round(gajiKotor()));
		gaji.put("bersih", round(gajiBersih()));
	}
	
	@SuppressWarnings("serial")
	double gajiPokok() {
		int index=masaKerja;
		HashMap<Integer, Double> junior = new HashMap<Integer, Double>(){{ put(0, 1.2); put(1, 1.2); put(2, 1.3); put(3, 1.3); put(4, 1.6);}};
		HashMap<Integer, Double> middle = new HashMap<Integer, Double>(){{ put(0, 1.8); put(1, 1.8); put(2, 1.8); put(3, 1.9); put(4, 1.9); put(5, 2.2);}};
		HashMap<Integer, Double> senior = new HashMap<Integer, Double>(){{ put(0, 2.7); put(1, 2.7); put(2, 2.7); put(3, 2.9); put(4, 2.9); put(5, 3.0);}};
		
		if(tingkatJabatan.equals("junior") && masaKerja > 3) 
			index = 3;
		else if(masaKerja > 4)
			index = 4;
		
		switch(tingkatJabatan) {
			case "junior" : return junior.get(index) * tarifUmk.get(penempatan); 
			case "middle" : return middle.get(index) * tarifUmk.get(penempatan);
			case "senior" : return senior.get(index) * tarifUmk.get(penempatan);
			default : return 0;
		}
	}
	
	double gajiKotor() {
		double bruto = gajiPokok();
		for(Map.Entry<String, Double> tun : tunjangan.entrySet()) {
			bruto += tun.getValue();
		}
		return bruto;
	}
	
	double gajiBersih() {
		double netto = gajiKotor();
		for(Map.Entry<String, Double> pot : potongan.entrySet()) {
			netto -= pot.getValue();
		}
		netto += hitungLembur();
		return netto;
	}
	
	// Interface Implementation
	
	public double hitungLembur() {
		return lembur * (gajiPokok() * tarifLembur);
	}

	@SuppressWarnings("serial")
	public double hitungTPegawai() {
		HashMap<String, Double> tarifTPegawai = new HashMap<String, Double>(){{
			put("junior", 100000.0); put("middle", 200000.0); put("senior", 300000.0);
		}};
		return tarifTPegawai.get(tingkatJabatan);
	}

	public double hitungTKeluarga() {
		double tmp = 0.0;
		if(menikah) tmp = tarifTKeluarga * gajiPokok();
		return tmp;
	}

	public double potonganBPJS() {
		return tarifBPJS * gajiPokok();
	}
	
	public double hitungPph() {
		double temppkp = hitungPkp();
		if (temppkp > 0)
			return (hitungPkp() * tarifPph) / 12;
		else
			return 0;
	}

	public double hitungPkp() {
		double pkp = gajiKotor(), biayaJabatan, iuranPensiun;
		biayaJabatan = tarifBiayaJabatan * gajiKotor();
		iuranPensiun = tarifIuranPensiun * (gajiPokok() + hitungTKeluarga());
		if(pkp < 0) pkp = 0;
		return ((pkp-biayaJabatan-iuranPensiun)*12)-hitungPtkp();
	}
	
	public double hitungPtkp() {
		double ptkp = tarifPtkp;
		if(menikah) ptkp += tarifPtkpKeluarga;
		return ptkp;
	}
	
	public void slit() {
		super.slit();
		System.out.println("Gaji Pokok : "+gaji.get("pokok"));
		for(Map.Entry<String, Double> tj : tunjangan.entrySet()) {
			System.out.println(tj.getKey()+" : "+tj.getValue());
		}
		System.out.println("----------------------------------------");
		System.out.println("Gaji Kotor : "+gaji.get("kotor"));
		System.out.println("----------------------------------------");
		for(Map.Entry<String, Double> pt : potongan.entrySet()) {
			System.out.println(pt.getKey()+" : "+pt.getValue());
		}System.out.println("----------------------------------------");
		System.out.println("Lembur : "+round(hitungLembur()));
		System.out.println("----------------------------------------");
		System.out.println("Gaji Bersih : "+gaji.get("bersih"));
	}
	
}

