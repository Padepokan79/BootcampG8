import java.util.Scanner;
public class MainKaryawanReborn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner inputPanjang = new Scanner(System.in);
		String nikKu , namaKu , lokasiKu = "" , pekerjaanKu="";
		
		KaryawanReborn kr = new KaryawanReborn();
		System.out.println("Masukan Nik :");
		nikKu = input.next();
		kr.nik = nikKu;
		System.out.println("Masukan Nama :");
		namaKu = inputPanjang.nextLine();
		kr.nama = namaKu;
		
		System.out.println("Pilih Lokasi Kerja(1.Bandung / 2.Jakarta / 3.Karawang)");
		int pilih = input.nextInt();
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
		kr.penempatanKerja = lokasiKu;
		System.out.println("Masukan Pekerjaan(1.Programer / 2.S.Analis / 3.Tester / 4.Text Writer");
		int pilih1 = input.nextInt();
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
		kr.pekerjaan = pekerjaanKu;
		System.out.println("Apakah Kamu Sudah Menikah(y/n");
		String pilih2 = input.next();
		if(pilih2.equals("y") || pilih2.equals("Y")) {
			kr.statusKeluarga = "y";
			kr.jumlahKeluarga += 1;
		}
		
		System.out.println("Masukan Masa Kerja");
		double pilih3 = input.nextDouble();
		kr.masaKerja = pilih3;
		
		
		
		System.out.println("Masukan Jam Lembur :");
		double pilih4 = input.nextDouble();
		kr.jamLembur = pilih4;
	
		kr.outPut();
	}
}
