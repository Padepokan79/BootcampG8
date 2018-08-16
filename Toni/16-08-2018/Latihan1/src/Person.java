/* 	
 * Aurhor  : Muhammad Sultoni 
 * Created : 16-08-2018 
 */
public class Person {
	int age;
	String[] name = new String[2];
	String gender, interest;
	
	Person() {}
	Person(int age, String fName, String lName, String gender, String interest){
		this.age = age;
		this.name[0] = fName;
		this.name[1] = lName;
		this.interest = interest;
		this.gender = gender;
	}
	
	void insertData(int age, String fName, String lName, String gender, String interest){
		this.age = age;
		this.name[0] = fName;
		this.name[1] = lName;
		this.interest = interest;
		this.gender = gender;
	}
	
	void bio() {
		System.out.println("\n"+name[0]+" "+name[1]+" is "+age+" years old. They like "+interest);
	}
	
	void greeting() {
		System.out.println("Hello my name is "+name[0]+" "+name[1]+" and i teach "+interest);
	}
	
}
