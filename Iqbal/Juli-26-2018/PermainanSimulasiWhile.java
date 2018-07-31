import java.util.Scanner ;
public class PermainanSimulasiWhile {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("========================================");
		System.out.println("    Selamat Datang DI Game Kehidupan    ");
		System.out.println("========================================");
		System.out.println("Silahkan Pilih Nama Untuk Karakter Mu : ");
		String nama = input.nextLine();

			int stamina = 100 , uangAwal = 100 , kemampuan = 0 , mood = 100 ;
			int hari = 1 ; 	
			while (hari >= 1 ){
			int gaji = (15 + kemampuan) ;	
			System.out.println("Hari Ke : " + hari );
			System.out.println("---------------------------------------------------");
			System.out.println ("Nama : " + nama);
			System.out.println("---------------------------------------------------");
			System.out.println("Stamina : " + stamina + "  || Mood : " + mood);
			System.out.println("Uang    : " + uangAwal+ "$ || Gaji : " + gaji +"$");
			System.out.println("Kemampuan Mu adala : " + kemampuan);
			System.out.println("Apa yang akan kamu lakukan hari ini : ");
			System.out.println("(1) . Belajar ");
			System.out.println("(2) . Bekerja ");
			System.out.println("(3) . Hiiburan");
			int pilih = input.nextInt();
			if(pilih == 1 ){
				stamina -= 10 ;
				uangAwal -= 5 ;
				kemampuan += 5 ;
				mood -= 40;
				System.out.println("Belajar Sukses ");
			}
			else if(pilih == 2){
				stamina -= 40;
				uangAwal +=  gaji ;
				mood -= 5;
				System.out.println("Bekerja SUkses ");
			}
			else if(pilih == 3){
				stamina += 50 ;
				uangAwal -= 40;
				kemampuan += 2 ;
				mood += 15;
				System.out.println("Hiiburan Sukses ");
			}
			else {
				System.out.println("Input Salah , Game Berakhir");
				hari = -1;
			}
			System.out.println("Berapa kali kamu akan makan ? (1-3)");
			int makan = input.nextInt();
			if(makan == 1 ){
				stamina += 3 ;
				uangAwal -= 10 ;
				mood += 2;
				System.out.println("Makan Sukses ");
			}
			else if(makan == 2){
				stamina += 3*2 ;
				uangAwal -= 10*2 ;
				mood += 2*2 ;
				System.out.println("Makan Sukses ");
			}
			else if(makan == 3){
				stamina += 3*3 ;
				uangAwal -= 10*3 ;
				mood += 2*3 ;
				System.out.println("Makan Sukses ");
			}
			else {
				System.out.println("Input Salah , Game Berakhir");
				hari = -1;
			}

			System.out.println("Apa yang akan kamu lakukan ?");
			System.out.println("1.Tidur");
			System.out.println("2.Bergadang");
			int tidurBergadang = input.nextInt();
			if(tidurBergadang == 1){
				stamina += 5;
				mood += 5;
			}
			else if(tidurBergadang == 2){
				stamina -= 5 ;
				mood -= 5 ;
				kemampuan += 2;			
			}
			else {
				System.out.println("Input Salah , Game Berakhir");
				hari = -1;
			}

			if(uangAwal >= 10000){
				System.out.println("Game Tamat Kamu Berhasil !");
				hari = -1;
			}
			if( uangAwal <1 || stamina <1 || mood <1 ){
				System.out.println("Game Tamat Kamu Kalah !");
				hari = -1;
			}
			hari++;

		}

	}
}