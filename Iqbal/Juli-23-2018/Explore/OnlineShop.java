import java.util.Scanner;
public class OnlineShop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int no ,  uang , banyak , jumlah , kembalian;
		System.out.println("=======================================");
		System.out.println("========= Welcome to Kami SHop=========");
		System.out.println("=======================================");
		System.out.println("====    APA YANG ANDA BUTUHKAN?    ====");
		System.out.println("=======================================");
		System.out.println("===     1.Bala bala  : Rp.700       ===");
		System.out.println("===     2.Gehu       : Rp.1000      ===");
		System.out.println("===     3.Cireng     : Rp.850       ===");
		System.out.println("===     4.Combro     : Rp.1500      ===");
		System.out.println("=======================================");
		no = input.nextInt();
		System.out.println("Berapa Banyak yang kamu mau :");
		banyak = input.nextInt();
		System.out.println("Berapa Uang kamu :");
		uang = input.nextInt();
		switch(no){
			case 1 :
				jumlah = 700 * banyak;
				kembalian = uang - jumlah;
				if(uang>jumlah){
					System.out.println("===============================");
					System.out.println("==========   BON   ============");
					System.out.println("===============================");
					System.out.println("Nama           quantity  Harga ");
					System.out.println("Bala bala        "+banyak+ "       700");	
					System.out.println("Jumlah                   "+ jumlah);
					System.out.println("Uang                     "+ uang);
					System.out.println("kembalian                "+ kembalian);
				}
				else{
					System.out.println("Uang Anda Tidak Cukup");
				}
				break;
			case 2 :
				jumlah = 1000 * banyak;
				kembalian = uang - jumlah;
				if(uang>jumlah){
					System.out.println("===============================");
					System.out.println("==========   BON   ============");
					System.out.println("===============================");
					System.out.println("Nama           quantity  Harga ");
					System.out.println("Gehu              "+banyak+ "      1000");	
					System.out.println("Jumlah                   "+ jumlah);
					System.out.println("Uang                     "+ uang);	
					System.out.println("kembalian                "+ kembalian);
				}
				else{
					System.out.println("Uang Anda Tidak Cukup");
				}
				break;
			case 3 :
				jumlah = 850 * banyak;
				kembalian = uang - jumlah;
				if(uang>jumlah){
					System.out.println("===============================");
					System.out.println("==========   BON   ============");
					System.out.println("===============================");
					System.out.println("Nama           quantity  Harga ");
					System.out.println("Cireng            "+banyak+ "       850");	
					System.out.println("Jumlah                   "+ jumlah);
					System.out.println("Uang                     "+ uang);	
					System.out.println("kembalian                "+ kembalian);
				}
				else{
					System.out.println("Uang Anda Tidak Cukup");
				}
				break;	
			case 4 :
				jumlah = 1500 * banyak;
				kembalian = uang - jumlah;
				if(uang>jumlah){
					System.out.println("===============================");
					System.out.println("==========   BON   ============");
					System.out.println("===============================");
					System.out.println("Nama           quantity  Harga ");
					System.out.println("Combro            "+banyak+ "      1500");	
					System.out.println("Jumlah                   "+ jumlah);
					System.out.println("Uang                     "+ uang);	
					System.out.println("kembalian                "+ kembalian);
				}
				else{
					System.out.println("Uang Anda Tidak Cukup");
				}
				break;			
		}



	} 
}