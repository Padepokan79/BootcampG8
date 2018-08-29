
class ToySG extends GoodsSGA implements Taxable{
  private int minimumAge;

  	ToySG( String des, double pr, int min, int q){
  		super( des, pr, q);
    	minimumAge  = min ;
  	}

	public int getMinimumAge() {
		return minimumAge;
	}

	public String toString(){
		return "item: " + this.getDescription() + "Minimum Age: " + this.getMinimumAge() + " price: " + this.getQuantity() + " quantity: " + this.getQuantity() ;
	}

	public double calculateTax(){
		return this.getPrice() * taxRate ;
	}
}