import java.util.Scanner;

public class SoalNo10{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,25 ,56};
		int[] arr2 = new int[11];
		int posisi , bilanganBaru;
		boolean 

		for(int isi = 0 ; isi < arr1.length ; isi++){
			System.out.print(arr1[isi] + " , ");

		}
		System.out.println();
		
		for(int index = 0 ; index < arr1.length ; index ++){
			int temp = arr1[index];
			//System.out.println(temp);
			for(int index1 = index+1 ; index1 < arr1.length ; index1++){
				int temp1 = arr1[index1];	
				if(temp1 == temp){
					System.out.println(temp + "Duplikat");
					for(index3 = 0 ; index3 < arr2.length ; index3++){
						int temp3 = arr2[index3];
						if(temp != temp3){

						}
					}
				}
			}

		}
		

						
		
	}	
}
		
