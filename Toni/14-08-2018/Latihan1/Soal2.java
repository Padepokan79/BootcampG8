import java.util.*;
public class Soal2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int playerSymbol, computerSymbol;
		int[][] score = new int[2][2];
		String[] symbol = {"Rock", "Paper", "Scissor", "Lizards", "Spock"};

		// Game
		for (int game = 1; game <= 3; game++) {
			int[] tempScore = new int[2];
			System.out.println("====================\n       GAME "+game+"\n====================");
			// Round
			for (int round = 1; round <= 5;) {
				System.out.println("\n    - ROUND "+round+" -\n");
				int winner = 0;
				System.out.print("Masukan Symbol :\n1. Rock\n2. Paper\n3. Scissor\n4. Lizards\n5. Spock\n> ");
				playerSymbol = Integer.parseInt(input.next()) - 1;
				computerSymbol = rand.nextInt(5);
				System.out.println(symbol[playerSymbol]+" > "+symbol[computerSymbol]);
				if (playerSymbol == computerSymbol) {
					winner = 2;
				}else if (playerSymbol == 0) {
					if (computerSymbol == 2 || computerSymbol == 3) winner = 1;
				}else if (playerSymbol == 1) {
					if (computerSymbol == 0 || computerSymbol == 4) winner = 1;
				}else if (playerSymbol == 2) {
					if (computerSymbol == 1 || computerSymbol == 3) winner = 1;
				}else if (playerSymbol == 3) {
					if (computerSymbol == 2 || computerSymbol == 4) winner = 1;
				}else if (playerSymbol == 4) {
					if (computerSymbol == 0 || computerSymbol == 2) winner = 1;
				}

				if (winner == 0) {
					System.out.println("Computer Defeat Player's "+symbol[playerSymbol]+" With "+symbol[computerSymbol]);
					tempScore[0]++;
				}else if (winner == 1) {
					tempScore[1]++;
					System.out.println("Player Defeat Computer's "+symbol[computerSymbol]+" With "+symbol[playerSymbol]);
				}else{
					System.out.println("-- GAME DRAW --");
				}

				if (winner != 2) {
					round++;
				}
			}	
			// Score Calculation
			if (tempScore[1] > tempScore[0]) { score[1][0]++;
			}else{ score[0][0]++; }
			score[0][1] += tempScore[0];
			score[1][1] += tempScore[1];

			// Score Board
			System.out.println("--------------------\n        SCORE\n--------------------");
			System.out.println("Player "+score[1][0]+" Game "+score[1][1]+" Round");
			System.out.println("Computer "+score[0][0]+" Game "+score[0][1]+" Round\n");
		}

		// RESULT
		if (score[1][0] > score[0][0]) {
			System.out.println("--------------------\n      YOU WIN\n--------------------");
		}else{
			System.out.println("--------------------\n      YOU LOSE\n--------------------");
		}
		// Game Achivement
		System.out.println("Achivements : ");
		if (score[1][0] == 3) { System.out.println(" \" GODSPEED \" "); }
		else if (score[1][0] == 3) { System.out.println(" \" Palladins \" "); }
		else if (score[1][0] == 3) { System.out.println(" \" Knight \" "); }
		// Round Achivement
		if (score[1][1] >= 10) { System.out.println(" \" Enthusiast \" "); }
		else if (score[1][1] >= 8) { System.out.println(" \" Participant \" "); }
		else if (score[1][1] == 0) { System.out.println(" \" Want-to-know-only \" "); }

	}
}