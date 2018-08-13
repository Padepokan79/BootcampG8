public class JumlahArray {
	public static void main(String args[] ){

		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int jumlah = 0;
		int rataRata = 0;

		for ( int i = 0; i < arr1.length; i++) {
			jumlah = jumlah + arr1.length;

		}

		rataRata = jumlah / arr1.length;
		System.out.println("==============================");
		System.out.println( "int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49");
		System.out.println("Jumlah = " +jumlah);
		System.out.println("Rata-rata = " +rataRata);
	}
}