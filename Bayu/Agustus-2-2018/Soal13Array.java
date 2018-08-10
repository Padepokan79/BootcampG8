public class Soal13Array {
	public static void main ( String [] args ) {
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 25, 56 };
		int [] arr2 = new int [arr1.length];
		int posisi, posisi2;

		System.out.print("Arr1 = ");
		for ( int indeks = 0; indeks < arr1.length; indeks++) {
			System.out.print(arr1[indeks]+ " ");
		}

		for ( int nilai = 0; nilai < arr1.length; nilai++) {
			int temp;
			temp = arr1[arr1.length-nilai-1];
			arr2[nilai] = temp;
		}
		System.out.print("\nArr1 = ");
		for (int nilai=0;nilai<arr2.length; nilai++) {
			System.out.print(arr2[nilai]+ " ");
		}
	}
}