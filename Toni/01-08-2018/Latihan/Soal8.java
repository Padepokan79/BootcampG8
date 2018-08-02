import java.util.*;

public class Soal8{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 4, 56,15,36,56,77,18,29,49}, arr2 = new int[11];
		int terkecil = arr1[0], nilai;

		for(int angka : arr1){
			System.out.print(angka+" ");
		}
		System.out.print("\n");
		
		for(int angka : arr1){
			if (angka < terkecil || angka == 0) {
				terkecil = angka;
			}
		}


		System.out.print("Bilangan terkecil adalah " + terkecil);
		
	}
}