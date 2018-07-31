import java.util.*;

public class Drill1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int current = 1, total = 0;

		System.out.print("Type in a bunch of values and I'll ad them up.");
		System.out.print("I'll stop when you type a zero.\n");

		while(current != 0){
			System.out.print("Value: ");
			current = input.nextInt();
			total += current;
			System.out.println("The total so far is: "+total);
		}

		System.out.println("\nThe final total is: "+total);

	}
}