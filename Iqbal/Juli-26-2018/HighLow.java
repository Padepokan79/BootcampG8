import java.util.Scanner;

public class HighLow{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secret , guess ;

		secret = + (int) (100*Math.random());

		System.out.println("I'm thinking of a number between 1-10");
		System.out.println("Try to Guess It! ");
		System.out.print(">");

		guess = keyboard.nextInt();

		while(secret != guess){
			if(guess < secret){
				System.out.println("Sorry your Guess is too low. ");
				System.out.println("Try Again .\n  ");
				guess = keyboard.nextInt();
			}
			if(guess > secret){
				System.out.println("Sorry Your Gues is too High");
				System.out.println("Try Again .\n ");
				guess = keyboard.nextInt();	
			}
		}
		System.out.println("You Guessed it! what are the odds ?!? ");	
	}
}