import java.util.Scanner;

public class SoalNo5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,29 ,49};
		int[] arr2 = new int[9];
		int posisi , pengganti;
		

		for(int isi = 0 ; isi < arr1.length ; isi++){
			System.out.print(arr1[isi] + " , ");

		}
		System.out.println();

		System.out.println("Hapus bilangan pada Posisi ke :");
		posisi = input.nextInt();		
		int index = posisi - 1;
		int isiArr = 0 ;
		for(int isi = 0 ; isi < arr1.length ; isi++){
			int temp = arr1[isi];
			
			if(isi != index){
				arr2[isiArr] = temp ;
				isiArr++;
			}
			
		}

		arr1 = new int[9];

		for(int isi = 0 ; isi < arr1.length ; isi ++){
			arr1[isi] = arr2[isi];
		}

		for(int isi = 0 ; isi < arr1.length ; isi ++){
			System.out.println(arr1[isi] + " ");
		}
				
		
	}	
}
		
