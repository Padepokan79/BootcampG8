import java.util.*;

public class Drill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		String coin, again = "y";
		int streak = 0;
		boolean gotHeads;

		while(again.equals("y")){
			gotHeads = rand.nextInt(2) < 1;

			if (gotHeads)
				coin = "HEADS";
			else
				coin = "TAILS";
		
			System.out.println("You flip a coin and it is... "+coin);

			if(gotHeads){
				streak++;
				System.out.println("\tThat's "+streak+" in a row....");
				System.out.println("\tWould you like to flip again (y/n)?");
				again = keyboard.next();
			}
		}


	}
}