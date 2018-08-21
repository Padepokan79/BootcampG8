/*Authorized by Bayu
 * Sat/ August, 18 2018
 * 4:54 PM
 */
public class WarungNasiGoreng2 {
	
	public static void main (String [] args) {
		Harga pertama = new Harga (2500, 1500, 1000, 2000, 1000, 700);
		Harga kedua = new Harga (2500, 1800, 1500, 2000, 1000, 800);
		Harga ketiga = new Harga (2500, 1800, 1000, 3000, 1200, 1000);
		Harga keempat = new Harga (3000, 1500, 1800, 3300, 1500, 1200);
		pertama.displayInformation();
		kedua.displayInformation();
		ketiga.displayInformation();
		keempat.displayInformation();	
	}
}
