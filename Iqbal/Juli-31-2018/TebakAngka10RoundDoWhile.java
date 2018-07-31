import java.util.Scanner;
import java.util.Random;

public class TebakAngka10RoundDoWhile{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random acak = new Random();

		int round = 1 , skorPlayer = 0 ;
		 int kesempatan = 1; 
		do {
			System.out.println("Tebak Angka Ronde : "+round);
			System.out.println("Komputer akan Mengacak angka 1-10 tebak dalam 3 kesempatan");
			int angkaKomputer = acak.nextInt(10)+1; 
			System.out.println("Jawaban "+angkaKomputer);
			int jawaban = input.nextInt();

			do{
			if(jawaban != angkaKomputer){
				if(kesempatan<3){
				System.out.println("Angka Yang Kamu tebak salah");
				System.out.println("Kamu masih punya : "+(3-kesempatan)+" Kesempatan ");
				System.out.println("Silahkan Jawab Lagi");
				jawaban = input.nextInt();
				kesempatan++ ;
				}
				else{
					System.out.println("Kesempatan Habis");
					kesempatan++ ;
				}
			}
			else{
				System.out.println("Angka Yang Kamu Tebak Benar");
				skorPlayer ++ ;
				kesempatan += 3;
			}

		}while(kesempatan < 3);
			kesempatan = 1;		
			System.out.println("Round : "+ round +" Selesai Next Round !");
			System.out.println("==========================================");
			round+= 1;
		}while (round <= 10);

		String pemenang = "";
		if(skorPlayer>5){
			pemenang = "Player";
		}
		else if(skorPlayer<5){
			pemenang = "Komputer";
		}
		else{
			pemenang = "Draw";
		}
		System.out.println("skor kamu = "+skorPlayer);	
		System.out.println("Round Selesai pemenangnya "+ pemenang);
	}
}