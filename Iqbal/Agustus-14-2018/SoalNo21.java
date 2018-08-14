import java.util.Scanner;
public class SoalNo21{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Sebuah Kata");
		String kalimat = input.next();
		String[] kalimatBaru = new String[kalimat.length()];	
		int indexKalimatBaru = 0;
		for(int index = kalimat.length() ; index > 0 ; index--){
			kalimatBaru[indexKalimatBaru] = kalimat.substring((index-1),index);
			System.out.print(kalimatBaru[indexKalimatBaru]);
		}
	}
}