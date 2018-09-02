import java.util.*;

public class TesHitungGaji {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard1 = new Scanner(System.in);
		String nama, tempatKerja, keluarga, divisi,level ;
		int nik, lamaBekerja, lembur, bonus;
		
		System.out.println("===============================");
		System.out.println("Hitung Gaji Karyawan");
		System.out.println("Nama : ");
		nama = keyboard.nextLine();
		System.out.println("NIK :");
		nik = keyboard1.nextInt();
		System.out.println("Penempatan Kerja (jakarta/bandung/surabaya/karawang) : ");
		tempatKerja = keyboard.nextLine();
		System.out.println("Sudah berkeluarga ? (sudah/belum) : ");
		keluarga = keyboard.nextLine();
		System.out.println("Divisi (pg/sa/ts/tw) : ");
		divisi = keyboard.nextLine();
		System.out.println("Level (junior/middle/senior) : ");
		level = keyboard.nextLine();
		System.out.println("Lama bekerja (tahun) : ");
		lamaBekerja = keyboard1.nextInt();
		System.out.println("Lembur (jam) : ");
		lembur = keyboard1.nextInt();
		System.out.println("Bonus (case) : ");
		bonus = keyboard1.nextInt();
		
		Umk pertama = new Umk(tempatKerja);
		pertama.setKota(tempatKerja);
		
		
		
		
		//HashMap tunjangan pegawai
		Map<String, String> map = new HashMap<String, String>();
		Tunjangan pg1 = new Tunjangan("programmer", "junior", 100000);
		Tunjangan pg2 = new Tunjangan("programmer", "middle", 200000);
		Tunjangan pg3 = new Tunjangan("programmer", "senior", 300000);
		
		Tunjangan sa1 = new Tunjangan("system analist", "junior", 200000);
		Tunjangan sa2 = new Tunjangan("system analist", "middle", 300000);
		Tunjangan sa3 = new Tunjangan("system analist", "senior", 500000);
		
		Tunjangan ts1 = new Tunjangan("Tester", "junior", 120000);
		Tunjangan ts2 = new Tunjangan("tester", "middle", 200000);
		Tunjangan ts3 = new Tunjangan("tester", "senior", 325000);
		
		Tunjangan tw1 = new Tunjangan("technical Writer", "junior", 100000);
		Tunjangan tw2 = new Tunjangan("technical writer", "middle", 200000);
		Tunjangan tw3 = new Tunjangan("technical writer", "senior", 300000);
		
		
		
		
		
		
		
	}

}
