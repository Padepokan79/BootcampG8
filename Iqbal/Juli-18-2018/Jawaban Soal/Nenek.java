import java.util.Scanner;
public class Nenek {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int umur , ganteng , kaya  ;
		boolean syarat;
		System.out.println("Selamat datang di aplikasi perjodohan");
		System.out.println("Berapakah Umur kamu sekarang :");
		umur = input.nextInt();
		System.out.println("Seberapa Ganteng kah kamu (1 - 10)");
		ganteng = input.nextInt();
		System.out.println("Berapa Jutakah penghasilan Mu");
		kaya = input.nextInt();

		syarat = (umur > 27 && umur <40 && (ganteng >= 8 || kaya >= 5) );

		System.out.println("Jadi Kamu dinyatakan" + syarat);
	}
}