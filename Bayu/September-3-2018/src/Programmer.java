import java.util.HashMap;

public class Programmer extends Karyawan implements Umk, Tunjangan, Potongan {
	int lamaKerja, umk, jamLembur, bonus, ptkp, tunjanganPegawai;
	double indeksGapok, lembur, tunjanganKeluarga, pphTahun, tunjanganTransport, biayaJabatan, iuranPensiun, bpjs, netto, 
	pph12, pph, nettoTahun, pkt, gajiTotal;
	String level, divisi, keluarga;
	HashMap<Integer, Double> programmerJunior = new HashMap<Integer, Double>();
	HashMap<Integer, Double> programmerMiddle = new HashMap<Integer, Double>();
	HashMap<Integer, Double> programmerSenior = new HashMap<Integer, Double>();
	HashMap<Integer, Integer> tnjngnPgw = new HashMap<Integer, Integer>();
	
	public Programmer(String nama, int nik, String tempatKerja, int lamaKerja, String divisi, String level, String keluarga, int jamLembur, int bonus) {
		super(nama, nik, tempatKerja);
		this.lamaKerja = lamaKerja;
		this.level = level;
		this.keluarga = keluarga;
		this.divisi = divisi;
		this.jamLembur = jamLembur;
		this.bonus = bonus;
	}

	void setHashMapGapok() {
		programmerJunior.put(0, 1.0);
		programmerJunior.put(2, 1.2);
		programmerJunior.put(4, 1.5);
		programmerMiddle.put(0, 1.7);
		programmerMiddle.put(2, 1.8);
		programmerMiddle.put(4, 2.1);
		programmerSenior.put(1, 2.5);
		programmerSenior.put(3, 2.7);
		programmerSenior.put(4, 2.8);
	}
	
	void setTunjPegawai() {
		tnjngnPgw.put(1, 100000);
		tnjngnPgw.put(2, 200000);
		tnjngnPgw.put(3, 300000);
	}
	
	void indeksGapok() {
		if (level.equals("junior")) {
			if (lamaKerja >= 0 && lamaKerja <= 1) {
				indeksGapok = programmerJunior.get(0);
			}
			else if (lamaKerja >= 2 && lamaKerja <= 3) {
				indeksGapok = programmerJunior.get(2);
			}
			else if (lamaKerja > 3) {
				indeksGapok = programmerJunior.get(4);
			}			
		}
		else if (level.equals("middle")) {
			if (lamaKerja >= 0 && lamaKerja <= 2) {
				indeksGapok = programmerMiddle.get(0);
			}
			else if (lamaKerja >= 3 && lamaKerja <= 4) {
				indeksGapok = programmerMiddle.get(2);
			}
			if (lamaKerja >= 4) {
				indeksGapok = programmerMiddle.get(4);
			}
		}
		else if (level.equals("senior")) {
			if (lamaKerja >= 0 && lamaKerja <= 2) {
				indeksGapok = programmerSenior.get(1);
			}
			else if (lamaKerja >= 3 && lamaKerja <= 4) {
				indeksGapok = programmerSenior.get(3);
			}
			if (lamaKerja >= 4) {
				indeksGapok = programmerSenior.get(4);
			}
		}
	}
	
	
	@Override
	public int hitungUmk() {
		if (tempatKerja.equals("jakarta")) {
			umk = umkJkt;
		}
		else if (tempatKerja.equals("bandung")) {
			umk = umkBdg;
		}
		else if (tempatKerja.equals("surabaya")) {
			umk = umkSby;
		}
		else if (tempatKerja.equals("karawang")) {
			umk = umkKrwng;
		}
		return umk;
	}
	
	double hitungGapok() {
		gapok = (int) (umk * indeksGapok);
		return gapok;
	}
	
	

	@Override
	public double hitungLembur() {
		lembur = lmbr * jamLembur * gapok; 
		return lembur;
	}

	@Override
	public double hitungTunjanganKeluarga() {
		tunjanganKeluarga = tnjngnKlrg * gapok;
		return tunjanganKeluarga;
	}

	@Override
	public double hitungTunjanganTransport() {
		if (tempatKerja.equals("jakarta")) {
			tunjanganTransport = tnjngnTrnsprt;
		}
		return tunjanganTransport;
	}
	
	
	
	int hitungTunjanganPegawai() {
		if (level.equals("junior")) {
			tunjanganPegawai = tnjngnPgw.get(1);
		}
		else if (level.equals("middle")) {
			tunjanganPegawai = tnjngnPgw.get(2);
		}
		else if (level.equals("senior")) {
			tunjanganPegawai = tnjngnPgw.get(3);
		}
		return tunjanganPegawai; 
	}
	
	int hitungBonus() {
		if (bonus > 0 && bonus <= 25) {
			bonus = bonus * 20000;
		}
		return bonus;
	}
	
	@Override
	public void hitungBpjs() {
		bpjs = bpjs1 * gapok;		
	}
	
	double hitungNetto() {
		biayaJabatan = 0.05 * gapok;
		iuranPensiun = 0.0475 * gapok + tunjanganKeluarga;
		netto = gapok + tunjanganKeluarga - biayaJabatan - iuranPensiun;
		return netto;
	}

	@Override
	public void hitungPtkp() {
		nettoTahun = netto * 12;
		if (keluarga.equals("sudah")) {
			ptkp = ptkpMenikah;
		}
		else if (keluarga.equals("belum")) {
			ptkp = ptkpSingle;
		}		
		pkt = nettoTahun - ptkp;
	}

	@Override
	public void hitungpkp() {
		if (pkt <= 50000000) {
			pphTahun = 0.05; 
		}
		else if (pkt > 50000000 && pkt <= 250000000) {
			pphTahun = 0.15; 
		}
		else if (pkt > 250000000 && pkt <= 500000000) {
			pphTahun = 0.25; 
		}
		else if (pkt > 500000000) {
			pphTahun = 0.3; 
		}
		
		pph12 = pkt * pphTahun;
		pph = pph12 / 12;		
	}
	
	double hitungGajiTotal() {
		gajiTotal = gapok + lembur + bonus + tunjanganKeluarga + tunjanganTransport + tunjanganPegawai - bpjs - pph;
		return gajiTotal;
	}
	
	void tampilkan() {
		System.out.println(" ");
		System.out.println("Gaji pokok anda adalah             = Rp. " +gapok);
		System.out.println("======================================================================");
		System.out.println("Tunjangan");
		System.out.println("lembur anda adalah                 = Rp. " +lembur);
		System.out.println("Tunjangan Keluarga anda adalah     = Rp. " +tunjanganKeluarga);
		System.out.println("Tunjangan Transport anda adalah    = Rp. " +tunjanganTransport);
		System.out.println("Tunjangan Pegawai anda adalah      = Rp. " +tunjanganPegawai);
		System.out.println("Bonus anda adalah                  = Rp. " +bonus);
		System.out.println("======================================================================");
		System.out.println("Potongan");
		System.out.println("Potongan BPJS anda adalah          = Rp. " +bpjs);
		System.out.println("Potongan PPh anda adalah           = Rp. " +pph);
		System.out.println("Bonus anda adalah                  = Rp. " +bonus);
		System.out.println("======================================================================");
		System.out.println("Gaji Total");
		System.out.println("Gaji Total anda adalah             = Rp. " +gajiTotal);
		System.out.println("======================================================================");
	}
}