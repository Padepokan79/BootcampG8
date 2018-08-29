//Author : Muhamad Iqbal FM , 28 Agustus 2018 
abstract class Person {
	String firstName , lastName , gender , interests;
	int age;
	

	void tampil() {
		System.out.println("NAME["+firstName+"]["+lastName+"]");
		System.out.println("Age : "+ age);
		System.out.println("Gender :"+ gender);
		System.out.println("Interests :" + interests);
		System.out.println(firstName + " " + lastName + " is " + age + " years old . they like "+interests);
		System.out.println("Greeting : Hi Im "+firstName);
	}
	
}
