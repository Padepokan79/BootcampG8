import java.util.HashMap;
import java.util.ArrayList;
public class PG extends Karyawan  implements UMK , potongan, tunjangan {
	//Variable
	private double bonus , jamLembur;
	private String tingkatKerja , statusKeluarga;
	private int masaKerja;
	HashMap<String , Double> tunjanganPegawai = new HashMap<String , Double>();
	HashMap<String , ArrayList> gapok = new HashMap<String , ArrayList>();
	ArrayList<Double> junior = new ArrayList<Double>();
	ArrayList<Double> middle = new ArrayList<Double>();
	ArrayList<Double> senior = new ArrayList<Double>();
	public PG() {
		super();
		setTunjanganPegawai();
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double jumlahBug) {
		if(jumlahBug > 25) {
			bonus = 500000;
		}
		else
			bonus = jumlahBug * 20000;
	}
	public String getTingkatKerja() {
		return tingkatKerja;
	}

	public void setTingkatKerja(String tingkatKerja) {
		this.tingkatKerja = tingkatKerja;
	}

	public int getMasaKerja() {
		return masaKerja;
	}

	public void setMasaKerja(int masaKerja) {
		this.masaKerja = masaKerja;
	}
	

	public String getStatusKeluarga() {
		return statusKeluarga;
	}


	public double getJamLembur() {
		return jamLembur;
	}

	public void setJamLembur(double jamLembur) {
		this.jamLembur = jamLembur;
	}

	public void setStatusKeluarga(String statusKeluarga) {
		this.statusKeluarga = statusKeluarga;
	}
	
	public double getUMK() {
		double umk = 0;
		if(getPenempatanKerja().equalsIgnoreCase("bandung")) {
			umk = bandung;
		}
		else if(getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			umk = jakarta;
		}
		else if(getPenempatanKerja().equalsIgnoreCase("karawang")) {
			umk = karawang;
		}
		else if(getPenempatanKerja().equalsIgnoreCase("surabaya")) {
			umk = surabaya;
		}
		return umk;
	}
	void setGapok() {
		double umk = getUMK();
		junior.add(umk);
		junior.add(umk);
		junior.add(umk*1.2);
		junior.add(umk*1.2);
		junior.add(umk*1.5);
		middle.add(umk*1.7);
		middle.add(umk*1.7);
		middle.add(umk*1.7);
		middle.add(umk*1.8);
		middle.add(umk*1.8);
		middle.add(umk*2.1);
		senior.add(umk*2.5);
		senior.add(umk*2.5);
		senior.add(umk*2.5);
		senior.add(umk*2.7);
		senior.add(umk*2.7);
		senior.add(umk*2.8);
		gapok.put("junior", junior);
		gapok.put("middle", middle);
		gapok.put("senior", senior);
	}
	public double getGapok() {
		setGapok();
		double gaJipok;
		String tingkat = getTingkatKerja();
		int masaKerja = getMasaKerja();
		if(tingkat.equals("junior")) {
			if(masaKerja>4) {
				masaKerja = 4;
			}
		}
		else {
			if(masaKerja>5) {
				masaKerja = 5;
			}
		}
		gaJipok =  (double) gapok.get(tingkat).get(masaKerja);
		
		return gaJipok;
	}
	
	public void setTunjanganPegawai() {
		tunjanganPegawai.put("junior" , (double) 100000);
		tunjanganPegawai.put("middle" , (double) 200000);
		tunjanganPegawai.put("senior" , (double) 300000);
		
	}
	public double getTunjanganPegawai() {
		
		return tunjanganPegawai.get(getTingkatKerja());
	}
	
	public double getTunjanganKeluarga() {
		double tunjanganKeluarga = 0;
		if(getStatusKeluarga().equalsIgnoreCase("y")) {
			tunjanganKeluarga += jumlahTunjanganKeluarga * getGapok();
		}
		return tunjanganKeluarga;
	}
	public double getTunjanganKhusus() {
		double tunjanganKhusus = 0;
		if(getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			tunjanganKhusus += tunjanganTransport;
		}
		return tunjanganKhusus;
	}
	
	public double getBpjs() {
		return bpjs*getGapok()*2;
	}
	
	double getGajiKotor(){
		return getGapok()+getTunjanganPegawai()+getTunjanganKhusus()+getTunjanganKeluarga()+getBonus();
	}
	public double getPTKP(){
		double ptkpKu = ptkp;
		if(getStatusKeluarga().equalsIgnoreCase("y")) {
			ptkpKu += penambahanPtkp;
		}
		return ptkpKu;
	}
	public double getPKP() {
		double biayaJabatan = getGajiKotor()*biayaJabat , biayaPensiun , neto , netoPertahun , pkp;
		if(biayaJabatan> maksimalBiayaJabatan){
			biayaJabatan = maksimalBiayaJabatan;
		}
		biayaPensiun = (getGapok()+getTunjanganKeluarga())*biayaPensi;
		neto = getGajiKotor() - (biayaJabatan+biayaPensiun);
		netoPertahun = neto*12;
		double pkpSementara = netoPertahun - getPTKP();
		if(pkpSementara < 0){
			pkp = 0 ;
		}
		else{
			pkp = pkpSementara;
		}
		return pkp;
	}
	public double getPPH() {
		double pph = 0;
		double pkp = getPKP();
		if(pkp == 0) {
			pph = 0;
		}
		else {
			if(pkp >= batasPPH50) {
				pph += (pphDibawah50*batasPPH50)/12;
				pkp -= batasPPH50;
				if(pkp >= batasPPH250) {
					pph += (pphDibawah250*batasPPH250)/12;
					pkp -= batasPPH250;
					if(pkp >= batasPPH500) {
						pph += (pphDibawah500*batasPPH500)/12;
						pkp -= batasPPH500;
						if(pkp > 0) {
							pph+= (pphDiatas500*pkp)/12;
						}
					}
					else {
						pph += (pphDibawah500*pkp)/12;
					}
				}
				else {
					pph += (pphDibawah250*pkp)/12;
				}
			}
			else {
				pph = (pphDibawah50*pkp)/12;
			}
			
		}
		return pph;
	}

	
	public double getGajiLembur() {
		return lemburPerjam*getJamLembur()*getGapok();
	}
	double getPenghasilan() {
		return getGajiKotor()+getGajiLembur();
	}
	double getPotongan() {
		return getBpjs() + getPPH();
	}
	double getGajiBersih() {	
		return (long)getPenghasilan()-getPotongan();
	}
	void slipGaji() {
		System.out.println("===========================================");
		System.out.println("Nama\t\t\t: "+getNama());
		System.out.println("Nik\t\t\t: "+getNik());
		System.out.println("Gapok\t\t\t: "+getGapok());
		System.out.println("-------------------------------------------");
		System.out.println("Lembur\t\t\t: "+getGajiLembur());
		System.out.println("Tunjangan Pegawai\t: "+getTunjanganPegawai());
		System.out.println("Tunjangan Khusus\t: "+getTunjanganKhusus());
		System.out.println("Tunjangan Keluarga\t: "+getTunjanganKeluarga());
		System.out.println("Bonus\t\t\t: "+getBonus());
		System.out.println("-------------------------------------------");
		System.out.println("Jumlh Penghasilan\t: "+getPenghasilan());
		System.out.println("-------------------------------------------");
		System.out.println("Potongan BPJS Kesehatan: "+getBpjs()/2);
		System.out.println("Potongan BPJS Ketenagakerjaan"+getBpjs()/2);
		System.out.println("Potongan PPH\t: "+getPPH());
		System.out.println("-------------------------------------------");
		System.out.println("Jumlah Potongan\t\t: "+getPotongan());
		System.out.println("-------------------------------------------");
		System.out.println("Gaji Bersih\t\t: "+getGajiBersih());
		
		
	}
}
