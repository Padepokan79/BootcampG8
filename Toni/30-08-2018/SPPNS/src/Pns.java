import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pns extends Karyawan implements TunjanganPns, PotonganPns{
	int eselon;
	int mkg, anak;
	Boolean sewa;
	
	// Constructor
	public Pns(String nama, String nip, String penempatan, String jabatan, String golongan, Boolean menikah,
			int eselon, int mkg, int anak, Boolean sewa) {
		super(nama, nip, penempatan, jabatan, golongan, menikah);
		this.eselon = eselon;
		this.mkg = mkg;
		this.anak = anak;
		if(anak > 3) anak = 3;
		this.sewa = sewa;
		
		gaji = new HashMap<String, Double>();
		gaji.put("pokok", gajiPokok());
		
		tunjangan = new HashMap<String, Double>();
		tunjangan.put("Tunjangan Suami Istri", tunjanganPasutri());
		tunjangan.put("Tunjangan Anak", tunjanganAnak());
		tunjangan.put("Tunjangan Umum", tunjanganJabatan("umum"));
		tunjangan.put("Tunjangan Struktural", tunjanganJabatan("struktural"));
		tunjangan.put("Tunjangan Fungsional", tunjanganJabatan("fungsional"));
		tunjangan.put("TUnjangan PPH", potonganPph());
		
		gaji.put("kotor", gajiKotor());
		
		potongan = new HashMap<String, Double>();
		potongan.put("Potongan IWP", potonganIwp());
		potongan.put("Potongan Taperum", potonganTaperum());
		potongan.put("Potongan Sewa", potonganSewa());
		potongan.put("Potongan PPH", potonganPph());
		gaji.put("bersih", gajiBersih());
		
	}
	
	@Override
	double gajiPokok() {
		double gapok = 0.0;
		int kenaikan = mkg;
		// Setting Umk
		@SuppressWarnings("serial")
		HashMap<String, Double> umk = new HashMap<String, Double>(){{
			put("i/a", 1486500.0); put("i/b", 1623400.0); put("i/c", 1692100.0); put("i/d", 1763600.0);	
			put("ii/a", 1926000.0); put("ii/b", 2103300.0); put("iii/c", 2192300.0); put("ii/d", 2285000.0);	
			put("iii/a", 2456700.0); put("iii/b", 2560600.0); put("iii/c", 2668900.0); put("iii/d", 2781800.0);	
			put("iv/a", 2899500.0); put("iv/b", 3022100.0); put("iv/c", 3149900.0); put("iv/d", 3283200.0); put("iv/e", 3422100.0);	
		}};
		gapok = umk.get("i/a");

		// Gapok base on Umk
		if(golongan.equals("i/b") || golongan.equals("i/c") || golongan.equals("ii/d") || golongan.equals("ii/b") || golongan.equals("ii/c") || golongan.equals("ii/d")) {
			kenaikan -= 3;
		}else if(golongan.equals("ii/a") && mkg == 1) {
			kenaikan++;
		}
		kenaikan = kenaikan/2;
		for(;kenaikan > 0;kenaikan--) { gapok += gapok*0.0315; }
		return gapok;
	}

	@Override
	double gajiKotor() {
		double bruto = gajiPokok();
		for(Map.Entry<String, Double> tj: tunjangan.entrySet()) {
			bruto += tj.getValue();
		}
		return bruto;
	}

	@Override
	double gajiBersih() {
		double netto = gajiKotor();
		for(Map.Entry<String, Double> pot : potongan.entrySet()) {
			netto -= pot.getValue();
		}
		return netto;
	}
	
	//Child Own Methods
	// --- Tunjangan ---
	
	public double tunjanganPasutri() {
		double t = 0.0;
		if(menikah) t = gajiPokok() * 0.1;
		return t;
	}
	
	public double tunjanganAnak() {
		return (gajiPokok() * 0.2 )*anak;
	}
	
	public double tunjanganBeras() {
		int keluarga = 1+anak;
		if(menikah) keluarga++;
		return keluarga*(10 * hargaBeras);
	}
	
	public double tunjanganTerpencil() {
		return gajiPokok();
	}
	
	public double tunjanganPapua() {
		double t = 0.0;
		@SuppressWarnings("serial")
		HashMap<String, Double> tpapua = new HashMap<String, Double>(){{
			put("i/a", 200000.0); put("i/b", 225000.0); put("i/c", 250000.0); put("i/d", 275000.0);	
			put("ii/a", 300000.0); put("ii/b", 325000.0); put("iii/c", 350000.0); put("ii/d", 375000.0);	
			put("iii/a", 425000.0); put("iii/b", 450000.0); put("iii/c", 475000.0); put("iii/d", 500000.0);	
			put("iv/a", 525000.0); put("iv/b", 550000.0); put("iv/c", 575000.0); put("iv/d", 600000.0); put("iv/e", 625000.0);	
		}};
		if(penempatan.equals("papua")) t = tpapua.get(golongan);
		return t;
	}
	
	// Tunjangan Jabatan (Umum, Fungsional & Struktural)
	public double tunjanganJabatan(String target) {
		double t = 0.0;
		if(jabatan.equals(target))
			t = tFungsional;
		else if(jabatan.equals(target)) {
			t = tStruktural[eselon];
		}else if(jabatan.equals(target)) {
			t = tUmum.get(golongan.split("/")[0]);
		}
		return t;
	}
	
	public double tunjanganTUmum() {
		double t = 2000000-gajiKotor();
		if(t < 0) t = 0;
		return t;
	}
	
	public double tunjanganBulat() {
		double t = 0.0;
		t = 100 - (gajiPokok() - ((((int)gajiPokok())/100)*100));
		return t;
	}
	
	public void tunjanganLain() {
		// TODO Auto-generated method stub
	}
	
	
	// --- Potongan ---
	
	public double potonganTaperum() {
		return tarifTaperum.get(golongan.split("/")[0]);
	}

	public double potonganSewa() {
		if(sewa)
		return tarifSewa;
		else
		return 0.0;
	}

	public double potonganIwp() {
		return tarifIwp * (gajiBersih() + tunjanganAnak() + tunjanganPasutri());
	}
	
	public void potonganLain() {
		// TODO Auto-generated method stub
	}
	
	
	// --- PPH Interface ---
	
	public double potonganPph() {
		double temppkp = hitungPkp();
		if (temppkp > 0)
			return (hitungPkp() * tarifPph) / 12;
		else
			return 0;
	}

	public double hitungPkp() {
		double pkp = gajiKotor(), biayaJabatan, iuranPensiun;
		biayaJabatan = 0.05 * gajiKotor();
		iuranPensiun = 0.0475 * (gajiPokok() + tunjanganPasutri() + tunjanganAnak());
		if(pkp < 0) pkp = 0;
		return ((pkp-biayaJabatan-iuranPensiun)*12)-hitungPtkp();
	}
	
	public double hitungPtkp() {
		double a = anak;
		if(menikah) a++;
		return 36000000 + (3000000 * a);
	}

	public void slip() {
		System.out.println("========================================");
		System.out.println("Nama   : "+nama);
		System.out.println("NIP    : "+nip);
		System.out.println("----------------------------------------");
		System.out.println("Gaji Pokok : "+gaji.get("pokok"));
		for(Map.Entry<String, Double> tj : tunjangan.entrySet()) {
			System.out.println(tj.getKey()+" : "+tj.getValue());
		}
		System.out.println("----------------------------------------");
		System.out.println("Gaji Kotor : "+gaji.get("kotor"));
		System.out.println("----------------------------------------");
		for(Map.Entry<String, Double> pt : potongan.entrySet()) {
			System.out.println(pt.getKey()+" : "+pt.getValue());
		}
		System.out.println("----------------------------------------");
		System.out.println("Gaji Bersih : "+gaji.get("bersih"));
	}
	
	

	
	
	
	
}
