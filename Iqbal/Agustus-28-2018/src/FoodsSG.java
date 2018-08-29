
public class FoodsSG extends GoodsSGA{
	private String kalori;

	public FoodsSG(String des, double pr, int quant) {
		super(des, pr, quant);
		this.kalori = "5KALORI";
	}

	public String getKalori() {
		return kalori;
	}
	
	public String toString(){
		return "Item : "+getDescription()+" Price : "+getPrice()+" Quantity:"+getQuantity()+" Kalori : "+kalori;
	}
	void tampilString(){
		super.tampilString();
	}
}
