import java.util.*;

public class Buah {
	int hargaBuah, semangka, pisang, mangga, hargaSemangka, hargaMangga, hargaPisang, perMinggu, 
	perHari, penjualanSemangka, penjualanMangga, penjualanPisang, harian, perBulan;
	String namaBuah;
	
	public Buah(int semangka, int pisang, int mangga) {
		super();
		this.semangka = semangka;
		this.pisang = pisang;
		this.mangga = mangga;
	}
		
	public int getSemangka() {
		return semangka;
	}

	public void setSemangka(int semangka) {
		this.semangka = semangka;
	}



	public int getPisang() {
		return pisang;
	}



	public void setPisang(int pisang) {
		this.pisang = pisang;
	}



	public int getMangga() {
		return mangga;
	}



	public void setMangga(int mangga) {
		this.mangga = mangga;
	}



	int hargaSemangka() {
		hargaSemangka = 18000;
		return hargaSemangka;
	}
	
	int hargaPisang() {
		hargaPisang = 15000;
		return hargaPisang;
	}
	
	int hargaMangga() {
		hargaMangga = 10000;
		return hargaMangga;
	}
	
	int penjualanSemangka() {
		penjualanSemangka = semangka * hargaSemangka();
		return penjualanSemangka;
	}
	
	int penjualanMangga() {
		penjualanMangga = mangga * hargaMangga();
		return penjualanMangga;
	}
	
	int penjualanPisang() {
		penjualanPisang = pisang * hargaPisang();
		return penjualanPisang;
	}
	
	int penjualanPerHari() {
		perHari = penjualanSemangka + penjualanMangga + penjualanPisang;
		return perHari;
	}
	
	int penjualanPerMinggu() {
		perMinggu = perHari + perMinggu;
		return perMinggu;
	}
	
	void penjualanPerBulan() {
		perBulan = perMinggu * 4;
	}
	
	void tampilkanPerHari() {
		System.out.println("=========================================");
		System.out.println("Penjualan semangka " +semangka+ " kg       = Rp. " +penjualanSemangka);
		System.out.println("Penjualan pisang   " +pisang  + " kg       = Rp. " +penjualanPisang);
		System.out.println("Penjualan mangga   " +mangga  + " kg       = Rp. " +penjualanMangga);
		System.out.println("Keuntungan hari ini adalah     = Rp. " +perHari);
		System.out.println("Keuntungan minggu ini adalah     = Rp. " +perMinggu);
		System.out.println("=========================================");
	}
}