import java.util.Scanner;

public class Wease1OrNot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;

		System.out.println( "Type the word \"wease1\", please." );
		word = keyboard.next();

		yep = word.equals("wease1");
		nope = ! word.equals("wease1");

		System.out.println( "You typed what was requested: " + yep );
		System.out.println( "You ignored polite instructions: " + nope );
	}
}