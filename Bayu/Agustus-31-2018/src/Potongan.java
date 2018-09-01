
public class Potongan {
	double pph, biayaJabatan, gajiKotor, gapok, tunjanganKeluarga, iuranPensiun, netto,
	nettoTahun, ptkp, pkt, pphBulan, bpjsKet, bpjsKes;
	String keluarga;
	
	double hitungPph() {
		biayaJabatan = (0.05 * gajiKotor);
		iuranPensiun = (0.0475 * gapok + tunjanganKeluarga);
		netto = gajiKotor - biayaJabatan - iuranPensiun;
		nettoTahun = netto * 12;
		
		if (keluarga.equals("sudah")) {
			ptkp = 36000000;
		}
		else if (keluarga.equals("belum")) {
			ptkp = 39000000;
		}
		
		pkt = nettoTahun - ptkp;
		pph = pkt * 0.05;
		pphBulan = pph / 12;	
		return pphBulan;
	}
	
	double bpjsKet () {
		bpjsKet = gapok * 0.01;
		return bpjsKet;
	}
	
	double bpjsKes () {
		bpjsKes = gapok * 0.01;
		return bpjsKes;
	}
}
