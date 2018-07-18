import java.util.Scanner;

public class Ayah{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int umur , umurAnak , kaya , ganteng;
		umurAnak = 23 ;
		boolean syarat;

		System.out.println("Hallo saya Sedang Mencarikan Pasangan Untuk anak saya");
		System.out.println("Umur anak Saya yaitu 23 , Jika Bersedia Silahkan Jawab");
		System.out.println("Berapakah Umur kamu ?");
		umur = input.nextInt();
		System.out.println("Berapa Jutakah Penghasilanmu Sekarang?");
		kaya = input.nextInt();
		System.out.println("Seberapa gantengkah kamu ? (1-10)");
		ganteng = input.nextInt();
		syarat = (umur >= (umurAnak-5) && umur <= (umurAnak+5) && (kaya >= 5 || ganteng >=8));
		System.out.println("Jadi hasilnya" + syarat);
	}
}