import java.util.*;
public class ExSembilanDrill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double m, kg, pound, inches, bmi;

		System.out.print("Your heught in inches: ");
		inches = keyboard.nextDouble();
		System.out.print("Your weight in pound: ");
		pound = keyboard.nextDouble();
		kg = pound * 0.453592;
		m = inches * 0.0254;
		bmi = kg/(m*m);


		System.out.print("Your BMI is " + bmi);
	}
}