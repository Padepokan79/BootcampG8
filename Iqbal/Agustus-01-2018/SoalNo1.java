public class SoalNo1{
	public static void main(String[] args) {
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,29 ,49};
		int[] arr2 = new int[10];
		int jumlahArray = 0;
		arr2 = arr1 ;

		for(int isi = 0 ; isi < arr1.length ; isi ++){
			int tempJumlah = arr1[isi];
			jumlahArray += tempJumlah;
		}
		double rataRata = jumlahArray/arr1.length ;
		System.out.println("jumlah Isi Array adalah " + jumlahArray);
		System.out.println("Rata Rata Array adalah " + rataRata);

		
		


	}
}