
public class Tunjangan {
	double tunjanganPegawai, tunjanganKeluarga, tunjanganTransport, gapok, lembur, bonus;
	String divisi, level, tempatKerja;
	
	public Tunjangan(String divisi, String level, int tunjanganPegawai) {
		super();
		this.tunjanganPegawai = tunjanganPegawai;
		this.divisi = divisi;
		this.level = level;
	}
	
	double tunjanganKeluarga() {
		tunjanganKeluarga = gapok * 0.02;
		return tunjanganKeluarga;
	}
	
	double tunjanganKhusus() {
		if (tempatKerja.equals("jakarta")) {
			tunjanganTransport = 2300000;
		}
		return tunjanganTransport;
	}
	
	double lembur() {
		lembur = 1.5 * 0.005 * gapok * lembur; 
		return lembur;
	}
	
	double bonus() {
		if (divisi.equals("pg")) {
			if (bonus > 0 && bonus <= 25 )
				bonus = bonus * 20000; 
		}
		else if (divisi.equals("ts")) {
			if (bonus > 0 && bonus <= 20 )
				bonus = bonus * 25000; 
		} 
		else if (divisi.equals("tw")) {
			if (bonus > 0 && bonus <= 14 )
				bonus = bonus * 35000; 
		}
		else 
			bonus = bonus * 0; 
		return bonus;
	}
}