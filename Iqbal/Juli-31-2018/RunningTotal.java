import java.util.Scanner ;

public class RunningTotal{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int current, total = 0 ;

		System.out.print("Type in a bunch of Values and i'll add temp up. ");
		System.out.println("i'll stop when you type a zero");
		do{
			System.out.println("Value : ");
			current = keyboard.nextInt();
			total += current;

			System.out.println("The Total So far is: " + total);
		}
		while(current != 0);

		System.out.println("The Final Total is : " + total);	 
	}
}