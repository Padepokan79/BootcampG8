import java.util.*;

public class Soal11{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		String[] jawaban = {"A", "C", "B", "D", "C", "D", "B", "B", "A", "A"},
		toni = {"B", "D", "B", "D", "C", "D", "B", "B", "D", "A"},
		dino = {"A", "D", "B", "D", "C", "D", "A", "B", "D", "C"};

		String[][] answer = {toni, dino};

		int[] score = new int[2];

		for (int index = 0;index < score.length; index++) {
			for (int question = 0; question < jawaban.length; question++) {
				if (answer[index][question].equals(jawaban[question])) {
					score[index]++;
				}
			}
		}

		System.out.println("\nNilai Toni "+(10*score[0]));
		System.out.println("Nilai Dino "+(10*score[1]));


		
		//for(){
		//}
		
	}
}