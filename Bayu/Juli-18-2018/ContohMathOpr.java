public class ContohMathOpr {
	public static void main( String[] args ) {
		int uangBudi, hargaBoneka, daftarLomba, hadiahLomba;

		uangBudi = 50000;
		hargaBoneka = 30000;
		daftarLomba = 15000;
		hadiahLomba = 75000;

		uangBudi = uangBudi - hargaBoneka;
		uangBudi = uangBudi - daftarLomba;
		uangBudi = uangBudi + hadiahLomba;

		System.out.println( "Uang Budi Sekarang adalah Rp " + uangBudi);
	}
}