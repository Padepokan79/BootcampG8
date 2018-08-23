public class Paskibra extends Osis {
	String golongan , tugas;
	Paskibra(String ketuaKu , String wakilKetuaKu , String sekertarisKu ,String bendaharaKu ,String kegiatanKu ,String golonganKu , String tugasKu){
		super(ketuaKu , wakilKetuaKu ,sekertarisKu , bendaharaKu , kegiatanKu );
		golongan = golonganKu ;
		tugas = tugasKu;
	}
	void tampil() {
		super.tampil();
		System.out.println("Golongan\t:\t"+golongan);
		System.out.println("Tugas\t:\t"+tugas);
	}
}
