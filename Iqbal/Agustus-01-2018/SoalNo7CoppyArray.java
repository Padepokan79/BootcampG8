public class SoalNo7CoppyArray{
	public static void main(String[] args) {
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,29 ,49};
		int[] arr2 = new int[10];

		arr2 = arr1 ;

		for(int isi = 0 ; isi < arr1.length ; isi ++){
			arr2[isi] = arr1[isi];
		}

		for(int satu : arr1 ){
			System.out.print("Array ke 1 :" + satu);
		}
		System.out.println();
		for(int dua : arr2 ){
			System.out.print("Array ke 2 :" + dua);
		}
	}
}