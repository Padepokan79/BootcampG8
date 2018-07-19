import java.util.*;

public class ForgetfulMachine{
	public static void main(String[] Args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "What city is the capital of France ?" );
		keyboard.next();

		//The 2nd question will blow up if you type "NO"
		System.out.println( "What is 6 multiplied by 7 ?" );
		keyboard.nextInt();

		//The 2nd question will blow up if you type "YES"
		System.out.println( "Enter a number between 0.0 and 1.0 ?" );
		keyboard.nextDouble();

		System.out.println( "Is there anything else you would like to type?" );
		keyboard.next();
	}
}