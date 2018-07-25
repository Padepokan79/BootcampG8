import java.util.Scanner;

public class Soal1 {
	public static void main( String[] args) {
		int belanja = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Jumlah Belanja : Rp ");
		belanja = keyboard.nextInt();

		if ( belanja > 100000 ) {
			System.out.println( "Selamat, anda mendapatkan hadiah payung cantik!" );
		}
		else if ( belanja <= 100000 ) {
			System.out.println( "Jika anda belanja lebih dari Rp 100.000,- anda akan mendapatkan payung cantik");
		}

		System.out.println("Terima Kasih...");
	}
}