import java.util.*;
public class Soal4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		String answer;
		int valid = 0, shift = 0;

		showArray(deretAngka);
		System.out.print("\n");

		do{
			System.out.print("Shift ke kiri Sebanyak : ");
			answer = input.next();
			if (!answer.matches("[0-9]+")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali.");
			}else{
				shift = Integer.parseInt(answer);
				if(shift < 1){
					System.out.println("Maaf, Pergeseran tidak boleh kurang dari 1.\nSilahkan input kembali.");
				}else if(shift > 10){
					System.out.println("Maaf, Pergeseran tidak boleh lebih dari 10.\nSilahkan input kembali.");
				}else{
					valid = 1;
				}
			}
		}while(valid != 1);

		int[] newarray = shiftLeft(shift, deretAngka);
		showArray(newarray);
			
	}

	public static int[] shiftLeft(int shift, int[] array){
		int[] tempArray = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			if (index < shift) {
				tempArray[(array.length - shift) + index] = array[index]; 
			}else{
				tempArray[index-shift] = array[index];
			}
		}
		return tempArray;
	}

	public static void showArray(int[] array){
		System.out.print("{");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index]);
			if(index != array.length-1) System.out.print(", ");
		}
		System.out.print("}");
	}
}