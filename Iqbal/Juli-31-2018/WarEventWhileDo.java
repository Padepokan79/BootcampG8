import java.util.Scanner;
import java.util.Random;

public class WarEventWhileDo{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();	

		int level , hpPlayer , dammagePlayer , hpBoss , dammageBoss , hit , totalDammagePlayer; ;
		System.out.println("============================================");
		System.out.println("====      Welcome To L.Y.T.A Game       ====");
		System.out.println("============================================");	
		System.out.println("Silahkan Masukan Level Kamu :");
		level = input.nextInt()	;
		if(level < 50 ){
			System.out.println("Maaf Level Kamu Belum Cukup Untuk MEngikuti Event ini");
		}
		else{
			hpPlayer = level*100+(rand.nextInt(1801)+200);			
			hpBoss = 2*hpPlayer+(rand.nextInt(2001)+1000);

			System.out.println("Hp Kamu : "+ hpPlayer);
			System.out.println("Hp Boss : "+ hpBoss);

			totalDammagePlayer = 0;
			hit = 1 ;
			do{
				dammagePlayer = level*10+(rand.nextInt(801)+200);
				dammageBoss = (hpPlayer*6/100)+(rand.nextInt(301)+200);
				System.out.println("Hit ke : " + hit);
				System.out.println("Dammage kamu : "+ dammagePlayer);
				System.out.println("Dammage Boss : "+ dammageBoss);

				hpPlayer -= dammageBoss ;
				hpBoss   -= dammagePlayer;
				hit ++ ;
				totalDammagePlayer += dammagePlayer ;

				System.out.println("Sisa Hp kamu : "+ hpPlayer);
				System.out.println("Sisa Hp Boss : "+ hpBoss);

				if(hpPlayer<1 ){
					System.out.println("Game Selesai");
					hit = -1;
				}
				if(hpBoss <1){
					System.out.println("Boss Kalah Kamu Dapat Legendari Weapon");
					hit = -1;
				}
			}while (hit >0) ;

			System.out.println("Total Dammage Kamu : " + totalDammagePlayer);
				if(totalDammagePlayer >= 1000 ){
					System.out.println("Selamat Kamu Dapat Elixir 1x");
				}
				if(totalDammagePlayer >= 12001 ){
					System.out.println("Selamat Kamu Dapat Potion 1x");	
				}
				if(totalDammagePlayer >= 14001 ){
					System.out.println("Selamat Kamu Dapat Gold 999K");
				}
				if(totalDammagePlayer >= 16001 ){
					System.out.println("Selamat Kamu Dapat Fragmen Legendari Weapon 1x");
				}
					
				int hadiahTambahan = totalDammagePlayer/5000;
					System.out.println("Selaman kamu mendapatkan Epic item (" +hadiahTambahan+")");

		}
	}
}