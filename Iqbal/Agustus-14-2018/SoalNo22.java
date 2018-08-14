import java.util.Scanner;
public class SoalNo22{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan Sebuah Kalimat");
		String kalimat = input.nextLine();
		String[] arrKalimat = new String[kalimat.length()];
		int jumlahAngka = 0 ;
		for(int index = 0 ; index < kalimat.length() ; index ++ ){
			arrKalimat[index] = kalimat.substring(index,(index+1));
		}

		System.out.print("Apa Angka Yang Ingin Kamu cari :");
		String cari = input.next();

		for(int index = 0 ; index < kalimat.length() ; index ++){
			String baru = arrKalimat[index]; 
			if( baru.equals(cari) ){
				jumlahAngka ++;
				System.out.print("true");
			}
			 //System.out.print(arrKalimat[index]); 
		}

		System.out.print("Kalimat : "+kalimat);
		System.out.print("Kata yang di cari : "+cari+" , Jumlah : "+jumlahAngka);
	}
}