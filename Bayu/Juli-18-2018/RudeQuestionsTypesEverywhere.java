public class RudeQuestionsTypesEverywhere {
	public static void main( String[] args ) {
		Keyboard[Scanner] = new Scanner(System.in);

		System.out.print( "Hello, what is your name ? " );
		name[String] = Keyboard[Scanner].next();

		System.out.print( "Hi, " + name[String] + "! How old are you ? " );
		age[int] = Keyboard[Scanner].nextInt();

		System.out.println( "So you're " + age + ", eh ?That's not very old. " );
		System.out.print( "How much do you weigh, " + name[String] + " ? " );
		weight[double] = keyboard[Scanner].nextDouble();

		System.out.println( weight[double] + "! Better keep that quiet !!" );
		System.out.print("Finally, what's your income, " + name[String] + " ? ");
		income = keyboard[Scanner].nextDouble();

		System.out.print( "Hopefully that is " + income[double] + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "well, thanks for answering my rude questions, " );
		System.out.println( name[String] + "." );
	}
}