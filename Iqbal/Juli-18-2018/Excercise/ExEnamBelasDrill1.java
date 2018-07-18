import java.util.Scanner;

public class ExEnamBelasDrill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double first , second;
		
		System.out.println("Give Me Two numbers. first :");
		first = keyboard.nextDouble();
		System.out.println("second :" );
		second = keyboard.nextDouble();

		if (first < second){
			System.out.println(first +"is Less Then" +second);
		}
		if (first <= second){
			System.out.println(first +"is Less Teh or Equal to" +second);
		}
		if (first == second){
			System.out.println(first +"is Equal To" +second);
		}
		if (first >= second){
			System.out.println(first +"is Greather then / Equal to" +second);
		}
		if (first > second){
			System.out.println(first +"Is Greather then" +second);
		}
		if ( first != second )
System.out.println( first + " is NOT EQUAL TO " + second );
System.out.println( "Hey." );
	}
}