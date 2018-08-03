import java.util.*;

public class Drill{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int pin = 12345, entry; 
		String password = "oldwest", passinput;

		System.out.print("WELCOME TO THE BANK OF JAVA");
		System.out.print("ENTER YOUR PASSWORD:  ");
		passinput = input.next();

		while(! passinput.equals(password)){
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.print("ENTER YOUR PASSWORD:  ");
			passinput = input.next();
		}

		System.out.print("ENTER YOUR PIN:  ");
		entry = input.nextInt();

		while(entry != pin){
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN:  ");
			entry = input.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");

	}
}