public class CreatingVariables{
	public static void main( String[] args){
		int x, y, age;
		double seconds, e, checking;
		String firstName, lastName, title;

		x = 10;
		y = 400;
		age = 39;

		seconds = 4.71;
		e = 2.71823132138231224;
		checking = 1.89;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";

		int fishCount = 5;
		double fishSize = 3.14;
		String fishType = "Clown Fish";
		String fishLook = "Ugly";

		System.out.println("The cariable x contains "+ x);
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The experiment took " + seconds + " seconds ");
		System.out.println("A favorite irrational # is Euler's number: " + e);
		System.out.println("Hopefully you have more than $" + checking + "!");
		System.out.println("My name's " + title + " " + firstName + lastName);
		System.out.println("I have "+ fishCount + " " + fishType + " as big as " + fishSize + "cm. they have " + fishLook + " AF.");
	}
}
