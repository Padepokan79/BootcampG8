public class MainRuangan {
	public static void main(String[]args) {
		Ruangan r = new Ruangan("Plastik" , "Kramik" , "Genteng" , "Bata" , "Putih");
		r.tampil();
		KamarMandi km = new KamarMandi("Plastik" , "Kramik" , "Genteng" , "Bata" , "Putih" , "Besar" , "Duduk" , 2 , 2);
		km.tampil();
		KamarTiduur kt = new KamarTiduur("Plastik" , "Kramik" , "Genteng" , "Bata" , "Putih" , "Busa" , "Busa" , "Busa" , "Kayu");
		kt.tampil();
	}
	
}
