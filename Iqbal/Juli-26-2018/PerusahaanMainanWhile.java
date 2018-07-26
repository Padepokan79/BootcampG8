import java.util.Scanner ;
import java.util.Random ;
public class PerusahaanMainanWhile{
	public static void main(String[] args) {
		int saldoAwalPerushaan = 13000000 , modalMainan = 5000 , hargaJualMainan = 6500 , penghasilanPerhari , mainanPerhari , jualPerhari , sisaJual , jumlahJualPerhari;
		penghasilanPerhari = 0;
		mainanPerhari = 0;
		jumlahJualPerhari = 0 ;
		sisaJual = 0;
		int jumlahMainanPerhari = 0;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int hari = 1;
		int lamaPenjualan = 7;
		while(hari <= lamaPenjualan ){
			
			System.out.println("Hari Ke : " + hari );
			System.out.println("saldo Awal Perushaan : " + saldoAwalPerushaan);
			mainanPerhari = rand.nextInt(501)+1500;
			System.out.println("Jumlah Mainan Yang di buat Hari ini : " + mainanPerhari);
			saldoAwalPerushaan-= (5000*mainanPerhari);
			System.out.println("saldo Perushaan Setelah Membuat Mainan Hari ini: " + saldoAwalPerushaan);
			jumlahMainanPerhari = mainanPerhari+sisaJual;
			System.out.println("Jumlah Mainan Yang akan Dijual Hari ini : " + jumlahMainanPerhari);
			jualPerhari = rand.nextInt(51)+50;
			jumlahJualPerhari = jualPerhari * jumlahMainanPerhari / 100 ;
			System.out.println("Jumlah Mainan Terjual Hari ini : " + jumlahJualPerhari);
			penghasilanPerhari = jumlahJualPerhari*hargaJualMainan;
			System.out.println("saldo Penghasilan Perushaan hari ini : " + penghasilanPerhari);
			sisaJual = jumlahMainanPerhari - jumlahJualPerhari ;
			System.out.println("Sisa Mainan Hari ini : " + sisaJual);
			saldoAwalPerushaan += penghasilanPerhari ; 
			System.out.println("saldo Akhir Perushaan : " + saldoAwalPerushaan);
			System.out.println("\n\n\n");
			mainanPerhari = 0 ; 
			jumlahMainanPerhari = 0 ;
			jualPerhari = 0;
			jumlahJualPerhari = 0 ;
		    penghasilanPerhari = 0 ; 
			penghasilanPerhari = 0;
			hari ++	;
				 		

			//penghasilanPerhari = mainanPerhari*jualPerhari;


		}
		if(saldoAwalPerushaan >= 13000000){
			System.out.println("Untung , Dengan Keuntungan "+ (saldoAwalPerushaan - 13000000) );
		}
		else if(saldoAwalPerushaan <= 13000000 && saldoAwalPerushaan >= 0){
			System.out.println("Rugi , Dengan Kerugian : "+ (saldoAwalPerushaan - 13000000));
		}
		else{
			System.out.println("Rugi , Dengan Kerugian : "+ (saldoAwalPerushaan - 13000000) + ", Perusaan Bangkrut! ");	
		}
	}
}