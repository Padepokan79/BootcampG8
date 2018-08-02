public class Soal11 {
	public static void main ( String args [] ) {
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 25, 56 };
		int [] arr3 = {25, 39, 47, 14, 36, 56, 57, 49, 43, 25 };
		int indeks, indeks2, banding1, banding2;

		System.out.print ( "Arr1 = ");
		for ( indeks = 0; indeks < arr1.length; indeks++) {
			System.out.print ( arr1[indeks]+ " " );
		}

		System.out.print ("\nArr2 = ");
		for ( indeks2 = 0; indeks2 < arr3.length; indeks2++) {
			System.out.print ( arr3[indeks2]+ " " );
		}
		System.out.print("\n-------------------------\nAngka yang sama = ");
		for ( banding1 = 0; banding1 < arr1.length; banding1++){
			for ( banding2 = 0; banding2 < arr3.length; banding2++){
				if ( arr1[banding1] == arr3[banding2])
					System.out.print(arr1[banding1]+ " ");
			}
		}
	}
}