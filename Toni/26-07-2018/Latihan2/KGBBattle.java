import java.util.*;

public class KGBBattle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int hpPlayer = 100, hpComputer = 100, apPlayer, apComputer, dpPlayer, dpComputer;
		String atComputer, atPlayer;
		String[] attack = {"K", "G", "B"}; 

		//Title
		System.out.println("==============================\n          KGB Battle");

		int round = 1;
		while(round > 0){
			//Round Start
			System.out.println("==============================\n            Round "+round+"\n==============================");

			//Computer turn
			atComputer = attack[rand.nextInt(3)];
			apComputer = rand.nextInt(9)+2;
			System.out.println("\nComputer Memilih Serangan .. "+atComputer);
			System.out.println("Attack :" + apComputer);
			System.out.println("Deffense :" + (10 - apComputer));

			//Player Turn
			System.out.print("\nPilih tipe Serangan anda (K/G/B) ");
			atPlayer = input.next();
			System.out.print("Tentukan Attack (2-10) : ");
			apPlayer = input.nextInt();
			System.out.print("Deffense : " + (10 - apPlayer));
			
			//Battle
			System.out.println("\n==============================\n          Battle Start\n==============================");
			System.out.println(" '"+atComputer+"' VS '"+atPlayer+"'");

			// If Player win
			if ((atPlayer.equals("K") && atComputer.equals("B")) || (atPlayer.equals("B") && atComputer.equals("G")) || (atPlayer.equals("G") && atComputer.equals("K"))) {
				System.out.println(" Player win with "+atPlayer);
				System.out.println(" Player deal "+apPlayer+" Damage");
				System.out.println(" Computer use Deffense (Damage -"+(10 - apComputer)+")");
				apPlayer -= (10 - apComputer);
				if(apPlayer >= 7){
					System.out.println(" Player deal Critical Damage (Damage +2)");
					apPlayer += 2;
				}
				if (apPlayer <= 0) { 
					apPlayer = 2; 
					hpComputer += apPlayer;
					System.out.println(" Computer Successfully Deffense Attack !!");
					System.out.println(" Computer HP +"+apPlayer);
				}else{
					hpComputer -= apPlayer;
					System.out.println(" Computer HP -"+apPlayer);
				}
			}

			// If Computer win
			else if ((atPlayer.equals("B") && atComputer.equals("K")) || (atPlayer.equals("G") && atComputer.equals("B")) || (atPlayer.equals("K") && atComputer.equals("G"))) {
				System.out.println(" Computer win with "+atComputer);
				System.out.println(" Computer deal "+apComputer+" Damage");
				System.out.println(" Player use Deffense (Damage -"+(10 - apPlayer)+")");
				apComputer -= (10 - apPlayer);
				if(apComputer >= 7){
					System.out.println(" Player deal Critical Damage (Damage +2)");
					apComputer += 2;
				}
				if (apComputer <= 0) { 
					apComputer = 2; 
					hpPlayer += apComputer;
					System.out.println(" Computer Successfully Deffense Attack !!");
					System.out.println(" Computer HP +"+apComputer);
				}else{
					hpPlayer -= apComputer;
					System.out.println(" Computer HP -"+apComputer);
				}
			}

			// Draw
			else{
				System.out.println(" --- DRAW --- ");
			}

			System.out.println("==============================\n           Battle End\n==============================");
			System.out.println("\n Player HP : "+hpPlayer);
			System.out.println(" Computer HP : "+hpComputer+"\n\n");

			if (hpPlayer <= 0) {
				round = -1;
				System.out.println("==============================\n           Game End\n==============================");
				System.out.println("==============================\n         Computer Win\n==============================");
			}else if (hpComputer <= 0) {
				round = -1;
				System.out.println("==============================\n           Game End\n==============================");
				System.out.println("==============================\n          Player Win\n==============================");
			}
			round++;
		}


	}
}