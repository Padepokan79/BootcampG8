import java.util.*;
public class LytaGame{
	public static void main(String[] args){
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		// Variable
		int level, hpPlayer, initialHP, hpBoss, damagePlayer, damageBoss, elixir=0, potion=0, gold=0, fragment=0, epicItem=0, legendWeapon=0, round;

		System.out.print("Enter your level : ");
		level = keyboard.nextInt();

		//Initiation
		hpPlayer = (100*level) + (random.nextInt(1800)+200);
		initialHP = hpPlayer;
		hpBoss = (2*hpPlayer) + (random.nextInt(2000)+1000);
		round = 1;
		do{
			System.out.print("\nInitiate Hit ? ");
			keyboard.next();

			// Battle
			damageBoss = ((6*initialHP)/100) + (random.nextInt(300)+200);
			damagePlayer = (level * 10) + (random.nextInt(800)+200);

			// Loot
			if (damagePlayer >= 1000 && damagePlayer <= 12000) {
				elixir++;
			}else if (damagePlayer > 12000 && damagePlayer <= 14000) {
				potion++;
			}else if (damagePlayer > 14000 && damagePlayer <= 16000) {
				gold+=999;
			}else if (damagePlayer > 16000) {
				fragment++;
			}
			if (damagePlayer >= 5000) {
				epicItem += 1 * (damagePlayer / 5000);
			}

			// Impact
			hpPlayer -= damageBoss;
			hpBoss -= damagePlayer;

			//Result
			System.out.println("\n   - Round "+round+" - ");
			System.out.println("\n   Player Damage : "+damagePlayer);
			System.out.println("   Boss Damage   : "+damageBoss);
			System.out.println("\n   Player HP : "+hpPlayer+" (-"+damageBoss+")");
			System.out.println("   Boss HP   : "+hpBoss+" (-"+damagePlayer+")");

			if (hpBoss <= 0) {
				round = -1;
				System.out.println("BOSS HP is 0, the Event ended");
				System.out.println("You get Legendary Weapon !!");
			}else if (hpPlayer <= 0) {
				round = -1;
				System.out.println("Your HP is 0, the Event ended");
			}
			round++;
		}while(round > 0);
		 
		System.out.println("\n======================\n=       Reward       =");
		System.out.println("======================\n Elixir "+elixir);
		System.out.println("======================\n Potion "+potion);
		System.out.println("======================\n gold "+gold);
		System.out.println("======================\n fragment "+fragment);
		System.out.println("======================\n Epic Item "+epicItem);
		if (legendWeapon == 1)
		System.out.println("======================\n ** Legendary Item  **\n======================");



	}
}