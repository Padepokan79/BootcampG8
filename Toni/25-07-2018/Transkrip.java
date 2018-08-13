import java.util.*;
public class Transkrip{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int nilai; 
		String nama;

		System.out.print("\nMasukan Nama: ");
		nama = input.next();

		System.out.print("Masukan Nilai: ");
		nilai = input.nextInt();

		if(nilai < 50){
			System.out.println("Maaf "+nama+", Anda Tidak lulus dengan nilai E");
		}else if(nilai > 50 && nilai <= 65){
			System.out.println("Selamat "+nama+", Anda lulus dengan nilai D");
		}else if(nilai > 65 && nilai <= 75){
			System.out.println("Selamat "+nama+", Anda lulus dengan nilai C");
		}else if(nilai > 75 && nilai <= 85){
			System.out.println("Selamat "+nama+", Anda lulus dengan nilai B");
		}else if(nilai > 85 && nilai <= 100){
			System.out.println("Selamat "+nama+", Anda lulus dengan nilai A");
		}

	}
}