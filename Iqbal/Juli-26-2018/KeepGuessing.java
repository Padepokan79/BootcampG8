import java.util.Scanner;
public class KeepGuessing {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int secret , guess ;

		secret = 1 + (int) (Math.random()*10);

		System.out.println("I Have Choosen a number between 1 and 10");
		System.out.println("Try To guess it .");
		System.out.print(">");
		
		guess = keyboard.nextInt();

		while( secret != guess){
			System.out.println("Thats is Incorrect , Try Again");
			System.out.println("Your Guess :");
		}

		System.out.println("Thats Right ! you're Good User");
	}
}