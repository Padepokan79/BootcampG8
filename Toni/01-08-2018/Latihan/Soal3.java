import java.util.*;

public class Soal3{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56,15,36,56,77,18,29,49}, arr2 = new int[10];
		int bilangan, hasil = 0;

		System.out.println("Arr1 :");
		for(int angka : arr1){
			System.out.print(angka+" ");
		}

		System.out.print("\nMasukan angka: ");
		bilangan = keyboard.nextInt();

		for(int index = 0; index < arr1.length; index++){
			if (bilangan == arr1[index]) {
				System.out.println("Bilangan "+ bilangan + " ada pada index ke "+index+" dan posisi ke "+(index+1));
				hasil = 1;
			}
		}

		if (hasil == 0) {
				System.out.println("Bilangan "+ bilangan + " tidak ditemukan di arr1.");
		}


		
	}
}