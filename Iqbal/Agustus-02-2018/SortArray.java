import java.util.Scanner;

public class SortArray{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,29 ,49};
		int[] arr2 = new int[11];
		int posisi , bilanganBaru;
		

		for(int isi = 0 ;isi < arr1.length ; isi++){
			System.out.print(arr1[isi] + " , ");

		}
		System.out.println();
		int nilaiTerbesar = 0;
		int indexTerbesar = 0 ;
		for(int index = 0 ; index < arr2.length ; index ++){


		for(int each = 0 ; each < arr1.length ; each++){
			int temp = arr1[each] ;
			if(temp > nilaiTerbesar){
				nilaiTerbesar = temp ;
				indexTerbesar = each ;
					
			}			

		}
		arr2[index] = nilaiTerbesar ;
		arr1[indexTerbesar] = 0 ;
		nilaiTerbesar = 0;
		}
		for(int tampil = 0 ; tampil < arr2.length ; tampil++){
			int nilai = arr2[tampil];
			if(nilai != 0){
				System.out.println(arr2[tampil]);
			}	
		}
		
		

						
		
	}	
}
		
