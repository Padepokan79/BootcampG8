import java.util.Scanner ;

public class SafeSquareRoot{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double x, y;

		

	System.out.println("Give Me A Number , and i'll find its square root" );	
	System.out.println("(No Negative , Please )");
	


	x = keyboard.nextDouble();

	while(x < 0 ){
		System.out.println("I Won't take the square root of a Negative");
		System.out.println("\n New Number");
		x = keyboard.nextDouble();
	}	

	y = Math.sqrt(x);

	System.out.println("The Square Root of "+ x +" is " + y);		

	}
}