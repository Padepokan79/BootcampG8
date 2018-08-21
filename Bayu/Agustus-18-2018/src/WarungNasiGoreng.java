/*Authorized by Bayu
 * Sat/ August, 18 2018
 * 3:37 PM
 */
public class WarungNasiGoreng {
	
	public static void main (String args []) {
		
		Harga pertama = new Harga ();
		pertama.bahan(2500, 1500, 1000, 2000, 1000, 700);
		pertama.displayInformation();
		Harga kedua = new Harga ();
		kedua.bahan(2500, 1800, 1500, 2000, 1000, 800);
		kedua.displayInformation();
		Harga ketiga = new Harga ();
		ketiga.bahan(2500, 1800, 1000, 3000, 1200, 1000);
		ketiga.displayInformation();
		Harga keempat = new Harga ();
		keempat.bahan(3000, 1500, 1800, 3300, 1500, 1200);
		keempat.displayInformation();
	}

}
