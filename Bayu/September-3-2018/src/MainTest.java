/* Authorized by
Bayu Hendra
4 September 2018 */

import java.util.*;

public class MainTest {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard1 = new Scanner(System.in);
		String nama, tempatKerja, divisi, level, keluarga;
		int nik, lamaKerja, jamLembur, bonus;
		
		
		System.out.println("Nama : ");
		nama = keyboard.nextLine();
		System.out.println("NIK  : ");
		nik = keyboard1.nextInt();
		System.out.println("Lokasi penempatan kerja (bandung/jakarta/surabaya/karawang) : ");
		tempatKerja = keyboard.nextLine();
		System.out.println("Lama Kerja (Tahun) : ");
		lamaKerja = keyboard1.nextInt();
		System.out.println("divisi (programmer/systemanalist/tester/technicalwriter) : ");
		divisi = keyboard.nextLine();
		System.out.println("Level (junior/middle/senior) : ");
		level = keyboard.nextLine();
		System.out.println("Status Pernikahan (sudah/belum) : ");
		keluarga = keyboard.nextLine();
		System.out.println("Lembur (jam) :");
		jamLembur = keyboard1.nextInt();
		System.out.println("Bonus (jumlah case yang diselesaikan) : ");
		bonus = keyboard1.nextInt();
		System.out.println("===============================================");
		
		Programmer pertama = new Programmer(nama, nik, tempatKerja, lamaKerja, divisi, level, keluarga, jamLembur, bonus);
		//set objek programmer
		pertama.setNama(nama);
		pertama.setNik(nik);
		pertama.setTempatKerja(tempatKerja);
		pertama.setLamaKerja(lamaKerja);
		pertama.setDivisi(divisi);
		pertama.setLevel(level);
		pertama.setKeluarga(keluarga);
		pertama.setJamLembur(jamLembur);
		pertama.setBonus(bonus);
		
		//method Programmer
		pertama.setHashMapGapok();
		pertama.setTunjPegawai();
		pertama.indeksGapok();
		pertama.hitungUmk();
		pertama.hitungGapok();
		pertama.hitungLembur();
		pertama.hitungTunjanganKeluarga();
		pertama.hitungTunjanganTransport();
		pertama.hitungTunjanganPegawai();
		pertama.hitungBonus();
		pertama.hitungBpjs();
		pertama.hitungNetto();
		pertama.hitungPtkp();
		pertama.hitungpkp();
		pertama.hitungGajiTotal();
		pertama.tampilkan();
		
		
		
		
	}
}