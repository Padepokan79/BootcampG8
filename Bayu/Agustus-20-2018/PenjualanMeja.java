import java.util.Scanner;

public class PenjualanMeja {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		String bahan, merk, fungsi, ukuran;
		int harga = 0;
		
		int hargaMejaMakanJatiKecil = 300000;
		int hargaMejaMakanJatiBesar = 700000;
		int hargaMejaBelajarJatiKecil = 150000;
		int hargaMejaBelajarJatiBesar = 250000;
		int hargaMejaMakanMahoniKecil = 250000;
		int hargaMejaMakanMahoniBesar = 1500000;
		int hargaMejaBelajarMahoniKecil = 100000;
		int hargaMejaBelajarMahoniBesar = 775000;
		
		System.out.println("Bahan : ");
		bahan = keyboard.nextLine();
		System.out.println("Merk : ");
		merk = keyboard.nextLine();
		System.out.println("Fungsi : ");
		fungsi = keyboard.nextLine();
		System.out.println("Ukuran : ");
		ukuran = keyboard.nextLine();
				
		if ( bahan.equals("jati"))  {
			if (fungsi.equals("meja makan")) {
				if (ukuran.equals("kecil" )) {
					harga = hargaMejaMakanJatiKecil;
				}
				else if (ukuran.equals("besar" )) {
					harga = hargaMejaBelajarJatiBesar;
				}
			}
			else if (fungsi.equals("meja belajar")) {
				if (ukuran.equals("kecil" )) {
					harga = hargaMejaBelajarJatiKecil;
				}
				else if (ukuran.equals("besar" )) {
					harga = hargaMejaBelajarJatiBesar;
				}
			}
		}
		else if ( bahan.equals("mahoni")) {
			if (fungsi.equals("meja makan")) {
				if (ukuran.equals("kecil" )) {
					harga = hargaMejaMakanMahoniKecil;
				}
				else if (ukuran.equals("besar" )) {
					harga = hargaMejaMakanMahoniBesar;
				}
			}
			else if (fungsi.equals("meja belajar")) {
				if (ukuran.equals("kecil" )) {
					harga = hargaMejaBelajarMahoniKecil;
				}
				else if (ukuran.equals("besar" )) {
					harga = hargaMejaBelajarMahoniBesar;
				}
			}
		}
		System.out.println("Merk     : "+merk);
		System.out.println(fungsi+ " dengan ukuran " +ukuran);
		System.out.print("Harga    : " +harga);
	}

}
