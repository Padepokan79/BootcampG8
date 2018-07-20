public class ContohMathOpr{
	public static void main( String[] args){
		int uang = 50000, hargaBoneka = 30000, biayaLomba = 15000, hadiahLomba = 75000;
		uang -= hargaBoneka;
		uang -= biayaLomba;
		uang += hadiahLomba;
		System.out.println("Sisa uang budi Rp." + uang);
	}
}