import java.util.*;

public class Soal4{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int start, end;

		System.out.print("Enter Starting number ");
		start = keyboard.nextInt();
		System.out.print("Enter Ending number ");
		end = keyboard.nextInt();

		if (start <= 1) start++;
		System.out.print("\nPrime Number Between "+start+"-"+end+" is > ");
		for (; start <= end; start++) {
			if (isPrime(start)) {
				System.out.print(start+" ");				
			}
		}
	}

	public static boolean isPrime(int number){
		for(int n = 2; n*2 < number; n++){
			if (number%n == 0) {
				return false;
			}
		}
		return true;
	}
}