import java.util.Scanner;
public class ExSembilanBelasDrill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double bmi;

		System.out.print("Enter your BMI? ");
		bmi = keyboard.nextDouble();

		if ( bmi < 15.0 ) {
			System.out.println("very severely underweight");	
		}if ( bmi <= 16.0 ) {
			System.out.println("severely underweight");
		}if ( bmi < 18.5 ) {
			System.out.println("underweight");
		}if ( bmi < 25.0 ) {
			System.out.println("normal weight");
		}if ( bmi < 30.0 ) {
			System.out.println("overweight");
		}if ( bmi < 35.0 ) {
			System.out.println("moderately weight");
		}if ( bmi < 40.0 ) {
			System.out.println("severely obese");
		}{
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}

 