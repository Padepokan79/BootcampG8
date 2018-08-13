import java.util.Scanner;
import java.util.*;

public class TebakAngka1 {
	public static void main(String[] args) {
		int random, tebak, jumlah;
		random = (int)(Math.random()*10);
		System.out.println("Tebaklah Angka Antara 1-10");
		Scanner masukan = new Scanner(System.in);
		jumlah=0;
		do{
			jumlah++;
			System.out.print("Masukan Tebakan Anda : ");
			tebak = masukan.nextInt();
			if(tebak>random){
				System.out.println("Tebakan anda Terlalu BESAR" );
			}
			else if (tebak < random) {
				System.out.println("Tebakan anda Terlalu KECIL" );
			}
			else {
				System.out.print("Tebakan Anda BENAR! Setelah " +jumlah+ " Kali Menebak" );
			}
		}while(tebak!=random);
	}
}