
public class Pedagang {
	String fruit;
	private int price;
	private int[] sale = new int[7];
	
	Pedagang(){
	}
	
	Pedagang(String f, int p, int[] s){
		price = p;
		sale = s;
		fruit = f;
	}
	
	void Setprice(int p){
		price = p;
	}
	
	void setSalte(int[] s){
		sale= s;
	}
	
	// Find the daily Salary
	int dailySalary(int day) {
		return sale[day-1] * price;
	}
	
	// Find the Weekly Salary
	int weeklySalary() {
		int ws = 0;
		for(int day = 1;day <= 7;day++) {
			ws += dailySalary(day);
		}
		return ws;
	}
	
	int getMax() {
		int max = 0;
		for(int day = 1;day <= 7;day++) {
			int temp = dailySalary(day);
			if (temp > max)
				max = temp;
		}
		return max;
	}
	
	int getMin() {
		int min = 0;
		for(int day = 1;day <= 7;day++) {
			int temp = dailySalary(day);
			if (temp < min || min == 0)
				min = temp;
		}
		return min;
	}
	
	int getMaxSale() {
		int max = 0;
		for(int day = 1;day <= 7;day++) {
			if (sale[day] > max)
				max = sale[day];
		}
		return max;
	}

	int getMinSale() {
		int min = 0;
		for(int day = 1;day <= 7;day++) {
			if (sale[day] < min || min == 0)
				min = sale[day];
		}
		return min;
	}

	int netSalary() {
		return (int)(4 * (0.2 * weeklySalary()));
	}
}
