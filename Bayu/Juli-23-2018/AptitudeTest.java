import static java.lang.System.*;
import java.util.Scanner;

public class AptitudeTest {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int aptitude, logic, pattern, complex ;
		String nama;

		out.println( "                 Aptitude Test" );
		System.out.println( "===========================================" );
		System.out.print("Masukan Nama : " );
		nama = keyboard.next();
		System.out.print("Masukan nilai Logic : " );
		logic = keyboard.nextInt();
		System.out.print( "Masukan nilai Pattern : " );
		pattern = keyboard.nextInt();
		System.out.print("Masukan nilai Complex : " );
		complex = keyboard.nextInt();

		aptitude = ( (logic + pattern + complex) / 3 );

		System.out.println();
		System.out.println( " Rata-rata nilai aptitude adalah " + aptitude);
		System.out.println();

		if ( aptitude < 70 )
			System.out.print( "Maaf " +nama+ " anda belum lulus tes Aptitude \nAnda akan di Bootcamp selama 6 bulan. " );
		else if ( aptitude >= 70 && aptitude <= 80 )
			System.out.print( "Selamat " +nama+ " anda telah lulus aptitude \nAnda akan di bootcamp selama 3 bulan. " );
		else if ( aptitude >81 && aptitude <= 100 )
			System.out.print( "Selamat " +nama+ " anda telah lulus aptitude \nAnda akan di bootcamp selama 1 bulan. " );
	}
}