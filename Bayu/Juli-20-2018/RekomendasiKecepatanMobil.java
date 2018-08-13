import static java.lang.System.*;
import java.util.Scanner;

public class RekomendasiKecepatanMobil {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double jarak;

		System.out.print( "Masukan jarak tempuh Anda: " );
		jarak = keyboard.nextDouble();

		System.out.println( "Mobil Tercepat dan Terhemat adalah : " );
		if ( jarak <  100000 )
			out.println( "mobil 3 = 45 km/jam asumsi bensin = 1L/20km " );
		else {
			out.println( "mobil 2 = 35 km/jam asumsi bensin = 1L/10km \n mobil 1 = 30 km/jam asumsi bensin = 1L/15km " );
		}
	}
}