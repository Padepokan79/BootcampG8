import java.util.Scanner;

public class ExLimaBelasDrill{
	public static void main(String[] args){
		int age;
		Scanner keypress = new Scanner(System.in);

		System.out.print("How old are you? ");
		age = keypress.nextInt();
		if (age < 13) {
			System.out.println("\ttoo young to create Facebook account");
		}
		if (age < 16) {
			System.out.println("\ttoo young to get a driver license");
		}
		if (age < 18) {
			System.out.println("\ttoo young to get a tattoo");
		}
		if (age < 21) {
			System.out.println("\ttoo young to drink alcohol");
		}
		if (age < 35) {
			System.out.println("\ttoo young to run for President of the U.S.");
			System.out.println("\t\t(How sad!)");
		}
		if (age >= 13) {
			System.out.println("\told enough to create Facebook account");
		}
		if (age >= 16) {
			System.out.println("\told enough to get a driver license");
		}
		if (age >= 18) {
			System.out.println("\told enough to get a tattoo");
		}
		if (age >= 21) {
			System.out.println("\told enough to drink alcohol");
		}
		if (age >= 35) {
			System.out.println("\told enough to run for President of the U.S.");
		}
		if(age >= 65){
			System.out.println("You are old enough to retire!");
		}
		
	}
}

// Drill 1 = Nothing, because there is no conditions for that

