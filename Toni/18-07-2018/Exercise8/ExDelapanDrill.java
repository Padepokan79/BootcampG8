import java.util.*;
public class ExDelapanDrill{
	public static void main( String[] args){
		String name, race;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. what is your name ?" );
		name = keyboard.next();

		System.out.print("Hi, " + name + "! How old are you ?");
		age = keyboard.nextInt();

		System.out.println("So You're "+age+", eh? That's not very old");
		System.out.print("How much do you weight, "+name+"?");
		weight = keyboard.nextDouble();

		System.out.println(weight+"! Better keep that quiet!!");
		System.out.print("Finally what's your income, "+name+"?");
		income = keyboard.nextDouble();

		System.out.print("Hopefully that is "+income+" per hour");
		System.out.print("and not per year!");
		System.out.print("Well, thanks for answering my rude Questions, " + name + ".");

		System.out.print( "What Race are you ?" );
		race = keyboard.next();
		System.out.println( "So, you're a"+race );

		//Drill 1 : No, Because integer is numberic, and integer number is valid Double number
		//Drill 2 : No, Because string can store any character including number
		//Drill 3 : String will not blow up

	}
}