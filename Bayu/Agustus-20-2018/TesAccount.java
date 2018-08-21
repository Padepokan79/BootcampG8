/*Authorized by Bayu
 * Mon/ August, 20 2018
 * 11:59 AM
 */

import java.util.Scanner;

public class TesAccount {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner (System.in);
		Scanner keyboard1 = new Scanner (System.in);
		String nama, alamat, transaksi;
		int ktp, saldo, menu ;
		
		System.out.println("==============");
		System.out.println("Selamat Datang di 79 Bank");
		System.out.println("untuk pembuatan akun bank baru.");
		System.out.println("Silakan masukan nama anda : ");
		nama = keyboard.nextLine();
		System.out.println("Masukan nomor identitas : ");
		ktp = keyboard.nextInt();
		System.out.println("Silakan masukan besar nominal deposit pertama anda : ");
		saldo = keyboard.nextInt();
		System.out.println("==============");
		
		Account pertama = new Account();
		pertama.nama = nama;
		pertama.ktp = ktp;
		pertama.saldo = saldo;
		pertama.Regis();
		
		System.out.println("==============");
		System.out.println("Apakah anda ingin transaksi lainnya ? (ya/tidak)");
		transaksi = keyboard1.nextLine();
		
		if (transaksi.equals("ya")) {
			System.out.println("Menu");
			System.out.println("1. Untuk Mengecek Saldo");
			System.out.println("2. Deposit/Menabung");
			System.out.println("3. Withdraw/Mengambil");
			System.out.println("000.exit");
			System.out.print("Masukan no transaksi yang anda inginkan : ");
			menu = keyboard.nextInt();
			
		for (int indeks = menu; indeks >= 1) {
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
			else if (menu == 000) {
			}
			else if (transaksi.equals("tidak")) {	
			}
		}	
		}
	}
}