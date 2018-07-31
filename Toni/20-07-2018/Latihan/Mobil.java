import static java.lang.System.*;
import java.util.Scanner;

public class Mobil{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double kecepatan1 = 30, kecepatan2 = 35, kecepatan3 = 45,
		bensin1 = 15, bensin2 = 10, bensin3 = 10, jarak;

		out.print("Masukan Jarak : ");
		jarak = input.nextInt();

		out.println("Mobil Tercepat : Mobil 3\n--------------------");
		out.println("Penggunaan   : "+(jarak / bensin3)+" Liter");
		out.println("Waktu Tempuh : "+(jarak / kecepatan3)+" Jam\n");
		out.println("Mobil Terhemat : Mobil 1\n--------------------");
		out.println("Penggunaan   : "+(jarak / bensin1)+" Liter");
		out.println("Waktu Tempuh : "+(jarak / kecepatan1)+" Jam");


	}
}
