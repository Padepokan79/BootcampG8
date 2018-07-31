/*
Author : Muhamad Iqbal Farhan Maulana
*/
import java.util.Scanner;
public class ExDuaPuluhSatuDrill1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		

		System.out.println("First Name :");
		String first = keyboard.next();
		System.out.println("Last Name :");
		String last = keyboard.next();
		System.out.println("Gender M/F ");
		String gender = keyboard.next();
		System.out.println("Age :");
		int age = keyboard.nextInt();
		String title = "Error";	
		if(age < 20){
			title = first;
		}
		else{
			if(gender.equals("F")){
				System.out.println("Are you Married ? ," + first +"? (Y/N) : ");
				String married = keyboard.next();
				if(married.equals("Y")){
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			if(gender.equals("M")){
				title = ("Mr.");
			}
		}
		System.out.println("\n" + title + " " + last);
	}	
}