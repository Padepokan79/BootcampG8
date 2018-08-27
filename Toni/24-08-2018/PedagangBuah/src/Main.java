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
		do {
			System.out.println("Menu : ");
			for(int m = 0; m < menu.length; m++) {
				System.out.println((m+1)+". "+menu[m]);
				if(m == 9) {System.out.println("00. Exit");}
			}
			choice = input.next();
		}while(!choice.matches("[0-9]+"));
		switch(choice) {
			case "1":
				menu1();
			break;
			case "2":
				menu2();
			break;
			case "3":
				menu3();
			break;
			case "4":
				menu4();
			break;
			case "5":
				menu5();
			break;
			case "6":
				menu6();
			break;
			case "7":
				menu7();
			break;
			case "8":
				menu8();
			break;
			case "9":
				menu9();
			break;
			case "10":
				menu10();
			break;
			case "00":
				System.out.println("Goodbye");
			break;
			default:
				System.out.println("Invalid Choice");
		}
		}while(!choice.equals("00"));
	}
	
	public static void menu1(){
		System.out.println("Pendapatan Harian : ");
		for(int day = 1; day <= 7; day++) {
			System.out.println("Hari Ke-"+day+" : "+(pisang.dailySalary(day)+semangka.dailySalary(day)+mangga.dailySalary(day)));
		}
	}
	
	public static void menu2(){
		System.out.println("Pendapatan Seminggu : "+(pisang.weeklySalary()+semangka.weeklySalary()+mangga.weeklySalary()));
	}
	
	public static void menu3(){
		System.out.println("Pendapatan Seminggu : "+(4*(pisang.weeklySalary()+semangka.weeklySalary()+mangga.weeklySalary())));
	}
	
	public static void menu4(){
		int[] max = {0,0};
		for(int day = 1;day <= 7;day++) {
			int today = (pisang.dailySalary(day)+semangka.dailySalary(day)+mangga.dailySalary(day));
			if (today > max[1]) {
				max[0] = day;
				max[1] = today;
			}
		}
		System.out.println("Penghasilan terbesar pada hari Ke-"+max[0]+" : "+max[1]);
	}
	
	public static void menu5(){
		int[] min = {0,0};
		for(int day = 1;day <= 7;day++) {
			int today = (pisang.dailySalary(day)+semangka.dailySalary(day)+mangga.dailySalary(day));
			if (today < min[1] || min[1] == 0) {
				min[0] = day;
				min[1] = today;
			}
		}
		System.out.println("Penghasilan terbesar pada hari Ke-"+min[0]+" : "+min[1]);
	}
	
	public static void menu6(){
		int[] salary = {daily(4), daily(7)};
		if(salary[0] > salary[1])
			salary[0] = salary[0] - salary[1];
		else
			salary[0] = salary[1] - salary[0];
			
		System.out.println("Perbandingan Penghasilan Hari minggu dan kamis : "+salary[0]);
	}
	
	public static void menu7() {
		int[] buah = new int[3], max = {0, 0};
		for(int i = 0; i < 3; i++) {
			for(int d = 0; d < 7; d++) {
				buah[i] += s[i][d];
			}
			if(max[1] == 0) {
				max[0] = i;
				max[1] = buah[0];
			}else if(max[1] < buah[i]){
				max[0] = i;
				max[1] = buah[0];
			}
		}
		System.out.println("buah yang paling banyak terjual selama seminggu"+buah[1]);
	}
	
	public static void menu8() {
		int[] buah = {semangka.weeklySalary(), pisang.weeklySalary(), mangga.weeklySalary()}, max = {0,0};
		for(int i = 0; i < 3; i++) {
			if(buah[i] > max[1]) {
				max[0] = i;
				max[1] = buah[i];
			}
		}
		System.out.println("buah yang memiliki penghasilan terkecil adalah "+fruit[max[0]]+" sebesar "+max[1]);
	}
	
	public static void menu9() {
		int[] buah = {semangka.weeklySalary(), pisang.weeklySalary(), mangga.weeklySalary()}, max = {0,0};
		for(int i = 0; i < 3; i++) {
			if(buah[i] < max[1] || max[0] == 0) {
				max[0] = i;
				max[1] = buah[i];
			}
		}
		System.out.println("buah yang memiliki penghasilan terkecil adalah "+fruit[max[0]]+" sebesar "+max[1]);
	}
	
	public static void menu10() {
		int[] buah = {semangka.weeklySalary(), pisang.weeklySalary(), mangga.weeklySalary()};
		int sal = 0;
		
		for(int i = 0; i < 3; i++) {
			sal += buah[i]*0.2;
		}
		System.out.println("Laba sebulan adalah "+sal);
	}
	public static int daily(int day) {
		return (pisang.dailySalary(day)+semangka.dailySalary(day)+mangga.dailySalary(day));
	}
}
