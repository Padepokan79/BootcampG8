import java.util.*;
public class ExSembilanDrill2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double m, kg, pound, inches, feet, bmi;

		System.out.print("Your heught (feet only): ");
		feet = keyboard.nextDouble();
		System.out.print("Your heught (inches): ");
		inches = keyboard.nextDouble();
		System.out.print("Your weight in pound: ");
		pound = keyboard.nextDouble();
		kg = pound * 0.453592;
		m = inches * 0.0254;
		m = feet * 0.3048;
		bmi = kg/(m*m);


		System.out.print("Your BMI is " + bmi);
	}
}