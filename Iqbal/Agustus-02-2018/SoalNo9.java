import java.util.Scanner;
public class SoalNo9{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan Jumlah Baris");
		int baris = input.nextInt();

		for(int jumlahBaris = 0 ; jumlahBaris < baris ; jumlahBaris++){
			for(int jumlahSpasi = baris ; jumlahSpasi > jumlahBaris ; jumlahSpasi--){
				System.out.print(" ");
			}
			for(int jumlahPagar = 0 ; jumlahPagar < jumlahBaris+1 ; jumlahPagar++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}