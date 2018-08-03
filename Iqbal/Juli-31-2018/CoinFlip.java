/*
Author : Muhamad Iqbal Farhan Maulana
*/
import java.util.Scanner;

public class CoinFlip{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String coin , again ;
		int streak = 0 ;
		boolean gotHeads ;
		do{
			gotHeads = Math.random() < 0.5;
			if(gotHeads)
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println("You flip a coin and it is " + coin);

			if(gotHeads){
				streak ++;
				System.out.println("\tThat's "+streak+ "In a Row.....");
				System.out.println("\tWould You like to flip again(y/n)");
				again = keyboard.next();
			}
			else{
				System.out.println("\t You Lose everything!");
				System.out.println("\t Should've quit while You were aHead... ");
				streak= 0;
				again = "n";
			}

		}
		while(again.equals("y"));
		System.out.println("Final Score :"+ streak);

	}
}