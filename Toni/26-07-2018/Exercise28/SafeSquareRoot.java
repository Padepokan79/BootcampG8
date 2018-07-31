import java.util.*;

public class SafeSquareRoot{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double x, y;

		System.out.println("Give me a number, and I'll find its square root. (No negatives, please.) ");
		x = input.nextDouble();

		while(x < 0){
			System.out.println("I won't take the square root of a negative.");
			System.out.print("\nNew number: ");
			x = input.nextDouble();
		}

		y = Math.sqrt(x);
		System.out.println("The Square root of "+x+" is "+y);
	}
}