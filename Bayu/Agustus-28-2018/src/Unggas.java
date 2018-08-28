
public class Unggas extends Hewan {
	
	String sayap, paruh, cakar;

	public Unggas(String namaHewan, String kulit, String mata, String mulut, int kaki, String sayap, String paruh,
			String cakar) {
		super(namaHewan, kulit, mata, mulut, kaki);
		this.sayap = sayap;
		this.paruh = paruh;
		this.cakar = cakar;
	}
	
	void tampilkan() {
		super.tampilkan();
		System.out.println("Sayap             : " +sayap);
		System.out.println("Paruh             : " +paruh);
		System.out.println("Cakar             : " +cakar);
	}
	

}
