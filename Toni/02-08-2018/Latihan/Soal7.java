import java.util.*;

public class Soal7{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		// Initializing
		int[] numbers = new int[9];
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = rand.nextInt(9);
		}

		// Printing
		for (int index = 0; index < numbers.length; index++) {
			System.out.print(numbers[index]+" ");
			if ((index+1)%3 == 0) System.out.print("\n");
		}


	}
}