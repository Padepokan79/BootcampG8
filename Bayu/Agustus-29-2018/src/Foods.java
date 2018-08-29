
public class Foods extends Goods {
	double calories;
	
	Foods( String des, double pr, double cal) {
		super (des, pr);
		calories = cal;
	}
	
	void display() {
		super.display();
		System.out.println("calories : " +calories);
	}
}
