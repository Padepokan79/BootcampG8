import static java.lang.System.*;
import java.util.Scanner;

public class TiketPesawat79 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int budget, orang, hari ;
		String nama;

		System.out.println( "===========================" );
		System.out.println( "Selamat Datang di Travel 79" );
		System.out.print( "Nama : " );
		nama = keyboard.next();
		System.out.print( "Berapa orang yang ikut travel bersamamu ?  : " );
		orang = keyboard.nextInt();
		out.print( "Berapa hari kamu akan pergi ?  : " );
		hari = keyboard.nextInt();
		out.print( "Total budget yang " +nama+ " miliki: " );
		budget = keyboard.nextInt();

		out.println( "Destinasi yang kami rekomendasikan untuk " +nama+ " adalah : " );
		out.println( "===============================================================" );


		budget = (budget / hari / orang);

		if ( budget > 1980000  && budget <=2750000 )
			out.println( "Singapura \nTiket Pesawat PP : Rp. 1.200.000,-/org \nHotel : Rp. 335.000,-/malam untuk 2 orang \nMakan sehari Rp. 85.000,- /hari untuk 1 orang \nUniversal Studio** Rp. 360.000,-/org \nTotal Rp. 1.980.000,- ");
		else if ( budget > 2750000 && budget <= 4440000 ) 
			System.out.println( "Lombok \nTiket Pesawat PP : Rp. 2.170.000,-/org \nHotel : Rp. 255.555,-/malam untuk 2 orang \nMakan sehari Rp. 75.000,- /hari untuk 1 orang \nSnorkling** Rp. 250.000,-/org \nTotal Rp. 2.750.000,- ");
		else if ( budget > 4440000 && budget <= 5555000 )
			out.println( "Bangkok \nTiket Pesawat PP : Rp. 3.780.000,-/org \nHotel : Rp. 305.000,-/malam untuk 2 orang \nMakan sehari Rp. 55.000,- /hari untuk 1 orang \nBelanja** Rp. 300.000,-/org \nTotal Rp. 4.440.000,- ");
		else if ( budget > 5555000 )
			out.println( "Tokyo \nTiket Pesawat PP : Rp. 4.760.000,-/org \nHotel : Rp. 355.000,-/malam untuk 2 orang \nMakan sehari Rp. 105.000,- /hari untuk 1 orang \nSki** Rp. 325.000,-/org \nTotal Rp. 5.555.000,- ");
		else
			out.print( "Gagal \nMohon maaf kami tidak menemukan pilihan destinasi yang sesuai");
	}
}