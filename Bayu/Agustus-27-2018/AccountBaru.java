
public class AccountBaru {
	private String nama;
	private int ktp, saldo, norek;
	
	AccountBaru(String nama, int ktp, int saldo, int norek) {
		super();
		this.nama = nama;
		this.ktp = ktp;
		this.saldo = saldo;
		this.norek = norek;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNama() {
		return nama;
	}

	public int getKtp() {
		return ktp;
	}

	public int getNorek() {
		return norek;
	}
	
	void tampilkan() {
		System.out.println("Nama       : " +getNama());
		System.out.println("No. KTP    : " +getKtp());
		System.out.println("No. Rek    : " +getNorek());
		System.out.println("Saldo      : " +getSaldo());
	}
	
	

}
