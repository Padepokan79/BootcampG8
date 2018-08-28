class FoodSG extends GoodsSGA{
	private double calories;

	FoodSG( String des, double pr, double cal, int q){
		super( des, pr, q );
		calories = cal ;
	}

	public double getCalories() {
		return calories;
	}

	public String toString(){
		return "item: " + this.getDescription() + " quantity: " + this.getQuantity() + " price: " + this.getQuantity() + " Calories : " + getCalories() ;
	}
}
