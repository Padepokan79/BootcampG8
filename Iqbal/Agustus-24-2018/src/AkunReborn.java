//Author : Muhamad Iqbal FM 20-Agustus-2018
import java.util.Scanner;
public class AkunReborn {
	private String noRekening , namaPemilik , pin , pinTemp  ;
	private int saldo , tabungan = 0;
	//get Method
	String getNoRekening() {
		return noRekening;
	}
	String getNamaPemilik() {
		return namaPemilik;
	}
	String getPin() {
		return pin;
	}
	int getSaldo() {
		return saldo;
	}
	int getTabungan() {
		return tabungan;
	}
	
	//set Metod
	void setNoRekening(String noRekening) {
		this.noRekening = noRekening;
	}
	void setNamaPemilik(String namaPemilik) {
		this.namaPemilik = namaPemilik;
	}
	void setPin(String pin) {
		this.pin = pin;
	}
	
	Scanner input = new Scanner(System.in);
	
	AkunReborn(){		
	}
	
	
	
	//Registrasi Akun
	void register(String noRekeningKu , String namaPemilikKu , String pinKu , int saldoKu) {
		noRekening = noRekeningKu;
		namaPemilik = namaPemilikKu;
		pin = pinKu;
		saldo = saldoKu;
	
	}
	//output biodata
	void tampilAkun() {
		System.out.println("NO Rekening	: "+noRekening);
		System.out.println("Nama Pemilik	: "+namaPemilik);
	}
	
	//Buat Validasi PIN
	void validasi() {
		do {
			System.out.println("Masukan Pin");
			pinTemp = input.next();
		}
		while(!pinTemp.equals(pin));
	}
	
	//Cek Saldo
	void cekSaldo() {
		validasi();
		System.out.println("Saldo anda : Rp. "+saldo);
	}
	
	void menabung() {
		validasi();
		System.out.println("Masukan Berapa Anda ingin Menabung :");
		tabungan = input.nextInt();
		saldo += tabungan ;
		tabungan = 0;
	}
	void tarikTunai() {
		validasi();
		System.out.println("Masukan Berapa Anda ingin Mengambil :");
		tabungan = input.nextInt();
		saldo -= tabungan ;
		tabungan = 0;
	}
	
	
}
