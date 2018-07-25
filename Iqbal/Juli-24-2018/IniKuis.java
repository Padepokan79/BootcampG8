import java.util.*;

public class IniKuis{
	public static void main(String [] args){
		int nilaiPlayer = 0 , nilaiKomputer = 0 , tempKomputer = 0;
		String winner = "" ;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		for(int round = 1 ; round >= 1 ; round++){
			System.out.println("Round :" + round);
			int nilai1 = rand.nextInt(6)+1;
			int nilai2 = rand.nextInt(6)+1;
			int nilai3 = rand.nextInt(6)+1;

			nilaiKomputer += (nilai1+ nilai2 + nilai3);
			System.out.println("Nilai Komputer RONDE INI :" + (nilai1+ nilai2 + nilai3));
			for(int rollPlayer = 1 ; rollPlayer >= 1 ; rollPlayer ++){
				int nilaiRollPlayer = rand.nextInt(6)+1;
				if(nilaiRollPlayer == 1 ){
					System.out.println("Gagal Dapat Nilai di round ini");
					rollPlayer = -1;
					tempKomputer = 0;
				}
				else{
					System.out.println("Niilai Roll Kamu : "+ nilaiRollPlayer );
					tempKomputer += nilaiRollPlayer;
					System.out.println("Apakah Kamu mau roll lagi (Y/N)?");
					String jawab = input.next();
					if(jawab.equals("N") || jawab.equals("n")){
						nilaiPlayer += tempKomputer;
						//System.out.println("Nilai Kamu : " + nilaiPlayer );
						rollPlayer = -1 ;
					}


				}

			}
			System.out.println("Result Round "+round+" :");
			System.out.println("Nilai Komputer :"+ (nilai1+nilai2+nilai3));
			System.out.println("Nilai Player   :"+ tempKomputer);
			tempKomputer = 0;
			
			if(nilaiPlayer >= 100){
				winner = "Player";
				round = -1 ;
				System.out.println("Pemenangnya adalah : " + winner );
				System.out.println("Nilai Player   : " + nilaiPlayer );
				System.out.println("Nilai Komputer : " + nilaiKomputer);

			}
			else if(nilaiKomputer >= 100 ){
				winner = "Komputer";
				round = -1;
				System.out.println("Pemenangnya adalah : " + winner );
				System.out.println("Nilai Player   : " + nilaiPlayer );
				System.out.println("Nilai Komputer : " + nilaiKomputer);
			}
		}

	}
}