import java.util.Scanner;

public class TesCard {
	public static void main ( String [] args ) {
		String me;
		Scanner input = new Scanner (System.in);
		System.out.print("Your name : ");
		me = input.next();
		
		System.out.println("===================");
		
		Holiday hol = new Holiday( me );
		hol.greeting();
		
		System.out.println("===================");
		
		Birthday bd = new Birthday( me , 21);
		bd.greeting();
		
		System.out.println("===================");
		
		Valentine val = new Valentine ( me, 7);
		val.greeting();
	}
}
