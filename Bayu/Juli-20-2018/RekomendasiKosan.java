import static java.lang.System.*;
import java.util.Scanner;

public class RekomendasiKosan {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double uang;

		System.out.print( "Masukan nominal biaya yang Anda miliki: Rp. " );
		uang = keyboard.nextDouble();

		System.out.println( "Kosan yang kami rekomendasikan: " );
		if ( uang > 250000  )
			out.println( "R1= Rp. 650.000 /kamar \ntersedia 7 kamar \nmaks perkamar 3 orang ");
		else{
			System.out.println( "R2= Rp. 350.000 /kamar \ntersedia 7 kamar \nmaks per kamar 2 orang  " );
		}
	}
}