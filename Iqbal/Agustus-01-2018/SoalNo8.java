import java.util.Scanner;

public class SoalNo8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,29 ,49};
		int[] arr2 = new int[11];
		int posisi , bilanganBaru;
		

		for(int isi = 0 ; isi < arr1.length ; isi++){
			System.out.print(arr1[isi] + " , ");

		}
		System.out.println();
		int nilaiTerkecil = 999999;
		for(int each = 0 ; each < arr1.length ; each++){
			int temp = arr1[each] ;
			if(temp < nilaiTerkecil){
				nilaiTerkecil = temp ;
			}
		}
		System.out.println("Nilai terkecilnya adalah " + nilaiTerkecil);
		

						
		
	}	
}
		
