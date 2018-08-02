public class DuplikasiArray { 
 public static void main(String args []){
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 28, 29, 49};

		System.out.print( "arr1 ");
		for ( int indeks = 0; indeks<arr1.length; indeks++){
			System.out.print (arr1[indeks]+ " ");
		}

		System.out.print("Data angka yang sama adalah ");

		for ( int nilai = 0; nilai<arr1.length; nilai++){
			for ( int banding = 0; banding<arr2.length; banding++){
				if ( arr1[nilai] == arr2[banding]) {
				System.out.print(arr1[nilai]+ " ");
			}
			}
		}

	}
}