import java.util.Scanner;
public class MainKaryawanReborn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner inputPanjang = new Scanner(System.in);
		String nikKu , namaKu , lokasiKu = "";
		
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
		kr.outPut();
	}
}
