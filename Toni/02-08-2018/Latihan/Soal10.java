import java.util.*;

public class Soal10{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {0,0,80,49,0,13,57,0,0,61,0,72,0,34,26}, arr2 = new int[arr1.length];
		int terkecil = arr1[0], nilai, terkecilIndex = 0;

		for(int angka : arr1){
			System.out.print(angka+" ");
		}
		System.out.print("\n");
		for (int index = 0; index < arr2.length; index++) {
			for(int index2 = 0; index2 < arr1.length; index2++){
				if ((arr1[index2] < terkecil && arr1[index2] != 0) || terkecil == 0) {
					terkecil = arr1[index2];
					terkecilIndex = index2;
				}

			}
			arr2[index] = terkecil;
			terkecil = 0;
			arr1[terkecilIndex] = 0;
		}


		System.out.print("Bilangan berurut adalah : ");
		for(int angka : arr2){
			System.out.print(angka+" ");
		}
		
	}
}