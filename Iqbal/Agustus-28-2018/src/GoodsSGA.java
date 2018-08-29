public abstract class GoodsSGA {
	  private String description;
	  private double price;
	  private int quantity;

	  public GoodsSGA( String des, double pr, int quant )
	  {
	    description = des;
	    price       = pr;
	    quantity    = quant;
	  }

	  double getPrice()
	  {
	    return price;
	  }

	  void setPrice( double newPrice)
	  {
	    price =  newPrice;
	  }

	  int getQuantity()
	  {
	    return quantity;
	  }

	  void setQuantity ( int newQuantity )
	  {
	    quantity =  newQuantity;
	  }
	  String getDescription() {
		  return description;
	  }
	  abstract public String toString();
	  void tampilString() {
		 toString(); 
	  }
	  
}
