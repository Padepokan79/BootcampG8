import java.util.*;

public class Soal3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int[] tebakan = new int[2], live = {1, 1};
		int round = 0, diff;

		do{
			System.out.print("\n     - Round "+round+" -\n");
			tebakan[1] = rand.nextInt(10)+1;
			for (int chance = 1; chance <= 2; chance++) {
				System.out.println("\n     * Kesempatan "+chance+" *");
				System.out.print("Tebak Angka 1-10  > ");
				tebakan[0] = input.nextInt();
				if (tebakan[0] == tebakan[1]) {
					System.out.println("Tebakan Benar !!");
					live[0] += 2;
					live[1] -= 1;
					chance = 3;
				}else{
					System.out.println("Tebakan Salah !!");
					live[0] -= 1;
					live[1] += 2;
				}
			}
			System.out.println("\n     - SCORE -\nPlayer : "+live[0]+"\nComputer : "+live[1]);
			round++;
			diff = live[0] - live[1];
		}while(round < 20 && (diff < 6 && diff > -6));
		
		if (live[0] > live[1]) { 
			System.out.println("Anda Menang");
			if (round <= 8) System.out.println("CHEATER");
			else if (round <= 11) System.out.println("NICE");
			else if (round > 11) System.out.println("NOOB");
		}
		else{ System.out.println("Anda Kalah"); }

	}
}