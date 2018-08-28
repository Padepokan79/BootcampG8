
public class Reptile extends Hewan {
	
	String bersisik, melata, merayap;

	public Reptile(String namaHewan, String kulit, String mata, String mulut, int kaki, String bersisik, String melata,
			String merayap) {
		super(namaHewan, kulit, mata, mulut, kaki);
		this.bersisik = bersisik;
		this.melata = melata;
		this.merayap = merayap;
	}

	void tampilkan() {
		super.tampilkan();
		System.out.println("Bersisik          : " +bersisik);
		System.out.println("Melata            : " +melata);
		System.out.println("Merayap           : " +merayap);
	}
	
	

}
