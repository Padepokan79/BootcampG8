//Author : Muhamad Iqbal FM 20-Agustus-2018
import java.util.Scanner;
import java.util.Random;
public class mainAccount {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random acak = new Random();
		String  noRekening , namaPemilik , pin , statusExit = "NO", statusNabungAwal;
		int saldo = 0 , pilih;
		
		Account user = new Account();
		
		System.out.println("Selamat Datang Silahkan Register");
		System.out.println("Masukan Nama ");
		namaPemilik = input.nextLine();
		System.out.println("Masukan PIN Untuk Transaksi");
		pin = input.nextLine();
		System.out.println("Apakah Anda Akan Langsung Menabung(y/n)");
		statusNabungAwal = input.nextLine();
		if(statusNabungAwal.equals("y")) {
			System.out.println("Berapa anda akan Benabung :");
			saldo = input.nextInt();
		}
		noRekening = String.valueOf(acak.nextInt(10000001));
		user.register(noRekening, namaPemilik, pin, saldo);;
		do {
		user.tampilAkun();
		System.out.println("Apa yang akan anda Lakukan :");
		System.out.println("1.Cek Saldo");
		System.out.println("2. Menabung");
		System.out.println("3.Tarik Tunai");
		pilih = input.nextInt();
			if(pilih == 1) {
				user.cekSaldo();
				System.out.println("Apakah Anda Masih akan Melakukan Transaksi Lagi ?(y/n)");
				String jawab = 	input.next();
				if(jawab.equals("y") || jawab.equals("Y")) {
					statusExit = "n";
				}
				else {
					statusExit = "y";
				}
			}
			else if(pilih == 2) {		
				user.menabung();
				System.out.println("Apakah Anda Masih akan Melakukan Transaksi Lagi ?(y/n)");
				String jawab = 	input.next();
				if(jawab.equals("y") || jawab.equals("Y")) {
					statusExit = "n";
				}
				else {
					statusExit = "y";
				}
			}
			else if(pilih == 3) {
				user.tarikTunai();
				System.out.println("Apakah Anda Masih akan Melakukan Transaksi Lagi ?(y/n)");
				String jawab = 	input.next();
				if(jawab.equals("y") || jawab.equals("Y")) {
					statusExit = "n";
				}
				else {
					statusExit = "y";
				}
			}
			else {
				System.out.println("Maaf input salah");
			}
		}
		while(!statusExit.equals("y"));	
	}
}