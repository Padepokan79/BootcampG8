import java.util.*;

public class Soal9{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 4, 56,15,6,56,77,18,29,49}, arr2 = new int[11];
		int terbesar = 0, nilai;

		for(int angka : arr1){
			System.out.print(angka+" ");
		}
		System.out.print("\n");
		
		for(int angka : arr1){
			if (angka > terbesar) {
				terbesar = angka;
			}
		}


		System.out.print("Bilangan terbesar adalah " + terbesar);
		
	}
}