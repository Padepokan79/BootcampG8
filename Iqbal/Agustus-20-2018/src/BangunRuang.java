//Author : Muhamad Iqbal FM 20-Agustus-2018

import java.util.Scanner;
public class BangunRuang {
double panjang , lebar , tinggi , diameter , jariJari , volume = 0 , luasPermukaan = 0 , phi = 3.14;

	Scanner input = new Scanner(System.in);
	void Kubus() {
		System.out.println("Masukan Panjang Sisi Kubus nya");
		panjang = input.nextDouble();
		System.out.println("Volume KUBUS = "+volumeKubus(panjang));
		System.out.println("Luas Permukaanya = "+luasPermukaanKubus(panjang));
	}
	
	double volumeKubus(double panjangKu) {
		volume = panjangKu*panjangKu*panjangKu;
		return volume;
	}
	double luasPermukaanKubus(double panjangKu) {
		luasPermukaan = panjangKu*panjangKu*6;
		return luasPermukaan;
	}
	
	void balok() {
		System.out.println("Masukan Panjang Balok");
		panjang = input.nextDouble();
		System.out.println("Masukan Lebar Balok");
		lebar = input.nextDouble();
		System.out.println("Masukan Tinggi Balok");
		tinggi = input.nextDouble();
		System.out.println("Volume Balok : "+volumeBalok(panjang , lebar , tinggi));
		System.out.println("Luas Permukaan Balok	: "+luasPermukaanBalok(panjang,lebar,tinggi));
		
	}
	double volumeBalok(double panjang , double lebar , double tinggi) {
		volume = panjang*lebar*tinggi;
		return volume;
	}
	
	double luasPermukaanBalok(double panjang , double lebar , double tinggi) {
		luasPermukaan = 2*((panjang*lebar)+(panjang*tinggi)+lebar*tinggi);
		return luasPermukaan;
	}
	
	void bola() {
		System.out.println("Masukan Diameter");
		diameter = input.nextDouble();
		jariJari = diameter/2;
		System.out.println("Volume Bola : "+volumeBola(jariJari));
		System.out.println("Luas Permukaan Bola	: "+luasPermukaanBola(jariJari));
	}
	double volumeBola(double jariJari) {
		volume = 4/3*phi*jariJari*jariJari*jariJari;
		return volume;
	}
	double luasPermukaanBola(double jariJari) {
		luasPermukaan = 4*phi*jariJari*jariJari;
		return luasPermukaan;
	}
	
	void tabung() {
		System.out.println("Masukan Diameter");
		diameter = input.nextDouble();
		jariJari = diameter/2;
		System.out.println("Masukan Tinggi");
		tinggi = input.nextDouble();
		System.out.println("Volume Tabung = "+volumeTabung(jariJari,tinggi));
		System.out.println("Luas Permukaan Tabung = "+luasPermukaanTabung(jariJari,tinggi));
	}
	
	double volumeTabung(double jariJari , double tinggi) {
		volume = phi * jariJari * jariJari * tinggi ;
		return volume;
	}
	
	double luasPermukaanTabung(double jariJari , double tinggi) {
		luasPermukaan = (2*phi*jariJari*jariJari)+(2*phi*jariJari*tinggi);
		return luasPermukaan;
	}

}
