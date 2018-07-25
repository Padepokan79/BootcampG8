import java.util.Scanner ;
public class Belanja{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Untuk melihat hadiah Masukan Jumlah belanjaan Kamu : ");
		int belanja = input.nextInt();
		if(belanja > 100000){
			System.out.println("Selamat kamu mendapat sebuah payung");
		}
		else {
			System.out.println("Maaf Kamu Tidak Mendapat hadiah");
		}


	}
	
}