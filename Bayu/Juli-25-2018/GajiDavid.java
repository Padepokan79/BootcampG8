import java.util.Scanner;

public class GajiDavid {
	public static void main( String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int gaji = 3000000;
		int totalGaji;
		int masaKerja;
		int kenGaji;
		int tahunMasuk;
		int tahunKerja;

		
		System.out.print ("Tahun Masuk :");
		tahunMasuk = keyboard.nextInt();
		System.out.print ("Masukan masa kerja (Tahun) :");
		masaKerja = keyboard.nextInt();

		if ( masaKerja < 1 ) {
			gaji = (int)gaji;
		}
		else if ( masaKerja >= 1) {
			kenGaji = (int)((gaji * 0.1)* masaKerja );

		totalGaji = gaji + kenGaji;
		tahunKerja = tahunMasuk + masaKerja;
		System.out.println( "Total Gaji David pada tahun " +tahunKerja+ " adalah : Rp" +totalGaji);
		}

	}
}