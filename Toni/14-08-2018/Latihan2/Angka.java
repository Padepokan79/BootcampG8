import java.util.*;
public class Angka{
	public static Scanner input = new Scanner(System.in); 
	public static void main(String[] args){
		int[] inc1  = {4, -2}, inc2 = {10, -5}, inc3 = {-3, 5}, inc4 = {1, 2, 3};
		System.out.println("\n  -------   \n  Angka 1 \n");
		angka1(6);
		System.out.println("\n\n  -------   \n  Angka 2 \n");
		angka2(6);
		System.out.println("\n\n  -------   \n  Angka 3 \n");
		angka3(6);
		System.out.println("\n\n  -------   \n  Angka 4 \n");
		angka4567(10, 1, inc1);
		System.out.println("\n\n  -------   \n  Angka 5 \n");
		angka4567(10, 2, inc2);
		System.out.println("\n\n  -------   \n  Angka 6 \n");
		angka4567(10, 5, inc3);
		System.out.println("\n\n  -------   \n  Angka 7 \n");
		angka4567(10, 1, inc4);
		System.out.println("\n\n  -------   \n  Angka 8 \n");
		angka8(3);
		System.out.println("\n\n  -------   \n  Angka 9 \n");
		angka9(5, 70);
		System.out.println("\n\n  -------   \n  Angka 10 \n");
		angka10();
	}

	// Angka 1 : Rep as much
	public static void angka1(int length){
		for (int number = 1; number <= length; number++) {
			for (int rep = 0; rep < number; rep++) {
				System.out.print(number);
			}
		}
	}

	// Angka 2 : Rep as much Reverse
	public static void angka2(int length){
		for (int number = length; number > 0; number--) {
			for (int rep = 0; rep < number; rep++) {
				System.out.print(number);
			}
		}
	}

	// Angka 3 : Rep as long
	public static void angka3(int length){
		for (int number = 1; number <= length; number++) {
			for (int rep = 0; rep < number; rep++) {
				System.out.print(rep+1);
			}
		}
	}

	// Angka 456 : repating pattern
	public static void angka4567(int length, int number, int[] increnment){
		for (int rep = 0; rep < length; rep++) {
			System.out.print(number+", "); 
			number += increnment[rep%increnment.length];
		}
	}

	// Angka 8 : Factorial
	public static void angka8(int factorial){
		int total = 1;
		System.out.print(factorial+"! = "); 
		for (int rep = 0; rep < factorial; rep++) {
			System.out.print((factorial - rep)); 
			if (rep != factorial-1) System.out.print(" x ");
			total = total* (factorial-rep);
		}
		System.out.print(" = "+total);
	}

	// Angka 9 : Dibagi habis
	public static void angka9(int awal, int akhir){
		System.out.println("Angka yang dibagi habis 4 :"); 
		for (int rep = awal; rep <= akhir; rep++) { 
			if (rep % 4 == 0) System.out.print(rep+" ");
		}
	}

	// Angka 10
	public static void angka10(){
		String kalimat; 
		System.out.print("Masukan Kalimat ");
		kalimat = input.nextLine();
		System.out.print("Panjang Kalimatnya adalah : "+kalimat.length());
	}



}