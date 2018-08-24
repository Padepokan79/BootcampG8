public class PMR extends Osis{
	String tugas;
	PMR(String ketuaKu , String wakilKetuaKu , String sekertarisKu ,String bendaharaKu ,String kegiatanKu ,String tugasKu){
		super(ketuaKu , wakilKetuaKu ,sekertarisKu , bendaharaKu , kegiatanKu );
		tugas = tugasKu;
	}
	void tampil() {
		super.tampil();
		System.out.println("Tugas\t:\t"+tugas);
	}
}
