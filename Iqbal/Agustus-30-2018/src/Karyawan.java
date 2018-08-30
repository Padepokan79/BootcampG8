	
abstract public class Karyawan {
	private String nama,  penempatanKerja , statusMenikah = "n" , jenisPns;
	private double gajiDiterima , jumlahKeluarga = 0 , masaKerja;
	Karyawan(){
		
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getPenempatanKerja() {
		return penempatanKerja;
	}
	public void setPenempatanKerja(String penempatanKerja) {
		this.penempatanKerja = penempatanKerja;
	}
	public String getStatusMenikah() {
		return statusMenikah;
	}
	public void setStatusMenikah(String statusMenikah) {
		this.statusMenikah = statusMenikah;
	}
	public String getJenisPns() {
		return jenisPns;
	}
	public void setJenisPns(String jenisPns) {
		this.jenisPns = jenisPns;
	}

	public double getGajiDiterima() {
		return gajiDiterima;
	}
	public void setGajiDiterima(double gajiDiterima) {
		this.gajiDiterima = gajiDiterima;
	}
	
	public double getJumlahKeluarga() {
		return jumlahKeluarga;
	}
	public void setJumlahKeluarga(double jumlahKeluarga) {
		this.jumlahKeluarga = jumlahKeluarga;
	}
	public double getMasaKerja() {
		return masaKerja;
	}
	public void setMasaKerja(double masaKerja) {
		this.masaKerja = masaKerja;
	}
	void addKeluarga(int jumlah) {
		jumlahKeluarga += jumlah;
	}
	
}
