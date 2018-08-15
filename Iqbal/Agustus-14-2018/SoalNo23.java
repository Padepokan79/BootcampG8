import java.util.Scanner;
public class SoalNo23{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan Nama / Kalimat");
		String kalimat = input.nextLine();
		int jumlahKarakter = kalimat.length();

		System.out.println("Kalimat : "+kalimat);
		System.out.println("Jumlah Karakter : "+ jumlahKarakter);
	}
}