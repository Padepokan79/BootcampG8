
public abstract class Person {
	public String name, gender;
	public int id, age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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
