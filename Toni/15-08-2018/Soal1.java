import java.util.*;
public class Soal1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String length;
		int valid = 0, len = 0;

		do{
			System.out.print("Jumlah urutan angka Fibonacci yang akan ditampilkan : ");
			length = input.next();
			if (!length.matches("[0-9]+")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali.");
			}else{
				len = Integer.parseInt(length);
				if(len < 5){
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 5.\nSilahkan input kembali.");
				}else if(len > 100){
					System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari 100.\nSilahkan input kembali.");
				}else{
					valid = 1;
				}
			}
		}while(valid != 1);

		fibonaci(len);
			
	}

	public static void fibonaci(int length){
		double[] temp = {0, 0, 1};

		for (int index = 0; index < length; index++) {
			System.out.print(temp[2]);
			if(index != length-1) System.out.print(", ");
			temp[0] = temp[1];
			temp[1] = temp[2];
			temp[2] = temp[0] + temp[1];
		}
	}
}