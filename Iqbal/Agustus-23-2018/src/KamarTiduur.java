
public class KamarTiduur extends Ruangan {
	String kasur , guling , bantal , lemari;
	KamarTiduur(){
		
	}
	KamarTiduur(String pintuKu ,String lantaiKu ,String atapKu ,String dindingKu , String catKu , String kasurKu , String gulingKu , String bantalKu , String lemariKu){
		super(pintuKu , lantaiKu , atapKu , dindingKu , catKu );
		kasur = kasurKu;
		guling = gulingKu;
		bantal = bantalKu;
		lemari = lemariKu;
	}
	void tampil() {
		super.tampil();
		System.out.println("Kasur\t: "+kasur);
		System.out.println("Guling	: "+guling);
		System.out.println("Bantl	: "+bantal);
		System.out.println("Lemari	: "+lemari);
	}
	
}
