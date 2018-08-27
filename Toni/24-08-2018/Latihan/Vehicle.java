class Vehicle{
	void run(){ System.out.println("Vehicle is Running"); }
}

class Bike extends Vehicle{
	void run(){ System.out.println("Bike Running Safely"); }

	public static void main(String args[]){
		Bike sepeda = new Bike();
		sepeda.run();
	}
}

