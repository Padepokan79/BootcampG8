import static java.lang.System.*;
import java.util.Scanner;

public class Burung{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String warna1, warna2;
		int kicauan;

		out.print("Masukan Warna pertama burung : ");
		warna1 = input.nextLine();

		out.print("Masukan Warna kedua burung : ");
		warna2 = input.nextLine();

		out.print("Masukan jumlah kicauan : ");
		kicauan = input.nextInt();

		if ((warna1 == "merah" && warna2 == "biru") || (warna1 == "biru" && warna2 == "merah")) {
			if (kicauan == 3) {
				out.print("Saya ambil dengan harga Rp.300.000");
			}else if(kicauan == 6){
				out.print("Saya ambil dengan harga Rp.450.000 - Rp.600.000");
			}else{
				out.print("Tidak cocok");
			}
		}else{
			out.print("Tidak cocok");
		}


	}
}
