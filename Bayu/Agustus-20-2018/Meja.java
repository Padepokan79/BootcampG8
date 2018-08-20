
public class Meja {
	String warna, jenis, merk, bahan, ukuran;
	int harga;

	public Meja (String w, String j, String b, String u, int h, String m) {
		warna = w;
		jenis = j;
		merk = m;
		bahan = b;
		ukuran = u;
		harga = h;
	}
	
	public Meja ( ) {
		
	}
	
	void meja(String w, String j, String b, String u, int h, String m) {
		warna = w;
		jenis = j;
		merk = m;
		bahan = b;
		ukuran = u;
		harga = h;
	}
	
	void spesifikasiMeja() {
		System.out.println("Spesifikasi meja : warna " +warna+ " jenis : " +jenis+ " merk : " +merk+ " bahan : " +bahan+ " ukuran : " +ukuran+ " " +harga);
	}
	
	
}
