
public class Ruangan {
	String pintu , lantai , atap , dinding , cat;
	Ruangan(){
		
	}
	Ruangan(String pintuKu ,String lantaiKu ,String atapKu ,String dindingKu , String catKu){
		pintu = pintuKu;
		lantai = lantaiKu;
		atap = atapKu;
		dinding = dindingKu;
		cat = catKu;
	}
	void tampil() {
		System.out.println("Pintu	: "+pintu);
		System.out.println("Lantai	: "+lantai);
		System.out.println("Atap	: "+atap);
		System.out.println("Dinding	: "+dinding);
		System.out.println("Cat	: "+cat);
	}
}
