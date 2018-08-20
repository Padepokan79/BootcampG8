//Author : Muhamad Iqbal FM , 16 Agustus 2018 
public class Person {
	String firstName , lastName , gender , interests;
	int age;
	
	Person(){
		
	}
	Person(String fName , String lName , int newAge , String newGender ,String newInterests ){
		firstName = fName;
		lastName = lName;
		age = newAge;
		gender = newGender ;
		interests = newInterests;
	}
	void caraMetod(String fName , String lName , int newAge , String newGender ,String newInterests) {
		firstName = fName;
		lastName = lName;
		age = newAge;
		gender = newGender ;
		interests = newInterests;
	}
	
	void tampil() {
		System.out.println("NAME["+firstName+"]["+lastName+"]");
		System.out.println("Age : "+ age);
		System.out.println("Gender :"+ gender);
		System.out.println("Interests :" + interests);
		System.out.println(firstName + " " + lastName + " is " + age + " years old . they like "+interests);
		System.out.println("Greeting : Hi Im "+firstName);
	}
	
}
