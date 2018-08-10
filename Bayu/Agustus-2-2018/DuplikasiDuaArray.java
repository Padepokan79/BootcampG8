public class DuplikasiDuaArray { 
 public static void main(String args []){
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 28, 29, 49};
		int [] arr2 = {25, 39, 47, 14, 36, 56, 57, 49, 43, 25};

		System.out.print( "arr1 ");
		for ( int indeks = 0; indeks<arr1.length; indeks++){
			System.out.print (arr1[indeks]+ " ");
		}

		System.out.print( "\narr2 ");
		for ( int temp = 0; temp<arr2.length; temp++){
			System.out.print (arr1[temp]+ " ");
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