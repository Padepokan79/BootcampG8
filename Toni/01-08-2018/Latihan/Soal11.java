import java.util.*;

public class Soal11{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 6, 56, 77, 18, 25, 56}, duplicate = new int[10],
		arr3 = {25, 39, 47, 14, 36, 56, 57, 49, 25, 79};
		int duplicated = 0;
		boolean duplicateexist = false;

		
		System.out.print("\n");
		
		for(int index = 0; index < arr1.length; index++){
			for (int togo = 0; togo < arr1.length; togo++) {
				duplicateexist = false;
				if (arr1[index] == arr3[togo]) {
					if (duplicated != 0) {
						for (int duplicateIndex = 0; duplicateIndex < duplicate.length; duplicateIndex++) {
							if (arr1[togo] == duplicate[duplicateIndex]) {
								duplicateexist = true;
							}
						}
					}
					if (duplicateexist == false) {
						duplicate[duplicated] = arr1[index];
					}
					duplicated++;
				}
			}
		}

		System.out.print("Angka yang diduplikasi adalah : ");
		for(int angka : duplicate){
			if (angka != 0)
			System.out.print(angka+" ");
		}		
	}
}