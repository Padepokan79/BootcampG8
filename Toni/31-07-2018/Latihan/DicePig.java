import java.util.*;
public class DicePig{
	public static void main(String[] args){
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		int dice1 = 0, dice2, dice3, scoreCom = 0, scorePlayer = 0, diceround, round, roll, tempScore = 0;
		String jawaban = "kalah", grade = "Amateur", winner = "none";

		//Game
		round = 1;
		do{	
			System.out.println("\n====================\n    = ROUND  "+round+" =\n====================");
			
			//Computer Turn
			dice1 = random.nextInt(6)+1;
			dice2 = random.nextInt(6)+1;
			dice3 = random.nextInt(6)+1;
			System.out.println("\n - Computer mendapatkan "+dice1+", "+dice2+", "+dice3);
			scoreCom += (dice1 + dice2 + dice3);

			//Player Turn
			roll = 1;
			while(roll > 0){
				dice1 = random.nextInt(6)+1;
				System.out.println("\n - Anda mendapatkan angka "+dice1);
				if (dice1 != 1) {
					tempScore+= dice1;
					System.out.print("\nApakah anda ingin melempar dadu lagi (Y/N) ? ");
					if (keyboard.next().equals("n") ) {
						System.out.println("\n - Giliran berakhir !!! - \n");
						roll = -1;
						scorePlayer += tempScore;
						tempScore = 0;
					}
				}else{
					System.out.println("\n - Giliran berakhir !!! - \n");
					roll = -1;
					tempScore = 0;
				}
				roll++;
			}

			//Round Summary
			System.out.println(" Round Result "+round+" :");
			System.out.println("  - Computer : "+scoreCom);
			System.out.println("  - Player   : "+scorePlayer);
			if (scorePlayer >= 100) {
				round = -1;
				winner = "Player";
			}else if(scoreCom >= 100){
				round = -1;
				winner = "Computer";
			}
			round++;
		}while(round > 0);
		System.out.println("\n\n   - Game Over !! - ");
		System.out.println(" The Winner is "+winner);
	}
}