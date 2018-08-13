import java.util.*;
public class NilaiAptitude{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int nilaiLogic, nilaiPattern, nilaiComplex, nilaiRatarata, month = 0;
		String name;
		
		System.out.print("Masukan Nama : ");
		name = keyboard.next();

		System.out.print("Masukan nilai Logic : ");
		nilaiLogic = keyboard.nextInt();

		System.out.print("Masukan nilai Pattern : ");
		nilaiPattern = keyboard.nextInt();

		System.out.print("Masukan nilai Complex : ");
		nilaiComplex = keyboard.nextInt();

		nilaiRatarata = (nilaiLogic + nilaiComplex + nilaiPattern) / 3;

		if (nilaiRatarata < 70) {
			System.out.println("\nMaaf "+name+", anda tidak lulus Aptitude");
			month = 6;
		}else if(nilaiRatarata > 70){
			month = 3;
			if (nilaiRatarata > 73) System.out.println("\nSelamat "+name+", anda telah lulus Aptitude");
			if (nilaiRatarata > 80) month = 1;
		}

			System.out.println("Anda akan mengikuti bootcamp selama "+month+" bulan.");


	}
}