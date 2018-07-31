import java.util.Scanner;

public class Soal2 {
	public static void main( String[] args) {
		int nilai;
		String nama;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Nama : " );
		nama = keyboard.next();
		System.out.print("Nilai : ");
		nilai = keyboard.nextInt();

		if ( nilai <= 50 ) {
			System.out.println("Maaf " +nama+ ", anda mendapat nilai E & TIDAK LULUS!" );
		}
		else if ( nilai > 50 && nilai <= 65 ) {
			System.out.println("Selamat " +nama+ ", anda mendapat nilai D & LULUS!" );
		}
		else if ( nilai > 65 && nilai <= 75 ) {
			System.out.println("Selamat " +nama+ ", anda mendapat nilai C & LULUS!" );
		}
		else if ( nilai > 75 && nilai <= 85 ) {
			System.out.println("Selamat " +nama+ ", anda mendapat nilai B & LULUS!" );
		}
		else if ( nilai > 85 && nilai <= 100 ) {
			System.out.println("Selamat " +nama+ ", anda mendapat nilai A & LULUS!" );
		}
	}
}