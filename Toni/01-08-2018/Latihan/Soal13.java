import java.util.*;

public class Soal13{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 4, 56,15,36,56,77,18,29,49}, arr2 = new int[10];
		int index1, index2, temp;

		for(int angka : arr1){
			System.out.print(angka+" ");
		}
		
		System.out.print("\n\nMasukan possisi asal : ");
		index1 = (keyboard.nextInt())-1;
		System.out.print("Masukan possisi tujuan : ");
		index2 = (keyboard.nextInt())-1;
		
		temp = arr1[index1];
		arr1[index1] = arr1[index2];
		arr1[index2] = temp;

		System.out.print("\n");
		for(int angka : arr1){
			System.out.print(angka+" ");
		}
		
	}
}