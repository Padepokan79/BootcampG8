import java.util.Scanner;

public class BooleanExpression{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		boolean a,b,c,d,e,f ; 
		double x,y;
		System.out.println("Give Me two number . first: ");
		x = keyboard.nextDouble();
		System.out.println("Second :");
		y = keyboard.nextDouble();
		a = (x < y);
		b = (x <=y);
		c = (x == y);
		d = (x != y);
		e = (x > y);
		f = (x >= y);

		System.out.println( x + "is less than "  + y + ": " + a);
		System.out.println(x + "is less than / equal to " + y +": "+ b);
		System.out.println(x + "Is equal to" + y+  ": " +c );
		System.out.println(x + "is not equal to" +y+ ": " +d);
		System.out.println(x + "is greather than "+y+ ": " +e);
		System.out.println(x + "is greather than / equal to" + y + ": " +b );

		System.out.println( ! (x < y ) + " " + (x >= y) );
		System.out.println( ! (x <= y ) + " " + (x > y) );
		System.out.println( ! (x == y ) + " " + (x != y) );
		System.out.println( ! (x != y ) + " " + (x == y) );
		System.out.println( ! (x > y ) + " " + (x <= y) );
		System.out.println( ! (x > y ) + " " + (x < y) );
		//less than is <
		// less than / equal to is <=
		// equal to is ==
		//not equal to is !=
		//greather than is >
		//greather than / equal to is >=
		}

}