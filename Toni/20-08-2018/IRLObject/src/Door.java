
public class Door {
	String brand, color;
	int size, condition;
	boolean state = false, lock = false;
	
	Door(String brand, String color, int size, int condition){
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.condition = condition;
	}
	
	void open() {
		if(lock == false)
			state = true;
		else
			System.out.println("Door Locked");
	}
	
	void close() {
		state = false;
	}
	
	void lock() {
		if(state == false)
			lock = true;
		else
			System.out.println("Door is Open");
	}
	
	void unlock() {
		lock = false;
	}
	
	

}
