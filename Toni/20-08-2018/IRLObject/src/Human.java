
public class Human {
	String name, hair_color, race;
	int age, weight, height;
	boolean conc = false;
	
	Human(String name, String[] phsyc, int[] id){
		this.name = name;
		hair_color = phsyc[0];
		race = phsyc[1];
		age = id[0];
		weight = id[1];
		height = id[2];
	}
	
	void wake() {
		conc = true;
	}
	
	void sleep() {
		conc = false;
	}
	
	void speak(String words) {
		if(conc == true)
			System.out.println(name+" : "+words);
		else
			System.out.println("...");
	}
	
	void introduce() {
		if(conc == true)
			System.out.println(name+" : Hello, my name is "+name+", i'm "+age);
		else
			System.out.println("...");
	}
	
}
