import java.util.Scanner;
public class ClubBouncer{
	public static void main(String[] args){
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
			System.out.println("You are allowed to enter the club");
			System.out.println("Clint Eastwood");
		}
		else {
			System.out.println("You are not allowed to enter the club");
		}
	}
}

//Drill 1 : int wont print because the condition doesnt meet.
 