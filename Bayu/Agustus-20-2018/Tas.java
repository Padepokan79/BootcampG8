
public class Tas {
	String bahan, jenis, ukuran, warna;
	int harga;
	
	public Tas (String b, String j, String u, String w, int h) {
		bahan = b;
		jenis = j;
		ukuran = u;
		warna = w;
		harga = h;
	}
	
	public Tas ( ) {
		
	}
	
	void Tas(String b, String j, String u, String w, int h) {
		bahan = b;
		jenis = j;
		ukuran = u;
		warna = w;
		harga = h;
	}
	
	void spesifikasiTas() {
		System.out.println("Spesifikasi tas : bahan " +bahan+ " jenis : " +jenis+ " ukuran : " +ukuran+ " warna : " +warna+ " harga : " +harga);
	}
	
}
