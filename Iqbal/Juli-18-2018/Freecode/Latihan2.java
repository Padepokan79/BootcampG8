public class Latihan2{
	public static void main( String[] args){
		int jumlahKarung = 12, beratKarung = 50, terjualHariIni = 175, terjualKemarin = 120, jumlahBerat;
		jumlahBerat = jumlahKarung * beratKarung;
		jumlahBerat -= (terjualKemarin + terjualHariIni);
		System.out.println("Sisa beras "+jumlahBerat+" KG");
	}
}

