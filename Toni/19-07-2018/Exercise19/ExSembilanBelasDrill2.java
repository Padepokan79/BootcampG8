import java.util.Scanner;
public class ExSembilanBelasDrill2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double bmi, weight, height;

		System.out.print("Enter you weight (KG)? ");
		weight = keyboard.nextDouble();
		System.out.print("Enter you weight (M)? ");
		height = keyboard.nextDouble();
		bmi = weight/(height*height);

		if ( bmi < 15.0 ) {
			System.out.println("very severely underweight");	
		}else if ( bmi <= 16.0 ) {
			System.out.println("severely underweight");
		}else if ( bmi < 18.5 ) {
			System.out.println("underweight");
		}else if ( bmi < 25.0 ) {
			System.out.println("normal weight");
		}else if ( bmi < 30.0 ) {
			System.out.println("overweight");
		}else if ( bmi < 35.0 ) {
			System.out.println("moderately weight");
		}else if ( bmi < 40.0 ) {
			System.out.println("severely obese");
		}else {
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}

 