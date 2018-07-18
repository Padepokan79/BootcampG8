import java.util.Scanner;

public class ExLimaBelasDrill3{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int age ;
		System.out.println("How Old are you ?");
		age = keyboard.nextInt();

		System.out.println("You are :");
		if (age < 13){
			System.out.println("\ttoo young to create a facebook account ");

		}
		if (age >= 13){
			System.out.println("\told enough to create facebook account");
		}
		if (age < 16 ){
			System.out.println("\ttoo young to get Driver License");

		}
		if(age >= 16){
			System.out.println("\told enough to get Driver License");
		}
		if (age < 18 ){
			System.out.println("\ttoo young to get a tatto");
		}
		if (age >= 18){
			System.out.println("\told enough to get a tatto");
		}

		if (age < 21 ) {
			System.out.println("\ttoo young to drink alcohol");
		}
		if (age >= 21){
			System.out.println("\told enough to drink alcohol");
		}
		if (age < 35){
			System.out.println("\ttoo young to run for president of the U.S.");
			System.out.println("\t\t (How Sad !)");
		}
		if (age >= 35 && age <= 65) {
			System.out.println("\told enough to run for presidento of the U.S");
			System.out.println("\t (Lets Happy!)");
			
		}
		if (age >= 65){
			System.out.println("You are old enough to retire!");
		}

	}

}