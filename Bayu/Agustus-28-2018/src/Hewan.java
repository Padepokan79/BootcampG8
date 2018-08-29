
public class Hewan {
	String namaHewan, kulit, mata, mulut;
	int kaki; 

	public Hewan(String namaHewan, String kulit, String mata, String mulut, int kaki) {
		super();
		this.namaHewan = namaHewan;
		this.kulit = kulit;
		this.mata = mata;
		this.mulut = mulut;
		this.kaki = kaki;
	}
	
	void tampilkan() {
		System.out.println("Nama Hewan        : " +namaHewan);
		System.out.println("Jenis Kulit       : " +kulit);
		System.out.println("Mata              : " +mata);
		System.out.println("Mulut             : " +mulut);
		System.out.println("Kaki              : " +kaki);		
	}
		
	
	
	
	
	

}
