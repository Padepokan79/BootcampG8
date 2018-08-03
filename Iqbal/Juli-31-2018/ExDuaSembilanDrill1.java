/*
Author : Muhamad Iqbal Farhan Maulana
*/
import java.util.Scanner;

public class ExDuaSembilanDrill1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String coin , again ;
		int streak = 0 ;
		boolean gotHeads ;
		again = "y";
		while(again.equals("y")){
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
				if(again.equals("n")){
					again = "n";
				}
			}
			else{
				System.out.println("\t You Lose everything!");
				System.out.println("\t Should've quit while You were aHead... ");
				streak= 0;
				again = "n";
			}

		}
		
		System.out.println("Final Score :"+ streak);

	}
}