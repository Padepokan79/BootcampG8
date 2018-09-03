//import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TW extends Karyawan implements Potongan, Tunjangan, Umk, Bonus{
	
	int lembur, document;
	public TW(String name, String nik, String penempatan, Boolean menikah, int masaKerja, int lembur, String tingkatJabatan, int document) {
		super(name, nik, penempatan, menikah, masaKerja, tingkatJabatan, "technical writer");
		this.lembur = lembur;
		this.document = document;
		
		tunjangan = new HashMap<String, Double>();
		potongan = new HashMap<String, Double>();
		gaji = new HashMap<String, Double>();
		
		gaji.put("pokok", gajiPokok());
		
		tunjangan.put("Tunjangan Pegawai", round(hitungTPegawai()));
		tunjangan.put("Tunjangan Keluarga", round(hitungTKeluarga()));
		tunjangan.put("Tunjangan Transport", round(hitungTTransport()));
		
		potongan.put("Potongan PPH", round(hitungPph()));
		potongan.put("Pot. BPJS Kesehatan", round(potonganBPJS()));
		potongan.put("Pot. BPJS Ketenagakerjaan", round(potonganBPJS()));
		
		gaji.put("kotor", round(gajiKotor()));
		gaji.put("bersih", round(gajiBersih()));
	}
	
	@SuppressWarnings("serial")
	double gajiPokok() {
		int index=masaKerja;
		HashMap<Integer, Double> junior = new HashMap<Integer, Double>(){{ put(0, 1.0); put(1, 1.0); put(2, 1.2); put(3, 1.2); put(4, 1.3);}};
		HashMap<Integer, Double> middle = new HashMap<Integer, Double>(){{ put(0, 1.3); put(1, 1.3); put(2, 1.3); put(3, 1.5); put(4, 1.5); put(5, 1.75);}};
		HashMap<Integer, Double> senior = new HashMap<Integer, Double>(){{ put(0, 2.0); put(1, 2.0); put(2, 2.0); put(3, 2.35); put(4, 2.35); put(5, 2.5);}};
		
		
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
		netto += hitungLembur() + hitungBonus();
		return netto;
	}
	
	// Interface Implementation
	
	public double hitungLembur() {
		return lembur * (gajiPokok() * tarifLembur);
	}
	
	public double hitungBonus() {
		double tmp = (double)(tarifBonus.get(posisi) * (document/batasBonus.get(posisi)));
		if(tmp > maxBonus) tmp = maxBonus;
		return tmp;
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
	
	public double hitungTTransport() {
		if(penempatan.equals("jakarta")) 
			return tarifTTransport;
		else return 0;
	}

	public double potonganBPJS() {
		return tarifBPJS * gajiPokok();
	}
	
	public double hitungPph() {
		double temppkp = hitungPkp(), totalpph = 0.0;
		ArrayList<Double> jumlahPph = new ArrayList<Double>();
		int index = 0; 
		//Hitung PPH
		while(index < 4) {
			if(temppkp > rangePph.get(index)) {
				temppkp -= rangePph.get(index);
				jumlahPph.add(rangePph.get(index) * tarifPph.get(index));
			}else {
				jumlahPph.add(temppkp * tarifPph.get(index));
				break;
			}
		}
		//Jumlah PPH
		for(double pphs : jumlahPph) {
			totalpph += pphs;
		}
		return totalpph/12;
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
		System.out.println("Bonus  : "+round(hitungBonus()));
		System.out.println("Lembur : "+round(hitungLembur()));
		System.out.println("----------------------------------------");
		System.out.println("Gaji Bersih : "+gaji.get("bersih"));
	}
	
}
