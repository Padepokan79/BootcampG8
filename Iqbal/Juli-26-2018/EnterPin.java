import java.util.Scanner ;
public class EnterPin{
	public static void main(String[] args){
		Scanner keyboard = new Scanner (System.in) ; 

		int pin  , entry ;
		String password ;
		pin = 123456;
		System.out.println("WELCOME TO THE BANK OF JAVA");
		System.out.println("Enter Your Password ");
		

		System.out.println("Enter Your Pin");

		entry = keyboard.nextInt();

		while ( entry != pin ){
			System.out.println("\n INCORRECT PIN. TRY AGAIN " );
			System.out.println("\n Enter Your Pin");
			entry = keyboard.nextInt();
		}

		System.out.println("\n PIN ACCEPT , YOUT ACCOUNT BALANCE  IS $12312412 , 90");

	}
}