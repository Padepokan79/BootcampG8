import java.util.*;

public class Karyawan30Ags {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		Scanner keyboard1 = new Scanner (System.in);
		
		int nik = 0, lembur, menu, gapok;
		String nama, tempatKerja, divisi, level, keluarga;
		
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
	}

}
