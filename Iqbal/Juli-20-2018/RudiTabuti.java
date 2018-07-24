/*Author : Muhamad Iqbal Farhan Maulana*/
import java.util.Scanner ;
public class RudiTabuti{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double gajiRudi = 8500000 ;
		double hargaMobil = 45000000 ; int hargaRumah = 125000000 ;
		double sandangPangan = 0 ;
		double kreditMobil , kreditRumah , tabungan ;
		System.out.println("Masukan Jumlah Persen kredit Mobil");
		kreditMobil = input.nextDouble();
		System.out.println("Masukan Jumlah Persen kredit Rumah");
		kreditRumah = input.nextDouble();

		if(kreditMobil < 3 && kreditRumah < 1  ){
			sandangPangan = 0.5 * gajiRudi;
			kreditRumah = (kreditRumah/ 100) * hargaRumah  ;
			kreditMobil = (kreditMobil/ 100) * hargaMobil ;
			tabungan = gajiRudi - sandangPangan - kreditMobil - kreditRumah;
			System.out.println("Tabungan Rudi tabuti adalah Rp. "+ tabungan);
		}
		else if(kreditMobil < 5 && kreditRumah < 2  ){
			sandangPangan = 0.35 * gajiRudi;
			kreditRumah = (kreditRumah/ 100) * hargaRumah ;
			kreditMobil = (kreditMobil/ 100) * hargaMobil ;
			tabungan = gajiRudi - sandangPangan - kreditMobil - kreditRumah;
			System.out.println("Tabungan Rudi tabuti adalah Rp. "+ tabungan);
		}
		else if(kreditMobil < 7 && kreditRumah < 3  ){
			sandangPangan = 0.25 * gajiRudi;
			kreditRumah = (kreditRumah/ 100) * hargaRumah;
			kreditMobil = (kreditMobil/ 100) * hargaMobil;
			tabungan = gajiRudi - sandangPangan - kreditMobil - kreditRumah;
			System.out.println("Tabungan Rudi tabuti adalah Rp. "+ tabungan);
		}
		else
			System.out.println("=> maaf uang anda tidak mencukupi");
	}
}