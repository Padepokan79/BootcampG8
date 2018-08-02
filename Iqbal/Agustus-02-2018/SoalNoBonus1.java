import java.util.Scanner;

public class SoalNoBonus1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,25 ,56};
		int[] arr2 = new int[11];
		int posisi1 , posisi2 , simpan , index1 , index2 ,  nilai1 , nilai2 , nilai3 ;

		for(int isi = 0 ; isi < arr1.length ; isi++){
			System.out.print(arr1[isi] + " , ");

		}
		System.out.println();
		
		System.out.println("Tukar Nilai Pada Posisi Ke :");
		posisi1 = input.nextInt();
		System.out.println("Dengan Nilai Pada Posisi ke :");
		posisi2 = input.nextInt();

		index1 = posisi1-1;
		index2 = posisi2-1;
		nilai1 = arr1[index1];
		nilai2 = arr1[index2];
		simpan = nilai1;
		nilai1 = nilai2;
		nilai2 = simpan ;		
		arr1[index1] = nilai1;
		arr1[index2] = nilai2; 
		for(int isi = 0 ; isi < arr1.length ; isi++){
			System.out.print(arr1[isi] + " , ");

		}

								
	}	
}
		
