import java.util.*;

public class Soal5{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56,15,36,56,77,18,29,49}, arr2 = new int[9];
		int posisi, nilai;

		for(int angka : arr1){
			System.out.print(angka+" ");
		}
		System.out.print("\n");
		System.out.print("Hapus bilangan pada posisi : ");
		posisi = keyboard.nextInt();

		for(int index = 0; index < (arr1.length -1); index++){
			if (index >= posisi-1) {
				arr2[index] = arr1[index+1];
			}else{
				arr2[index] = arr1[index];
			}
		}

		arr1 = arr2;

		for(int angka : arr1){
			System.out.print(angka+" ");
		}


		
	}
}