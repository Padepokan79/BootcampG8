import java.util.*;
public class Life{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int stamina = 100, uang = 100, kemampuan = 0, mood = 100, gaji = 15, kegiatan, makan;

		int hari = 1; 
		while(hari > 0) {
			System.out.println("---------------------------\n         - Day "+hari+" -\n---------------------------");
			System.out.println("Apa yang ingin kamu lakukan ?\n1. Bekerja\n2. Belajar\n3. Berlibur");
			kegiatan = input.nextInt();
			System.out.print("Berapa kali kamu ingin makan ?\n (1-3)  ");
			makan = input.nextInt();

			// Activity
			if (kegiatan == 1) {
				stamina -= 20;
				mood -= 5;
				uang += 15+kemampuan;
			}else if(kegiatan == 2){
				stamina -= 10;
				uang -= 5;
				mood -= 3;
				kemampuan += 5;
			}else{
				uang -= 40;
				stamina += 50;
				kemampuan += 2;
				mood += 15;
			}

			// Makan
			mood += (2*makan);
			uang -= (2*makan);
			stamina += (3*makan);

			System.out.println("Apa yang ingin kamu lakukan malam ini ?\n1. Tidur\n2. Bergadang");
			kegiatan = input.nextInt();
			if(kegiatan == 1){
				stamina += 5;
				mood += 5;
			}else{
				stamina -= 5;
				mood -= 5;
				kemampuan += 2;
			}

			System.out.println("---------------------------\n       - Summary -\n---------------------------");
			System.out.println("Uang      : "+uang);
			System.out.println("Stamina   : "+stamina);
			System.out.println("Mood      : "+mood);
			System.out.println("Kemampuan : "+kemampuan+"\n");

			if(uang >= 1000){
				System.out.println("Selamat, behasil mencapai kekayaan berlimpah\nHidup anda akan berubah menjadi orang kaya");
				hari = -1;
			}else if (stamina <= 0) {
				System.out.println("Game Berakhir, anda mati Kelelahan");	
				hari = -1;		
			}else if (uang <= 0) {
				System.out.println("Game Berakhir, anda kehabisan uang untuk hidup");	
				hari = -1;		
			}else if (mood <= 0) {
				System.out.println("Game Berakhir, anda kehilangan akal sehat");	
				hari = -1;		
			}
			hari++;
		}
		

	}

	
}