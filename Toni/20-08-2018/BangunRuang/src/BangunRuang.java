import java.util.*;
public class BangunRuang {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String shape;
		Bangun build = new Bangun();
		int[] data = new int[1];
		do {
			System.out.print("Masukan Bangun (Balok, Kubus, Bola, Tabung) \n > ");
			shape = input.nextLine().toLowerCase();
		}while(shape.equals("balok") && shape.equals("kubus") && shape.equals("tabung") && shape.equals("bola"));
		// Balok
		if(shape.equals("balok")) {
			data = new int[1];
			System.out.print("Masukan Nilai Sisi > ");
			data[0] = input.nextInt();
		// Parameter Kubus
		}else if(shape.equals("kubus")) {
			data = new int[3];
			System.out.print("Masukan Nilai Panjang > ");
			data[0] = input.nextInt();
			System.out.print("Masukan Nilai Lebar > ");
			data[1] = input.nextInt();
			System.out.print("Masukan Nilai Tinggi > ");
			data[2] = input.nextInt();
		// Parameter Bola
		}else if(shape.equals("bola")) {
			data = new int[1];
			System.out.print("Masukan Nilai Rusuk > ");
			data[0] = input.nextInt();
		// Parameter Tabung
		}else if(shape.equals("tabung")) {
			data = new int[2];
			System.out.print("Masukan Nilai Rusuk > ");
			data[0] = input.nextInt();
			System.out.print("Masukan Nilai Tinggi > ");
			data[1] = input.nextInt();
		}
		
		
		
		
		build.calc(shape, data);
	}
}
