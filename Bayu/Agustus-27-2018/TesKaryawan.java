import java.util.Scanner;

public class TesKaryawan {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner (System.in);
		int nik, lembur;
		
	System.out.print("Nama :");
	String nama = keyboard.nextLine();
	System.out.print("NIK :");
	nik = keyboard.nextInt();
	System.out.print("Penempatan Kerja :");
	String tempatKerja = keyboard.next();
	System.out.print("Divisi :");
	String divisi = keyboard.next();
	System.out.print("Level :");
	String level = keyboard.next();
	System.out.print("Sudah berkeluarga :");
	String keluarga = keyboard.next();
	System.out.print("Lembur :");
	lembur = keyboard.nextInt();
	
	Karyawan pertama = new Karyawan ();
	pertama.setNama(nama);
	pertama.setKeluarga(keluarga);
	pertama.setLembur(lembur);
	pertama.setLevel(level);
	pertama.setTempatKerja(tempatKerja);
	pertama.setDivisi(divisi);
	
	pertama.gajiDasar();
	pertama.umk();
	pertama.tunjKeluarga();
	pertama.tunjTransport();
	pertama.bpjsKes();
	pertama.bpjsKet();
	pertama.hitungGajiTotal();
	pertama.getLembur();
	pertama.tampilkan();
	
	}
}
