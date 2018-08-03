import static java.lang.System.*;
import java.util.Scanner;

public class Kredit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double kreditRumah, kreditMobil, sandangPangan = 0;
		double gaji = 8500000, hargaMobil = 45000000, hargaRumah = 125000000;

		out.print("Kredit Mobil per bulan (%) ");
		kreditMobil = input.nextDouble();

		out.print("Kredit Rumah per bulan (%) ");
		kreditRumah = input.nextDouble();


		if (kreditMobil <= 3.0 && kreditRumah <= 1.0) {
			sandangPangan = 50.0;
		}else if (kreditMobil <= 5.0 && kreditRumah <= 2.0) {
			sandangPangan = 35.0;
		}else if (kreditMobil <= 7.0 && kreditRumah <= 3.0) {
			sandangPangan = 25.0;
		}else {
			out.print("Maaf uang anda tidak mencukupi ");
		}

		gaji = gaji - (gaji * (sandangPangan/100));
		gaji = gaji - ((kreditRumah*hargaRumah)/100);
		gaji = gaji - ((kreditMobil*hargaMobil)/100);

		out.print("\nSisa uang untuk di tabung : Rp."+gaji+"\n");


	}
}
