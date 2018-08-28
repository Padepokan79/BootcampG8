
public class ToySG extends GoodsSGA{
	private int minimumAge;

	public ToySG(String des, double pr, int quant, int minimumAge) {
		super(des, pr, quant);
		this.minimumAge = minimumAge;
	}

	public int getMinimumAge() {
		return minimumAge;
	}
	public String toString() {
		return "Item : "+getDescription()+" Price : "+getPrice()+" Quantity:"+getQuantity()+" Kalori : "+kalori;
	}
	void tampilString() {
		super.tampilString();
		System.out.println("Minimum Age : "+minimumAge);
	}
}
