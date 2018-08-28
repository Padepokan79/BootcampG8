
public class Mamalia extends Hewan {
	
	String bulu, telinga, paruParu;

	public Mamalia(String namaHewan, String kulit, String mata, String mulut, int kaki, String bulu, String telinga,
			String paruParu) {
		super(namaHewan, kulit, mata, mulut, kaki);
		this.bulu = bulu;
		this.telinga = telinga;
		this.paruParu = paruParu;
	}

	void tampilkan() {
		super.tampilkan();
		System.out.println("Berbulu           : " +bulu);
		System.out.println("Telinga           : " +telinga);
		System.out.println("Paru-paru         : " +paruParu);
	}
	
	
	
	

}
