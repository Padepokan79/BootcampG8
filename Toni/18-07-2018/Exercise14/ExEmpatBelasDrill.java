import java.util.Scanner;

public class ExEmpatBelasDrill{
	public static void main( String[] args){
		Scanner keyboard = new Scanner(System.in);
		int age, happy;
		double income, cute;
		boolean allowed;

		System.out.print("Enter your age: ");
		age = keyboard.nextInt();

		System.out.print("Enter your yearly income :");
		income = keyboard.nextDouble();

		System.out.print("How cute are you, on a scale from 0.0 to 10.0? ");
		cute = keyboard.nextDouble();

		System.out.print("How happy do you make them ? (1-10)");
		happy = keyboard.nextInt();

		allowed = (happy > 7 || (age > 25 && age < 40 && (income > 50000 || cute >= 8.5)));

		System.out.println("Allow to date my grandchild? "+allowed);
	}
}