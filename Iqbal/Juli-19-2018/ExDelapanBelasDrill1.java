import java.util.Scanner;

public class ExDelapanBelasDrill1{
	public static void main(String[ ] args){
		Scanner keyboard = new Scanner(System.in);
		String secret = "please" , guess ;
		System.out.println("Whats The Secret word ?");
		guess = keyboard.next();

		if(guess.equals(secret) || guess.equals("mogul")){
			System.out.println("Thats Correct's !");
		}
		else{ 
			System.out.println("no , the secret word isn't \"" + guess + "\".");
		}
		if(guess==secret){
			System.out.println("(this will never ever show , no matter what.)");
		}
	}
}