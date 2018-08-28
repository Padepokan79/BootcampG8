
public abstract class Person {
	String name, gender;
	int id, age;
	
	public String bio() {
		return name+" is "+age+" years old "+gender;
	}
	
	public String greeting() {
		return "Hello, My name is "+name;
	}
	
	public void tampil() {
		System.out.println("  ===  "+name+"  ===  ");
		System.out.println("Bio      : "+this.bio());
		System.out.println("Greeting : "+this.greeting());
	}
}
