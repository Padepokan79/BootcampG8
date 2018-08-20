import java.util.Scanner;
public class MainBangunRuang {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int pilih;
		BangunRuang ObjBR = new BangunRuang();
		String statusExit = "n";
		do {
			System.out.println("Selamat datang Silah kan bilih Bangun Ruang");
			System.out.println("1. Kubus");
			System.out.println("2. Balok");
			System.out.println("3. Bola");
			System.out.println("4. Tabung");
			pilih = input.nextInt();
			switch(pilih) {
			case 1 :
				ObjBR.Kubus();
				break;
			case 2 :
				ObjBR.balok();
				break;
			case 3 :
				ObjBR.bola();
				break;
			case 4 :
				ObjBR.tabung();
			}
			System.out.println("Apakah Kamu akan Menggunakan RUmus Lagi(y/n)");
			String jawab = input.next();
			if(!jawab.equals("y")) {
				statusExit = "y";
			}
			
		}
		while(!statusExit.equals("y"));
		
	}
	
}
