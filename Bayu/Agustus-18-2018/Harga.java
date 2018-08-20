/*Authorized by Bayu
 * Sat/ August, 18 2018
 * 3:37 PM
 */
public class Harga {
	int nasi, telur, minyakGoreng, dagingAyam, sayuran, bumbu;
	double hargaTotal, keuntungan;
	
	public Harga (int n, int t, int mnyk, int ayam, int s, int b) {
		nasi = n;
		telur = t;
		minyakGoreng = mnyk;
		dagingAyam = ayam;
		sayuran = s;
		bumbu = b;
	}
	
	public Harga ( ) {
		
	}
	
	void bahan (int n, int t, int mnyk, int ayam, int s, int b) {
		nasi = n;
		telur = t;
		minyakGoreng = mnyk;
		dagingAyam = ayam;
		sayuran = s;
		bumbu = b;
	}
	
	Integer dasar () {
		return nasi + telur + minyakGoreng + dagingAyam + sayuran + bumbu; 		
	}
	
	Double jual () {
		return (dasar() * 0.15) + dasar();
	}
	
	void displayInformation() {
		System.out.println("=============================");
		System.out.println("Harga dasar nasi goreng adalah : " +dasar());
		System.out.println("Harga nasi goreng adalah : " +jual());
		System.out.println("=============================");
	}

}
