class ToileterySG extends GoodsSGA{
	private String composition;

	ToileterySG( String des, double pr, String comp, int q){
		super( des, pr, q );
		composition = comp;
	}

	public String getComposition() {
		return composition;
	}

	public String toString(){
		return "item: " + this.getDescription() + " quantity: " + this.getComposition() + " price: " + this.getQuantity() + " Composition : " + getComposition() ;
	}
}
