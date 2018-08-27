
public class Main {
	public static void main(String args[]) {
		int[] tp = {18000,35000,80000};
		int[][] penumpang = {
				{120, 100, 50, 30, 20, 150, 110},
				{50, 15, 13, 10, 20, 55, 60},
				{40, 21, 11, 16, 12, 35, 40}
		};
		String[] carClass = {"Ekonomi", "Bisnis", "Eksekutif"};
		
		KeretaApi ekonomi = new KeretaApi(carClass[0], tp[0], penumpang[0]);
		KeretaApi bisnis = new KeretaApi(carClass[1], tp[1], penumpang[1]);
		KeretaApi eksekutif = new KeretaApi(carClass[2], tp[2], penumpang[2]);
		
		//Daily Salary
		System.out.println("Pendapatan Harian : ");
		for(int day = 1; day <= 7; day++) {
			System.out.println("Hari Ke-"+day+" : "+(ekonomi.dailySalary(day)+bisnis.dailySalary(day)+eksekutif.dailySalary(day)));
		}
		
		System.out.println("\nPendapatan Mingguan : ");
		System.out.println("Minggu 1 : "+(ekonomi.weeklySalary()+bisnis.weeklySalary()+eksekutif.weeklySalary()));
	}
}
