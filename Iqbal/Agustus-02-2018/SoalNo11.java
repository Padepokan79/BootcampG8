public class SoalNo11{
	public static void main(String[] args) {
		String[] jawaban = {"A", "C", "B", "D", "C", "D", "B", "B", "A", "A"};
		String[] roni =    {"B", "D", "B", "D", "C", "D", "B", "B", "D", "A"};
		String[] dino =    {"A", "D", "B", "D", "C", "D", "A", "B", "A", "A"};

		int nilaiRoni=0 , nilaiDino = 0;

		for(int index = 0 ; index < jawaban.length ; index++){				
			for(int jawabanRoni = 0 ; jawabanRoni < 1 ; jawabanRoni++){
				if(jawaban[index].equals(roni[index])){
					nilaiRoni += 10;
				}
			}
			for(int jawabanDino = 0 ; jawabanDino < 1 ; jawabanDino++){
				if(jawaban[index].equals(dino[index])){
					nilaiDino += 10;
				}
			}
		}
		System.out.println("Nilai Roni : "+ nilaiRoni);
		System.out.println("Nilai Dino : "+ nilaiDino);	

	}
} 