import java.util.*;

public class KeepGuessing{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int secret, guess;

		secret = 1+(int)(rand.nextInt(100));

		System.out.println("I have chosen a Number between 1 and 10.");
		System.out.println("Try to guess it!");
		System.out.print("Your guess: ");
		guess = input.nextInt();

		while(secret != guess){
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
		}

		System.out.println("That's right! You're a good guesser.");
	}
}