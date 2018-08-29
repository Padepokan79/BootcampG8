
public class KeretaApi {
	String classes;
	private int ticketPrice;
	private int[] passenger = new int[7];
	
	KeretaApi(){
	}
	
	KeretaApi(String kelas, int tp, int[] dp){
		classes = kelas;
		ticketPrice = tp;
		passenger = dp;
	}
	
	void Setprice(int tp){
		ticketPrice = tp;
	}
	
	void setPassanger(int[] dp){
		passenger = dp;
	}
	
	// Find the daily Salary
	int dailySalary(int day) {
		return  passenger[day - 1] * ticketPrice;
	}
	
	// Find the Weekly Salary
	int weeklySalary() {
		int ws = 0;
		for(int day = 1;day <= 7;day++) {
			ws += dailySalary(day);
		}
		return ws;
	}
	
}
