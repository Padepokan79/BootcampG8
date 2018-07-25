/*
AUTHOR : MUHAMAD IQBAL FARHAN MAULANA
Created
*/
import java.util.Scanner;

public class RekomendasiMobilIqbal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int mobil1 , mobil2 , mobil3 , bensin1 , bensin2 , bensin3 ;
		mobil1=30; mobil2=35 ; mobil3 = 45;
		bensin1 = 15 ; bensin2= 10 ; bensin3= 10;
		System.out.println("Berapa jarak yang ingin anda tempuh");
		
		int jarak = input.nextInt();
		System.out.println("Anda mau mobil 1.hemat / 2.cepat)");

		int pilih = input.nextInt();
		if(pilih == 1){
			System.out.println("Mobil Terhemat adallah mobil 1");
		}
		else if(pilih == 2){
			System.out.println("Mobil Tercepat adalah Nomor 3;");
		}

	}
}