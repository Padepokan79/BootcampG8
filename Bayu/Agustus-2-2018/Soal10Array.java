public class Soal10Array {
	public static void main ( String [] args ) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 25, 56};

		for ( int indeks =0; indeks < arr1.length; indeks++) {
            System.out.print( arr1[ indeks ]+ " ");
        }

        System.out.println(" ");
        System.out.print("Nilai yang sama adalah : ");
        for ( int banding1 = 0; banding1 < arr1.length; banding1++) {
        	for ( int banding2 = banding1 + 1; banding2 < arr1.length; banding2++) {
        		if ( arr1[banding1] == (arr1[banding2]) ) {
        			System.out.print(" ");
        			System.out.print(arr1[banding1]+ " ");
        		}
        	}
        }
	}
}