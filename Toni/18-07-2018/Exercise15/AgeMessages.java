import java.util.Scanner;

public class AgeMessages{
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
		
	}
}