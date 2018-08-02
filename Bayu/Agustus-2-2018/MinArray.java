public class MinArray {
	public static void main( String[] args ) {
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 28, 29, 49};
		int jumlah = arr1[0];
		int posisi = 0;

		for ( int indeks =0; indeks < arr1.length; indeks++) {
            System.out.print( arr1[ indeks ]+ " ");
        }

		for (int nilai=1; nilai< arr1.length; nilai++ ){
			if (jumlah > arr1[nilai]) {
				jumlah = arr1[nilai]; posisi = nilai;
				posisi = posisi + 1;
			}
		}
		System.out.println(" ");
		System.out.println( "Bilangan Terkecil adalah = " +jumlah+ " pada posisi ke " +posisi);
	}
}