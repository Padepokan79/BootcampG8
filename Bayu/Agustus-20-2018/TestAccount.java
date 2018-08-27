/*Authorized by Bayu
 * Mon/ August, 20 2018
 * 11:29 AM
 */
import java.util.Scanner;

public class Account {
	String nama, transaksi;
	int saldo, ktp, tabung, ambil, menu;
	Scanner keyboard = new Scanner (System.in);
	Scanner keyboard1 = new Scanner (System.in);
	
	void Regis () {
		System.out.println("Selamat datang " +nama);
		System.out.println("Akun Bank anda adalah " +ktp+ " a/n " +nama);
		System.out.println("Saldo anda sebesar Rp. " +saldo);
	}
	
	void CekSaldo() {
		System.out.println("Rek. a/n " +nama);
		System.out.println("Sisa saldo anda adalah : Rp. " +saldo);
		TransaksiLainnya();
		
	}
	
	void Menabung() {
		System.out.println("Berapa nominal uang yang akan anda setor ? Rp.  ");
		tabung = keyboard.nextInt();
		System.out.println("Setoran berhasil");
		saldo = saldo + tabung;
		CekSaldo();
		TransaksiLainnya();
	}
	
	void AmbilUang() {
		System.out.print("Berapa nominal uang yang akan anda ambil ? Rp. ");
		ambil = keyboard.nextInt();
		System.out.println("Penarikan berhasil");
		saldo = saldo - ambil;
		CekSaldo();
		TransaksiLainnya();
	}
	
	void TransaksiLainnya() {
		System.out.println("==============");
		System.out.println("Apakah anda ingin transaksi lainnya ? (ya/tidak)");
		transaksi = keyboard1.nextLine();
		Menu();
	}
	
	void Menu() {
			System.out.println("Menu");
			System.out.println("1. Untuk Mengecek Saldo");
			System.out.println("2. Deposit/Menabung");
			System.out.println("3. Withdraw/Mengambil");
			System.out.println("000.exit");
			System.out.print("Masukan no transaksi yang anda inginkan : ");
			menu = keyboard.nextInt();
			
			if (menu == 1) {
				Account kedua = new Account();
				kedua.nama = nama;
				kedua.saldo = saldo;
				kedua.CekSaldo();
				}
			else if (menu == 2) {
				Account ketiga = new Account();
				ketiga.nama = nama;
				ketiga.saldo = saldo;
				ketiga.Menabung();
			}
			else if (menu == 3) {
				Account keempat = new Account();
				keempat.nama = nama;
				keempat.saldo = saldo;
				keempat.AmbilUang();					
			}
			else if (transaksi.equals("tidak")) {	
			}	
	}

}