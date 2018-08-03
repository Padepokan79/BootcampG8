import java.util.*;
public class TebakRound{
	public static void main(String[] args){
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		int nilai, round = 10, score = 0, tebak, kesempatan = 3;
		String jawaban = "kalah", grade = "Amateur";
		for(;round > 0;round--){	
			System.out.println("====================\n=     ROUND  "+(11 - round)+"     =\n====================");			
			kesempatan = 3;
			nilai = random.nextInt(10)+1;
			System.out.println("Angka yang benar adalah: "+nilai);
			for(; kesempatan > 0; kesempatan --){
				System.out.print("Tebak Angka : ");
				tebak = keyboard.nextInt();
				if (tebak == nilai) {
					jawaban = "Menang";
					kesempatan = 0;
					score++;				
				}else { System.out.println("Jawaban anda salah"); }
			}
			System.out.println("!!! Anda "+jawaban+" !!!");
			System.out.println("Jawaban yang benar adalah "+nilai+"\n");
		}

		if(score <= 7) grade = "Amateur";
		else if(score == 8) grade = "Advanced";
		else if(score == 9) grade = "Professional"; 
		else if(score == 10) grade = "Hacker"; 

		System.out.println("Anda Menebak "+score+" Angka dengan benar");
		System.out.println("Anda adalah seorang \""+grade+"\" Player");


	}
}