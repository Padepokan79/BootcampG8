
public class Karyawan1 {
	private String nama, tempatKerja, divisi, level, keluarga;
	private int nik, gapok, tunjanganPegawai;
	private double  upahLembur, lembur, gaji, umk, tunjTransport, tunjKeluarga, bpjsKes, bpjsKet, gajiTotal;
	int krwng = 3919291, bdg = 3091345, jkt = 3648035;
	
	public Karyawan1(String nama, String level, String klg, String tempatKerja, String div, int nik) {
		super();
		this.nama = nama;
		this.tempatKerja = tempatKerja;
		this.level = level;
		this.keluarga = klg;
		this.divisi = div;
		this.nik = nik;
	}
	
	public Karyawan1() {
	}

	public void setDivisi(String divisi) {
		this.divisi = divisi;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getKeluarga() {
		return keluarga;
	}

	public void setKeluarga(String keluarga) {
		this.keluarga = keluarga;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setTempatKerja(String tempatKerja) {
		this.tempatKerja = tempatKerja;
	}

	public void setLembur(double lembur) {
		this.lembur = lembur;
	}

	public String getNama() {
		return nama;
	}
	
	public int getNik() { 
		return nik;
	}

	public String getTempatKerja() {
		return tempatKerja;
	}

	public String getDivisi() {
		return divisi;
	}	

	public int getGapok() {		
		return gapok;
	}

	double getLembur() {
			upahLembur = 1.5 * 0.005 * gajiDasar() * lembur;
			return upahLembur;
	}

	public int getTunjanganPegawai() {
		if (level.equals("junior")) {
			tunjanganPegawai = 200000;
		}
		else if (level.equals("middle")) {
			tunjanganPegawai = 300000;
		}
		else if (level.equals("senior")) {
			tunjanganPegawai = 500000;
		} 			
		return tunjanganPegawai;
	}
	
	double umk() {
		if (tempatKerja.equals("karawang")) {
			umk = krwng;	
		} 
		else if (tempatKerja.equals("bandung")) {
			umk = bdg ;	
		}
		else if (tempatKerja.equals("jakarta")) {
			umk = jkt ;	
		}
		return umk;
	}	
	
	
		
	double tunjTransport() {
		if (tempatKerja.equals("jakarta")) {
			tunjTransport = 1000000;
		}
		else  {
			tunjTransport = 0;
		}
		return tunjTransport;
	}
	
	double tunjKeluarga() {
		if (keluarga.equals("sudah")) {
			tunjKeluarga = gajiDasar()*0.02;
		}
		else {
			tunjKeluarga = 0;
		}
		return tunjKeluarga;
	}
	
	double gajiDasar() {
		if (divisi.equals("programmer")) {
			gaji = (umk * 1) + tunjKeluarga() + tunjTransport() + tunjanganPegawai; 
		}
		else if (divisi.equals("systemanalist")) {
			gaji = umk * 1.2 + tunjKeluarga() + tunjTransport() + tunjanganPegawai; 
		}
		else if (divisi.equals("tester")) {
			gaji = umk * 1 + tunjKeluarga() + tunjTransport() + tunjanganPegawai;
		}
		else if (divisi.equals("technicalwriter")) {
			gaji = umk * 0.9 + tunjKeluarga() + tunjTransport() + tunjanganPegawai;
		}
		return gaji;
	}
	double bpjsKes() {
		bpjsKes = 0.01*gajiDasar();
		return bpjsKes;
	}
	
	double bpjsKet() {
		bpjsKet = 0.01*gajiDasar();
		return bpjsKet;
	}
	
	void hitungGajiTotal() {
		gajiTotal = gaji + tunjanganPegawai + tunjKeluarga + tunjTransport + lembur - bpjsKes - bpjsKet;
	}
	
	void tampilkan() {
		System.out.println("  ");
		System.out.println("================================================================");
		System.out.println("gaji dasar anda adalah                    : Rp. " +gajiDasar());
		System.out.println("Lembur anda adalah                        : Rp. " +getLembur());
		System.out.println("Tunjangan Keluarga anda adalah            : Rp. " +tunjKeluarga());
		System.out.println("Tunjangan Transport anda adalah           : Rp. " +tunjTransport());
		System.out.println("Potongan BPJS Kesehatan anda adalah       : Rp. " +bpjsKes());
		System.out.println("Potongan BPJS Ketenagakerjaan anda adalah : Rp. " +bpjsKet());
		System.out.println("Total Gaji anda adalah                    : Rp. " +gajiTotal);
	}
}
