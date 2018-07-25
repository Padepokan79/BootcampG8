import static java.lang.System.*;
import java.util.Scanner;

public class Travel79 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int penumpang;

		out.println( "Selamat Datang di Travel 79" );
		out.print( "Silakan masukan jumlah penumpang: " );
		penumpang = keyboard.nextInt();

		out.println( "Tipe Bus dengan: " );

		if ( penumpang <= 6 || penumpang <= 60 )
			out.println( "6 Kursi Eksekutif Rp. 2.000.000,-");
		if ( penumpang > 6 && penumpang <= 60 )
			out.println( "12 Kursi Rp. 1.300.000,-" );
		if ( penumpang > 12 && penumpang <= 60 )
			out.println( "18 Kursi Rp. 1.500.000,-" );
		if ( penumpang > 18 && penumpang <= 60 )
			out.println( "32 Kursi Rp. 1.800.000,-" );
		if ( penumpang > 32 && penumpang <= 60 )
			out.println( "45 Kursi Rp. 2.000.000,-" );
		if ( penumpang > 45 && penumpang <= 60 )
			out.println( "60 Kursi Rp. 2.300.000,-" );

		out.println();
		out.println( "Rekomendasi kami: " );

		if ( penumpang <= 6 && penumpang <= 12 )
			out.println( "1 bis 6 Kursi Eksekutif Rp. 2.000.000,-");
		if ( penumpang <=12 && penumpang >6 )
			out.println( "1 bis 12 Kursi Rp. 1.300.000,- 2 bis 6 Kursi Eksekutif Rp. 2.000.000,- ");		
		if ( penumpang > 12 && penumpang <= 60 )
			out.println( "18 Kursi Rp. 1.500.000,-" );
		if ( penumpang > 12 && penumpang <= 32 )
			out.println( "32 Kursi Rp. 1.800.000,-" );
		if ( penumpang > 32 && penumpang <= 45 )
			out.println( "45 Kursi Rp. 2.000.000,-" );
		if ( penumpang > 45 && penumpang <= 60)
			out.println( "60 Kursi Rp. 2.300.000,-" );

			out.println();
	}
}