import java.util.Random;
public class SoalNo7{
	public static void main(String[] args) {
		Random acak = new Random();
		int[] arr = new int[9];
		for(int index = 0 ; index < arr.length ; index++ ){
			arr[index] = acak.nextInt(10);
		}
		int indexPertama = 0 ;

		for(int baris = 1 ; baris <=3 ; baris++ ){
			for(int kolom = 0 ; kolom < 3 ; kolom++){
				System.out.print(arr[indexPertama]+" ");
				indexPertama++;
			}
			System.out.println();
		}
	}
}