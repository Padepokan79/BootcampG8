import java.util.*;
public class ExSepuluhDrill{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;
		
		System.out.print("How much is the purchase price ");
		price = keyboard.nextDouble();
		
		salesTax = price * 0.825;
		total = price + salesTax;

		System.out.println("Item price:\t" + price);
		System.out.println("Sales tax:\t" + salesTax);
		System.out.print("Total cost is:\t" + total);

	}
}