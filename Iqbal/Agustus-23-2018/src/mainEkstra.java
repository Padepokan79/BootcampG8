
public class mainEkstra {
	public static void main(String[] args) {
		Osis o = new Osis("Ketua Osis" , "Wakil Ketua Osis" , "Sekertaris Osis" , "Bendahara Osis" , "Mengurus KEgiatan Sekolah");
		o.tampil();
		Pramuka p = new Pramuka("Ketua Pramuka" , "Wakil Ketua Pramuka" , "Sekertaris Pramuka" , " Bendahara Pramuka " , " Menjalankan KEgiatan Kepramukaan" ,"PENEGAK" , "BHAYANGKARA");
		p.tampil();
		Paskibra pas = new Paskibra("Ketua Paskibra" , "Wakil Ketua Paskibra" , "Sekertaris Paskibra " , "Bendahara Paskibra" , "Mengibarkan Bendera", "Rakanta" , "Pemegang Bendera" );
		pas.tampil();
		PMR pmr = new PMR("Ketua PMR", "Wakil Ketua PMR" , "Sekertaris PMR" , "Bendahara PMR", "Membuat Orang Sehat" , "Membawa Tandu");
		pmr.tampil();
	}
}
