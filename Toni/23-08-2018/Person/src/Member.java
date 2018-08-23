
public class Member {
	String name, gender;
	int id, age;
	
	Member(int id, String name, int age, String gender){
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	Member(){}
	
	String bio() {
		return name+" is "+age+" years old.";
	}
	
	String greeting() {
		return "Hello. my name is "+name;
	}
	
	void tampil() {
		System.out.println("\nBio : "+this.bio()+"\nGreeting : "+this.greeting());
	}
}
