import java.util.*;
public class Tebak{
	public static void main(String[] args){
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		int nilai = random.nextInt(10)+1, tebak, kesempatan = 3;
		String jawaban = "kalah";
		System.out.println("Angka : "+nilai);
		
		while(kesempatan > 0){
			System.out.print("Tebak Angka : ");
			tebak = keyboard.nextInt();
			if (tebak == nilai) {
				jawaban = "Menang";
				kesempatan = 0;				
			}else{
				System.out.println("Jawaban anda salah");
			}
			kesempatan--;
		}

		System.out.println("Anda "+jawaban);
		System.out.println("Jawaban yang benar adalah "+nilai);

	}
}