
public class Umk extends TesHitungGaji {
	int umk;
	String kota, tempatBekerja;
	
	int krwng = 3919291;
	int jkt = 3648035;
	int bdg = 3091345;
	int srby = 3583312;
	
	public Umk(String kota) {
		super();
		this.kota = kota;
	}
	
	
	
	public String getKota() {
		return kota;
	}



	public void setKota(String kota) {
		this.kota = kota;
	}



	void tampilkanUmk() {
		if (tempatBekerja.equals("bandung")) {
			umk = 3091345;
		}
		else if (tempatBekerja.equals("jakarta")) {
			umk = 3648035;
		}
		else if (tempatBekerja.equals("karawang")) {
			umk = 3919291;
		}
		else if (tempatBekerja.equals("surabaya")) {
			umk = 3583312;
		}
		System.out.println("Kota : " +kota+ " gaji : Rp. " +umk );
	}



	public void setKota1(String tempatKerja) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
