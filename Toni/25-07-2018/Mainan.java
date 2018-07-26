import java.util.*;
public class Mainan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int mainan = 0, produksi = 0, terjual = 0, saldo = 13000000;

	
		for (int hari = 0; hari < 7; hari++) {
			System.out.println("\nHari Ke-"+(hari+1)+"\n------------------------------");
			produksi = rand.nextInt(500)+1501;
			saldo -= (produksi * 5000);
			mainan += produksi;
			terjual = (mainan * (rand.nextInt(50)+51))/100;
			saldo += terjual * 6500;
			mainan = mainan - terjual;
			System.out.println("Mainan Diproduksi : "+produksi);
			System.out.println("Mainan Dijual     : "+terjual);
			System.out.println("Sisa Mainan       : "+mainan);
			System.out.println("Saldo dipakai     : "+(produksi * 5000));
			System.out.println("Saldo didapat     : "+(terjual * 6500));
			System.out.println("------------------------------\nSisa Saldo        : "+saldo+"\n");

		}

	}

	
}