import java.util.*;

public class Soal4{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56,15,36,56,77,18,29,49}, arr2 = new int[10];
		int posisi, nilai;

		System.out.print("Ganti bilangan pada posisi : ");
		posisi = keyboard.nextInt();
		System.out.print("Masukan Nilai : ");
		nilai = keyboard.nextInt();

		arr1[posisi-1] = nilai;

		for(int angka : arr1){
			System.out.print(angka+" ");
		}


		
	}
}