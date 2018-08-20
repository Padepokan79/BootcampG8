/* 	
 * Aurhor  : Muhammad Sultoni 
 * Created : 16-08-2018 
 */
public class NasiGoreng {
	int nasi, telur, minyak, daging, sayur, bumbu, hargaDasar, hargaJual;
	
	NasiGoreng(int nasi, int telur, int minyak, int daging, int sayur, int bumbu){
		this.nasi = nasi;
		this.minyak= minyak;
		this.daging = daging;
		this.sayur = sayur;
		this.bumbu = bumbu;
		
		// Hitung Harga Dasar
		this.hargaDasar = nasi+minyak+daging+sayur+bumbu;
		// Hitung Harga Jual
		this.hargaJual = this.hargaDasar + (int)(0.15 * this.hargaDasar);
	}
	
	void tampilHarga(){
		System.out.println("Harga Dasar : "+this.hargaDasar+"\nHarga Jual : "+this.hargaJual);
	}
	
	
}
