import java.util.Scanner;

public class SoalNo4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,29 ,49};
		int[] arr2 = new int[10];
		int posisi , pengganti;
		

		for(int isi = 0 ; isi < arr1.length ; isi++){
			System.out.print(arr1[isi] + " , ");

		}
		System.out.println();

		System.out.println("Ganti bilangan pada Posisi ke :");
		posisi = input.nextInt();
		System.out.println("Masukan Nilai :");
		pengganti = input.nextInt();

		int index = posisi - 1;
		arr1[index] = pengganti;

		for(int isi = 0 ; isi < arr1.length ; isi++){
			System.out.print(arr1[isi] + " , ");
		}

				
		
	}	
}
		
