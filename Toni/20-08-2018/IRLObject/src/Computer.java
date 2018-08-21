
public class Computer {
	String brand, model,motherboard;
	int memory, hdd, gpu; 
	boolean power_state = false;
	
	Computer(String brand, String model, String motherboard, int[] specs){
		this.brand = brand;
		this.motherboard = motherboard;
		this.model = model;
		memory = specs[0];
		hdd = specs[1];
		gpu = specs[2];
	}
	
	void power(String state) {
		state.toLowerCase();
		switch(state) {
			case "on" :
			power_state = true;
			System.out.println("Computer is ON");
			break;
			case "off" :
			power_state = false;
			System.out.println("Computer is OFF");
			break;
			default:
			System.out.println("Invalid Statement");
			break;
		}
	}
	
	void bios() {
		if(power_state == true) {
			System.out.println("======================");
			System.out.println("Brand\t: "+brand);
			System.out.println("Model\t: "+model);
			System.out.println("======================");
			System.out.println("Motherboard : "+motherboard);
			System.out.println("Disk\t    : "+hdd+"MB");
			System.out.println("Memory\t    : "+(int)(memory-(0.1 * memory))+"MB");
			System.out.println("GPU\t    : "+gpu+"MB");
			System.out.println("======================");	
		}else {
			System.out.println("...");	
		}
		
	}
	
	
	
}
