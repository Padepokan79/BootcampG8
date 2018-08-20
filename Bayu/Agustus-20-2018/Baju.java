
public class Baju {
	String bahan, jenis, model, warna, ukuran;
	int harga;
	
	public Baju (String b, String j, String m, String w, String u, int h) {
		bahan = b;
		jenis = j;
		model = m;
		warna = w;
		ukuran = u;
		harga = h;
	}
	
	public Baju ( ) {
		
	}
	
	void baju(String b, String j, String m, String w, String u, int h) {
		bahan = b;
		jenis = j;
		model = m;
		warna = w;
		ukuran = u;
		harga = h;
	}
	
	void spesifikasiBaju() {
		System.out.println("Spesifikasi baju : bahan " +bahan+ " jenis : " +jenis+ " model : " +model+ " warna : " +warna+ " ukuran : " +ukuran+ " harga : " +harga);
	}
	
}
