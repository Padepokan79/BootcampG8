import static java.lang.System.*;
import java.util.Scanner;

public class RekomendasiKost{
	public static void main(String[] args){
		int hargaKamar1 = 650000, hargaKamar2 = 300000, kapasitasKamar1 = 3, kapasitasKamar2 = 2, orang = 0;
		Scanner input = new Scanner(System.in);

		out.print("Masukan Jumlah orang : ");
		orang = input.nextInt();

		if (orang == 3 || (orang % 3 == 0) ) {
			out.println("Rekomendasi kamar :  Kamar nomor 3 \tRp."+hargaKamar1);	
			out.println("Rekomendasi kamar :  Bayar per orang \tRp."+hargaKamar1/orang);	
		}if (orang <= 2) {
			out.println("Rekomendasi kamar :  Kamar nomor 2 \tRp."+hargaKamar2);	
			out.println("Rekomendasi kamar :  Bayar per orang \tRp."+hargaKamar2/orang);	
		}
		
		

		out.println();

	}
}