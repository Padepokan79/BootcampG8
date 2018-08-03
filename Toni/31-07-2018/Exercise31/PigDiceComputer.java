import java.util.*;

public class PigDiceComputer{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int roll, total;
		total = 0;

		do{
			roll = 1 + rand.nextInt(6);
			System.out.println("Computer rolled a "+roll+".");
			if (roll == 1) {
				System.out.println("\tThat ends its turn.");
			}else{
				total += roll; 
				System.out.println("\tComputer has " + total);
				System.out.println("points so far this round.");
				if(total < 20){
					System.out.println("\tComputer will roll again.");
				}
			}
		}while(roll != 1 && total < 20);

		System.out.println("Computer ends the round with  "+total+" points.");

	}
}