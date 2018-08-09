import java.util.Scanner;

public class CariArray {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int cari;

		System.out.print( "Ada  " +arr1.length);
		System.out.println(" angka pada database.");
 
		System.out.print(" angka : ");
		for ( int indeks =0; indeks < arr1.length; indeks++) {
			System.out.print( arr1[ indeks ]+ " ");

		}
		System.out.println();

		System.out.print("angka yang ingin anda cari ? " );
		cari = keyboard.nextInt();

		for ( int indeks = 0; indeks < arr1.length; indeks++ ) {
			if ( arr1[indeks] == cari ) {
				System.out.println( cari+ " ketemu.");
			}
		}
	}
}