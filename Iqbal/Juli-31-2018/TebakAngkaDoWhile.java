import java.util.Scanner;
import java.util.Random;

public class TebakAngkaDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random acak = new Random();

		System.out.println("Komputer akan merandom angka dari 1-10 ");
		int angkaKomputer = acak.nextInt(10)+1;		
		System.out.println("Silah Kan Kamu Tebak Dengan 3 Kali Kesempatan");
		System.out.println("Jawaban Kamu : ");
		int jawaban = input.nextInt();
		int round = 1;
		do{
			if(jawaban != angkaKomputer){
				System.out.println("Angka Yang Kamu tebak salah");
				System.out.println("Kamu masih punya : "+(3-round)+" Kesempatan ");
				System.out.println("Silahkan Jawab Lagi");
				jawaban = input.nextInt();
				round++;
			}
			else{
				System.out.println("Angka Yang Kamu Tebak Benar");
				round += 3;
			}	
		}while(round < 3);
		
		System.out.println("Round Selesai");

	}
}