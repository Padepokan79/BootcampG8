/*Author : Muhamad Iqbal Farhan Maulana*/
import java.util.Scanner;

public class KosIqbal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int jumlah ,hargaKamar1 , jumlahKamar1 , maxKamar1 , hargaKamar2 , jumlahKamar2 , maxKamar2;
		hargaKamar1 = 650000; jumlahKamar1 = 4 ; maxKamar1 = 3;
		hargaKamar2 = 350000; jumlahKamar2 = 7 ; maxKamar2 = 2;

		System.out.println("Masukan Berapa orang kamu akan sewa kamar :");
		jumlah = input.nextInt();
		if(jumlah == 1){
			System.out.println("==========================================");
			System.out.println("==========  Rekomendasi Kamar  ===========");
			System.out.println("==========================================");
			System.out.println("== NO KAMAR ==        HARGA BAYAR       ==");
			System.out.println("==========================================");
			System.out.println("==    1     ==    RP. :"+ hargaKamar2 +"           ==");
			System.out.println("==========================================");
		}
		else if(jumlah == 2){
		System.out.println("==========================================");
			System.out.println("==========  Rekomendasi Kamar  ===========");
			System.out.println("==========================================");
			System.out.println("== NO KAMAR ==        HARGA BAYAR       ==");
			System.out.println("==========================================");
			System.out.println("==    1     ==    RP. :"+ hargaKamar2/2 +"/ORANG     ==");
			System.out.println("==========================================");	
		}
		else if(jumlah == 3){
		System.out.println("==========================================");
			System.out.println("==========  Rekomendasi Kamar  ===========");
			System.out.println("==========================================");
			System.out.println("== NO KAMAR ==        HARGA BAYAR       ==");
			System.out.println("==========================================");
			System.out.println("==    2     ==    RP. :"+ hargaKamar1/3 +"/ORANG     ==");
			System.out.println("==========================================");	
		}
	}	
}