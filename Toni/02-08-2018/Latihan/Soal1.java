import java.util.*;

public class Soal1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int start, end;

		System.out.print("Enter Starting number ");
		start = keyboard.nextInt();
		System.out.print("Enter Ending number ");
		end = keyboard.nextInt();

		if (start % 2 == 0) start++;
		System.out.print("\nOdd Number Between "+start+" - "+end+" is ");
		for (; start <= end; start+=2) {
			System.out.print(start+" ");
		}


	}
}