import java.util.Scanner;
import java.util.*;

public class TebakAngka {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int angka, tebakan;

		angka =1 + (int)(10*Math.random() );

		System.out.println(" random angka antara 1-10" );
		System.out.println(" silakan tebak" );
		tebakan = keyboard.nextInt();

		while ( angka != tebakan ) {
			if ( tebakan < angka ) {
				System.out.println( "angka yang anda tebak terlalu kecil" );
				System.out.print( "coba lagi.\n>" );
				tebakan = keyboard.nextInt();				
			}
			if ( tebakan > angka ) {
				System.out.println( "angka yang anda tebak terlalu besar" );
				System.out.print( "coba lagi.\n>" );
				tebakan = keyboard.nextInt();	
			}
		}
		System.out.println( "angka yang anda tebak benar");
	}
}