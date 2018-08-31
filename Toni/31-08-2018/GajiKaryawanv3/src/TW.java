//import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class TW extends Karyawan implements Potongan, Tunjangan, Umk, Bonus, Lembur{
	
	int lembur, document;
	public TW(String name, String nik, String penempatan, Boolean menikah, int masaKerja, int lembur, String tingkatJabatan, int document) {
		super(name, nik, penempatan, menikah, masaKerja, tingkatJabatan, "Programmer");
		this.lembur = lembur;
		this.document = document;
		
		tunjangan = new HashMap<String, Double>();
		potongan = new HashMap<String, Double>();
		gaji = new HashMap<String, Double>();
		
		gaji.put("pokok", gajiPokok());
		
		tunjangan.put("Tunjangan Pegawai", round(hitungTPegawai()));
		tunjangan.put("Tunjangan Keluarga", round(hitungTKeluarga()));
		
		
		potongan.put("Potongan PPH", round(hitungPph()));
		potongan.put("Pot. BPJS Kesehatan", round(hitungPph()));
		potongan.put("Pot. BPJS Ketenagakerjaan", round(hitungPph()));
		
		gaji.put("kotor", round(gajiKotor()));
		gaji.put("bersih", round(gajiBersih()));
	}
	
	double gajiPokok() {
		int index=masaKerja;
		double[][] precentage = {
			{1.0, 1.0, 1.2, 1.2, 1.3}, 
			{1.3, 1.3, 1.3, 1.5, 1.5, 1.75},
			{2.0, 2.0, 2.0, 2.35, 2.35, 2.5}};
		
		if(tingkatJabatan.equals("junior") && masaKerja > 3) 
			index = 3;
		else if(masaKerja > 4)
			index = 4;
		
		switch(tingkatJabatan) {
			case "junior" : return precentage[0][index] * tarifUmk.get(penempatan); 
			case "middle" : return precentage[1][index] * tarifUmk.get(penempatan);
			case "senior" : return precentage[2][index] * tarifUmk.get(penempatan);
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
		double tmp = document * 35000.0;
		if(tmp > 500000.0) tmp = 500000.0;
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
		if(menikah) tmp = 0.1 * gajiPokok();
		return tmp;
	}

	public double potonganBPJSkes() {
		return 0.01 * gajiPokok();
	}

	public double potonganBPJSket() {
		return 0.01 * gajiPokok();
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
		biayaJabatan = 0.05 * gajiKotor();
		iuranPensiun = 0.0475 * (gajiPokok() + hitungTKeluarga());
		if(pkp < 0) pkp = 0;
		return ((pkp-biayaJabatan-iuranPensiun)*12)-hitungPtkp();
	}
	
	public double hitungPtkp() {
		double ptkp = 36000000.0;
		if(menikah) ptkp += 3000000;
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
