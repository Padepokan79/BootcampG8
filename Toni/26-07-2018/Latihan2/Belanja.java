import java.util.*;
public class Belanja{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int totalBelanja;

		System.out.print("Berapa total belanja anda ? ");
		totalBelanja = input.nextInt();

		if (totalBelanja > 100000) {
			System.out.println("\nSelamat anda mendapatkan sebuah Payung cantik");
		}else{
			System.out.println("\nJika anda berbelanja lebih dari 100.0000 anda akan mendapatkan sebuah Payung");
		}

	}
}