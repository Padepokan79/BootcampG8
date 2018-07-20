import static java.lang.System.*;
import java.util.Scanner;

public class AvengersBudgetPlan {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Double performScale ;
		String hero ;

		System.out.println( "===========================" );
		System.out.println( "Avengers Bugdet Plan 2050" );
		System.out.print( "Masukan nama pahlawan : " );
		hero = keyboard.next();
		System.out.print( "Masukan skala performa (0.0-10.0) : " );
		performScale = keyboard.nextDouble();
		
		if ( performScale < 3)
			out.println( "Anda, " +hero+ " tidak mendapatkan apa-apa, denda $ 1.000 ");
		else if ( performScale > 3 && performScale <= 5)
			out.println( "Anda, " +hero+ " mendapat dana sebesar 30% dari dana yang diajukan");
		else if ( performScale > 5 && performScale <= 7)
			out.println( "Anda, " +hero+ " mendapat dana sebesar 50% dari dana yang diajukan");
		else if ( performScale > 7 && performScale <= 9)
			out.println( "Anda, " +hero+ " mendapat dana sebesar 75% dari dana yang diajukan");
		else if ( performScale > 9 && performScale <= 10)
			out.println( "Anda, " +hero+ " mendapat 100% dana");
		else
			out.print( "Sorry, RAB tidak mencukupi");
	}
}