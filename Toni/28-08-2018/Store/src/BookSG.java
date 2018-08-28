class BookSG  extends GoodsSGA implements Taxable{
	private String author;

  	BookSG( String des, double pr, String auth, int q){
	  super( des, pr, q);
    	author  = auth ;
  	}
  	
  	public String getAuthor() {
		return author;
	}

	public String toString(){
		return "item: " + this.getDescription() + " Author: "+ this.getAuthor() + " quantity: " + this.getQuantity() + " price: " + this.getQuantity() ;
	}

  	public double calculateTax(){
  		return this.getPrice() * taxRate ;
  	}
}