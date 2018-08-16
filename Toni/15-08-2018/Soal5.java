import java.util.*;
public class Soal5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int valid = 0;
		int[] answer = new int[2], angka1 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[][] hilow = {{0, 100}, {1, 10}};
		
		String temp;
		String[][] keyword = {{"", ""},{"Angka yang ingin disisipkan", "Posisi Angka"}};

		showArray(angka1);
		System.out.print("\n");

		for (int questions = 0; questions < keyword[0].length; questions++) {
			valid = 0;	
			do{
				System.out.print("Masukan "+keyword[0][questions]+" "+keyword[1][questions]+" : ");
				temp = input.next();
				if (!temp.matches("[0-9]+")) {
					System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali.\n");
				}else{
					answer[questions] = Integer.parseInt(temp);
					if(answer[questions] < hilow[questions][0]){
						System.out.println("Maaf, "+keyword[0][questions]+" "+keyword[1][questions]+" tidak boleh kurang dari "+hilow[questions][0]+".\nSilahkan input kembali.\n");
					}else if(answer[questions] > hilow[questions][1]){
						System.out.println("Maaf, "+keyword[0][questions]+" "+keyword[1][questions]+" tidak boleh lebih dari "+hilow[questions][1]+".\nSilahkan input kembali.\n");
					}else{
						valid = 1;
					}
				}
			}while(valid != 1);
		}

		int[] newarray = addNumber(answer[0], answer[1]-1, angka1);
		showArray(newarray);
			
	}

	public static int[] addNumber(int number, int position, int[] array){
		int[] tempArray = new int[array.length+1];
		for (int index = 0; index < tempArray.length; index++) {
			if (index < position) {
				tempArray[index] = array[index];
			}else if(index == position){
				tempArray[index] = number;
			}else{
				tempArray[index] = array[index-1];
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