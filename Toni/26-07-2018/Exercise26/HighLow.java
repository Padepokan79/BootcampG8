import java.util.*;

public class HighLow{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int secret, guess;
		String distance;

		secret = 1+(int)(rand.nextInt(100));

		System.out.println("I'm thinking of a Number between 1-100.");
		System.out.println("Try to guess it!");
		System.out.print("> ");
		guess = input.nextInt();

		while(secret != guess){
			if (guess < secret) {
				distance = "too low";
				System.out.println("Try to guess it!");
				System.out.print("> ");
				guess = input.nextInt();
			}
			if (guess > secret) {
				System.out.println("Sorry, your guess is too high.");
				System.out.println("Try to guess it!");
				System.out.print("> ");
				guess = input.nextInt();
			}
		}

		System.out.println("You guessed it! What re the odds?!?");
	}
}