import java.util.Scanner;
public class Ibu{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int umur , kaya , ganteng;
		boolean syarat;
		System.out.println("Berapakah Umur Kamu Sekarang ?");
		umur = input.nextInt();
		System.out.println("Berapa Jutakan penghasilan mu ?");
		kaya = input.nextInt();
		System.out.println("Seberapa Ganteng kah kamu (1-10)");
		ganteng = input.nextInt();

		syarat = (umur >= 17 && umur <= 30 && kaya >= 5 && ganteng >= 8);
		System.out.println("Jadi hasilnya adalah" + syarat);
	}
}