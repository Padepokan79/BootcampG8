
public class HitungGajiSystemAnalist extends TesHitungGaji {
	int lamaBekerja, umk;
	String level, tempatBekerja;
	Double gapok;
	
	int krwng = 3919291;
	int jkt = 3648035;
	int bdg = 3091345;
	int srby = 3583312;
	
	int umk() {
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
		return umk;
	}
	
	Double gajiSystemAnalist() {
		if (level.equals ("junior")) {
			if (lamaBekerja <= 1) {
				gapok = (double) (1.2 * umk) ;
			}
			else if (lamaBekerja > 1 && lamaBekerja <= 3) {
				gapok = (double) (1.3 * umk) ;
			}
			else if (lamaBekerja > 3) {
				gapok = (double) (1.6 * umk) ;
			}
		}
		else if (level.equals("middle")) {
			if (lamaBekerja <= 2) {
				gapok = (double) (1.8 * umk );
			}
			else if (lamaBekerja >2 && lamaBekerja <= 4) {
				gapok = (double) (1.9 * umk );
			}
			else if (lamaBekerja > 4) {
				gapok = (double) (2.2 * umk );
			}
		}
		else if (level.equals("senior")) {
			if (lamaBekerja <= 2) {
				gapok = (double) (2.7 * umk);
			}
			else if (lamaBekerja > 2 && lamaBekerja <= 4) {
				gapok = (double) (2.9 * umk);
			}
			else if (lamaBekerja > 4) {
				gapok = (double) (3 * umk);
			}
		}
		return gapok;
	}
	
	void tampilkan () {
		System.out.println("Gaji UMK anda adalah   : Rp " +umk);
		System.out.println("Gaji Pokok anda adalah : Rp " +gapok);
	}
}