import java.util.*;
public class Soal2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String length;
		int valid = 0, len = 0;

		do{
			System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
			length = input.next();
			if (!length.matches("[0-9]+")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali.");
			}else{
				len = Integer.parseInt(length);
				if(len < 2){
					System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2.\nSilahkan input kembali.");
				}else if(len > 20){
					System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20.\nSilahkan input kembali.");
				}else{
					valid = 1;
				}
			}
		}while(valid != 1);

		pascal(len);
			
	}

	public static void pascal(int length){
		int[][] number = new int[length][length];
		number[0][0] = 1;
		System.out.println(number[0][0]);
		for (int level = 1; level < length; level++) {
			for (int stage = 0; stage <= level; stage++) {
				//System.out.print(level+" "+stage);
				if (stage > 0 && stage < level) {
					number[level][stage] = number[level-1][stage] + number[level-1][stage-1];
				}else{
					number[level][stage] = 1;
				}
				System.out.print(number[level][stage]+" ");
			}
			System.out.print("\n");
		}
	}
}