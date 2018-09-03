import java.util.HashMap;

public class SystemAnalist extends Karyawan implements Umk, Tunjangan, Potongan {
		int lamaKerja, umk, jamLembur, bonus, ptkp, tunjanganPegawai;
		double indeksGapok, lembur, tunjanganKeluarga, pphTahun, tunjanganTransport, biayaJabatan, iuranPensiun, bpjs, netto, 
		pph12, pph, nettoTahun, pkt, gajiTotal;
		String level, divisi, keluarga;
		HashMap<Integer, Double> systemAnalistJunior = new HashMap<Integer, Double>();
		HashMap<Integer, Double> systemAnalistMiddle = new HashMap<Integer, Double>();
		HashMap<Integer, Double> systemAnalistSenior = new HashMap<Integer, Double>();
		HashMap<Integer, Integer> tnjngnPgw = new HashMap<Integer, Integer>();
		
		public SystemAnalist(String nama, int nik, String tempatKerja, int lamaKerja, String divisi, String level, String keluarga, int jamLembur, int bonus) {
			super(nama, nik, tempatKerja);
			this.lamaKerja = lamaKerja;
			this.level = level;
			this.keluarga = keluarga;
			this.divisi = divisi;
			this.jamLembur = jamLembur;
			this.bonus = bonus;
		}

		void setHashMapGapok() {
			systemAnalistJunior.put(0, 1.2);
			systemAnalistJunior.put(2, 1.3);
			systemAnalistJunior.put(4, 1.6);
			systemAnalistMiddle.put(0, 1.8);
			systemAnalistMiddle.put(2, 1.9);
			systemAnalistMiddle.put(4, 2.2);
			systemAnalistSenior.put(1, 2.7);
			systemAnalistSenior.put(3, 2.9);
			systemAnalistSenior.put(4, 3.0);
		}
		
		void setTunjPegawai() {
			tnjngnPgw.put(1, 200000);
			tnjngnPgw.put(2, 300000);
			tnjngnPgw.put(3, 500000);
		}
		
		void indeksGapok() {
			if (level.equals("junior")) {
				if (lamaKerja >= 0 && lamaKerja <= 1) {
					indeksGapok = systemAnalistJunior.get(0);
				}
				else if (lamaKerja >= 2 && lamaKerja <= 3) {
					indeksGapok = systemAnalistJunior.get(2);
				}
				else if (lamaKerja > 3) {
					indeksGapok = systemAnalistJunior.get(4);
				}			
			}
			else if (level.equals("middle")) {
				if (lamaKerja >= 0 && lamaKerja <= 2) {
					indeksGapok = systemAnalistMiddle.get(0);
				}
				else if (lamaKerja >= 3 && lamaKerja <= 4) {
					indeksGapok = systemAnalistMiddle.get(2);
				}
				if (lamaKerja >= 4) {
					indeksGapok = systemAnalistMiddle.get(4);
				}
			}
			else if (level.equals("senior")) {
				if (lamaKerja >= 0 && lamaKerja <= 2) {
					indeksGapok = systemAnalistSenior.get(1);
				}
				else if (lamaKerja >= 3 && lamaKerja <= 4) {
					indeksGapok = systemAnalistSenior.get(3);
				}
				if (lamaKerja >= 4) {
					indeksGapok = systemAnalistSenior.get(4);
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
				bonus = 0;
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