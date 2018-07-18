import java.util.Scanner;
public class Kakek {
	public static void main(String [] args){
		int umur , kaya ;
		Scanner input = new Scanner(System.in);
		boolean syarat ; 
		System.out.println("Berapakah Umur kamu sekarang ?");
		umur = input.nextInt();
		System.out.println("Berapa Jutakan Penghasilan Mu sekarang ?");
		kaya = input.nextInt();

		syarat = (umur >= 30 && kaya >= 5);
		System.out.println("Jadi Kamu dinyatakan " + syarat);
	}
}