import java.util.ArrayList;
import java.util.Scanner;

public class TesKaryawan1 {
	public static void main (String [] args) {
		Karyawan1 pegawai1 = new Karyawan1();
		Scanner keyboard = new Scanner (System.in);
		Scanner keyboard1 = new Scanner (System.in);
		int nik = 0, lembur, menu, gapok;
		String nama, tempatKerja, divisi, level, keluarga = null, masukMenu, masukanKaryawan;
		
		masukanKaryawan = "ya";
		masukMenu = "ya";
		
		while (masukanKaryawan.equals("ya")) {
			System.out.println("Nama : ");
			nama = keyboard.next();
			System.out.println("NIK : ");
			nik = keyboard1.nextInt();
			System.out.println("Penempatan Kerja : ");
			tempatKerja = keyboard1.next();
			System.out.println("Divisi : ");
			divisi = keyboard1.next();
			System.out.println("Level : ");
			level = keyboard1.next();
			System.out.println("Sudah berkeluarga : ");
			keluarga = keyboard1.next();
			System.out.println("Lembur : ");
			lembur = keyboard.nextInt();
			
		
		
			//Karyawan1 pegawai1 = new Karyawan1(nama, level, keluarga, tempatKerja, divisi, nik);
			pegawai1.setDivisi(divisi);
			pegawai1.setKeluarga(keluarga);
			pegawai1.setLembur(lembur);
			pegawai1.setLevel(level);
			pegawai1.setNama(nama);
			pegawai1.setTempatKerja(tempatKerja);
			
			System.out.println("Tambah karyawan : ");
			masukanKaryawan = keyboard.next();
		}
		
		ArrayList<Karyawan1> kar = new ArrayList<Karyawan1>();			
			
			for(Karyawan1 peg:kar)
				System.out.println(peg);
			
			pegawai1.gajiDasar();
			pegawai1.umk();
			pegawai1.tunjKeluarga();
			pegawai1.tunjTransport();
			pegawai1.bpjsKes();
			pegawai1.bpjsKet();
			pegawai1.hitungGajiTotal();
			pegawai1.getLembur();
		  /*pegawai1.tampilkan();*/
	
	System.out.println();
	
	while (masukMenu.equals("ya")) {
		System.out.println("Menu Perhitungan");
		System.out.println("1.Total Gaji Pokok");
		System.out.println("2.Total Tunjangan Pegawai");
		System.out.println("3.Besar Lembur Setiap Bulan");
		System.out.println("Silakan Pilih Menu :");
		menu = keyboard.nextInt();
		
		if (menu == 1 ) {
			
		}
		System.out.println("anda ingin kembali ke menu ?");
		masukMenu = keyboard.next();
	}
	
	}
}