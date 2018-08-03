import java.util.Scanner;

public class SoalNo6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,29 ,49};
		int[] arr2 = new int[11];
		int posisi , bilanganBaru;
		

		for(int isi = 0 ; isi < arr1.length ; isi++){
			System.out.print(arr1[isi] + " , ");

		}
		System.out.println();

		System.out.println("Sisipkan bilangan pada Posisi ke :");
		posisi = input.nextInt();
		System.out.println("Nilai Bilangan ");
		bilanganBaru = input.nextInt();

		int index = posisi - 1;
		int isiArr = 0 ;
		for(int isi = 0 ; isi < arr2.length ; isi++){
			if(isi < index){			
				int temp = arr1[isi];
				arr2[isiArr] = temp ;
				isiArr++;
			}
			else if(isi == index){
				int temp = arr1[isi];			
				arr2[isiArr] = bilanganBaru	 ;
				isiArr++;	
			}
			else{
				int temp = arr1[isi-1];			
				arr2[isiArr] = temp ;
				isiArr++;
			}
			
		}

		arr1 = new int[11];

		for(int isi = 0 ; isi < arr1.length ; isi ++){
			arr1[isi] = arr2[isi];
		}

		for(int isi = 0 ; isi < arr1.length ; isi ++){
			System.out.print(arr1[isi] + " ");
		}
				
		
	}	
}
		
