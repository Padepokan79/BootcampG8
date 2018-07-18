public class Latihan2 {
	public static void main( String[] args ) {
		int jumlahKarung, beratBeras, hariIni, kemarin, totalBeras;

		jumlahKarung = 12;
		beratBeras = 50;
		hariIni = 175;
		kemarin = 120;

		totalBeras = jumlahKarung * beratBeras;
		totalBeras = totalBeras - hariIni;
		totalBeras = totalBeras - kemarin;

		System.out.println( "Sisa beras di warung Poniem sekarang adalah " + totalBeras + " Kg " );
	}
}