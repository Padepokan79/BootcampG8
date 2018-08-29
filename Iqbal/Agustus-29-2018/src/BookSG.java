
public class BookSG extends GoodsSGA implements Taxable{
	private String author;

	public BookSG(String des, double pr, int quant, String author) {
		super(des, pr, quant);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
	public String toString() {
		return "Item : "+getDescription()+" Price : "+getPrice()+" Quantity:"+getQuantity();
	}
	void tampilString() {
		super.tampilString();
		System.out.println("Author :"+getAuthor());
	}
	public double calculateTax() {
		return getPrice()*taxRate;
	}
}
