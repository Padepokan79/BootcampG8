import java.util.Scanner;
public class MainTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner inputAngka = new Scanner(System.in);
		Scanner inputPanjang = new Scanner(System.in);
		String nama , bagianKerja , nik , penempatanKerja  , statusMenikah , tingkatKerja;
		int masaKerja;
		long jamLembur;
		//INPUT
		System.out.println("Masukan Bagian Kerja Kamu (Programmer/S.Analis/T.Writer/Tester)");
		bagianKerja = input.next();
		while(!bagianKerja.equalsIgnoreCase("Programmer") && !bagianKerja.equalsIgnoreCase("S.Analis")&&!bagianKerja.equalsIgnoreCase("t.writer")&&!bagianKerja.equalsIgnoreCase("Tester")) {
			System.out.println("Hanya Masukan Programmer/S.Analis/T.Writer/Tester");
			bagianKerja = input.next();
		}
		System.out.println("Masukan Nik :");
		nik = input.next();
		while(!nik.matches("[0-9]+") || nik.length() != 18) { 
			System.out.println("Harus Angka dan 18 Digit");
			nik = input.next();
		}
		System.out.println("Masukan NAMA :");
		nama = inputPanjang.nextLine();
		while(!nama.matches("[a-zA-Z_ ]+")) { 
			System.out.println("Hanya Huruf !");
			nama = input.next();
		}
		System.out.println("Masukan Tempat Kerja (Bandung/Jakarta/Karawang/Surabaya)");
		penempatanKerja = input.next();
		while(!penempatanKerja.equalsIgnoreCase("bandung") && !penempatanKerja.equalsIgnoreCase("jakarta") && !penempatanKerja.equalsIgnoreCase("karawang") && !penempatanKerja.equalsIgnoreCase("surabaya")) {
			System.out.println("Hanya Bandung/Jakarta/Karawang/Surabaya");
			penempatanKerja = input.next();
		}
		System.out.println("apakah anda sudah Menikah (y/n)");
		statusMenikah = input.next();
		while(!statusMenikah.equalsIgnoreCase("y") && !statusMenikah.equalsIgnoreCase("n")) {
			System.out.println("Hanya Y dan N");
			statusMenikah = input.next();
		}
		System.out.println("Sebutkan Tingkat kerja (Junior/Middle/Senior)");
		tingkatKerja = input.next().toLowerCase();
		while(!tingkatKerja.equalsIgnoreCase("junior") && !tingkatKerja.equalsIgnoreCase("middle") && !tingkatKerja.equalsIgnoreCase("senior")) {
			System.out.println("Hanya Junior/Middle/Senior");
			tingkatKerja = input.next().toLowerCase();
		}
		System.out.println("Masa Kerja :");
		String pilih = input.next();
		while(!pilih.matches("[0-9]+")) {
			System.out.println("Hanya Angka !");
			pilih = input.next();
		}
		System.out.println("Masukan Jam Lembur :");
		String pilih1 = input.next();
		while(!pilih1.matches("[0-9]+")) {
			System.out.println("Hanya Angka !");
			pilih1 = input.next();
		}
		jamLembur = Long.parseLong(pilih1);
		masaKerja = Integer.parseInt(pilih);
		
		
			
		if(bagianKerja.equalsIgnoreCase("Programmer")) {
			PG karyawan = new PG();
			System.out.println("Masukan Bug yang di fix");
			double bug = inputAngka.nextDouble();
			karyawan.setBonus(bug);
			karyawan.setNama(nama);
			karyawan.setNik(nik);
			karyawan.setPenempatanKerja(penempatanKerja);
			karyawan.setTingkatKerja(tingkatKerja);
			karyawan.setStatusKeluarga(statusMenikah);
			karyawan.setMasaKerja(masaKerja);
			karyawan.setJamLembur(jamLembur);
			karyawan.slipGaji();
		}
		else if(bagianKerja.equalsIgnoreCase("S.analis")) {
			SA karyawan = new SA();
			karyawan.setNama(nama);
			karyawan.setNik(nik);
			karyawan.setPenempatanKerja(penempatanKerja);
			karyawan.setTingkatKerja(tingkatKerja);
			karyawan.setStatusKeluarga(statusMenikah);
			karyawan.setMasaKerja(masaKerja);
			karyawan.setJamLembur(jamLembur);
			karyawan.slipGaji();
		}
		else if(bagianKerja.equalsIgnoreCase("t.writer")) {
			TW karyawan = new TW();
			System.out.println("Masukan Jumlah Dokumen Yang ditulis");
			double dok = inputAngka.nextDouble();
			karyawan.setBonus(dok);
			karyawan.setNama(nama);
			karyawan.setNik(nik);
			karyawan.setPenempatanKerja(penempatanKerja);
			karyawan.setTingkatKerja(tingkatKerja);
			karyawan.setStatusKeluarga(statusMenikah);
			karyawan.setMasaKerja(masaKerja);
			karyawan.setJamLembur(jamLembur);
			karyawan.slipGaji();
		}
		else {
			if(bagianKerja.equalsIgnoreCase("Programmer")) {
				TS karyawan = new TS();
				System.out.println("Masukan Jumlah TestCase");
				double test = inputAngka.nextDouble();
				karyawan.setBonus(test);
				karyawan.setNama(nama);
				karyawan.setNik(nik);
				karyawan.setPenempatanKerja(penempatanKerja);
				karyawan.setTingkatKerja(tingkatKerja);
				karyawan.setStatusKeluarga(statusMenikah);
				karyawan.setMasaKerja(masaKerja);
				karyawan.setJamLembur(jamLembur);
				karyawan.slipGaji();
			}
		}
		
	}
}
