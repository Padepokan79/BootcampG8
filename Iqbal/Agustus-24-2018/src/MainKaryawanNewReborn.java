import java.util.Scanner;
public class MainKaryawanNewReborn {
	public static void main(String[] args) {
		//Variabel Requirment
		Scanner input = new Scanner(System.in);
		Scanner inputPanjang = new Scanner(System.in);
		String nikKu , namaKu , lokasiKu = "" , pekerjaanKu="";
		
		//Input
		System.out.println("Masukan Nik :");
		nikKu = input.next();
		System.out.println("Masukan Nama :");
		namaKu = inputPanjang.nextLine();
		System.out.println("Pilih Lokasi Kerja(1.Bandung / 2.Jakarta / 3.Karawang)");
		int pilih = input.nextInt();
		System.out.println("Masukan Pekerjaan(1.Programer / 2.S.Analis / 3.Tester / 4.Text Writer");
		int pilih1 = input.nextInt();
		System.out.println("Apakah Kamu Sudah Menikah(y/n");
		String pilih2 = input.next();
		System.out.println("Masukan Masa Kerja");
		double pilih3 = input.nextDouble();
		System.out.println("Masukan Jam Lembur :");
		double pilih4 = input.nextDouble();
		
		//Inisialisasi
			//TempatKerja
		switch(pilih) {
		
		case 1:
			lokasiKu = "Bandung";
			break;
		case 2:
			lokasiKu = "Jakarta";
			break;
		case 3:
			lokasiKu = "Karawang";
		}
			//Pekerjaan
		switch(pilih1) {
		case 1:
			pekerjaanKu =  "Programer";
			break;
		case 2:
			pekerjaanKu = "S.Analis";
			break;
		case 3:
			pekerjaanKu = "Tester";
			break;
		case 4:
			pekerjaanKu = "T.Writer";
		}
			
		
		//Create Objek
		
		KaryawanNewReborn karyawan = new KaryawanNewReborn();
		
		
		//Insert To Set Variable
		karyawan.setNik(nikKu);
		karyawan.setNama(namaKu);
		karyawan.setPenempatanKerja(lokasiKu);
		karyawan.setPekerjaan(pekerjaanKu);
		if(pilih2.equals("y") || pilih2.equals("Y")) {
			karyawan.setKeluarga("y", 1);
		}
		karyawan.setMasaKerja(pilih3);
		karyawan.setJamLembur(pilih4);
		karyawan.outPut();
	}
}
