import java.util.Scanner;
public class Main {
	static String[] fruit = {"Semangka", "Pisang", "Mangga"};
	static int[] p = {18000,15000,10000};
	static int[][] s = {
			{12, 15, 11, 8, 20, 10, 14},
			{10, 14, 15, 7, 20, 13, 16},
			{13, 12, 9, 15, 20, 9, 13}
	};
	
	static Pedagang semangka = new Pedagang(fruit[0], p[0], s[0]);
	static Pedagang pisang = new Pedagang(fruit[1], p[1], s[1]);
	static Pedagang mangga = new Pedagang(fruit[2], p[2], s[2]);
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
		String choice = "";
		String[] menu = {" Hitunglah Penghasilan Pedagang buah setiap harinya.", 
				" Hitunglah penghasilan pedagang selama seminggu.", 
				" Hitunglah penghasilan pedagang selama sebulan.",
				" Pada hari apa pedagang mendapatkan penghasilan terbesar dan berapa jumlah  penghasilanya.",
				" Pada hari apa pedagang mendapatkan penghasilan terkecil dan berapa jumlah  penghasilanya.",
				" Berapakah perbandingan penghasilan pedagang pada hari minggu dan hari kamis.",
				" Hitunglah buah yang paling banyak terjual selama seminggu.",
				" Buah yang memiliki penghasilan penjualan terbesar selama seminggu.", 
				" Buah yang memiliki penghasilan penjualan terkecil selama seminggu.",
				"Hitung Penghasilan Laba penjual selama sebulan, jika penjual mengambil untuk  sebanyak 20% dari harga jual."};
		
		//Daily Salary
		do {
			System.out.println("Menu : ");
			for(int m = 0; m < menu.length; m++) {
				System.out.println((m+1)+". "+menu[m]);
				if(m == 9) {System.out.println("00. Exit");}
			}
		}while(choice.equals("00"));
	}
	
	
	
	
}
