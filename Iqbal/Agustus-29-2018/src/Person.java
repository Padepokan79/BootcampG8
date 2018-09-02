//Author : Muhamad Iqbal FM , 28 Agustus 20
	class Person {
	private String firstName , lastName , gender , interests;
	private int age;
	public Person(String fName , String lName) {
		// TODO Auto-generated constructor stub
		firstName = fName;
		lastName = lName;
		gender = "Male";
	}
	
	
	

	public String getInterests() {
		return interests;
	}




	public void setInterests(String interests) {
		this.interests = interests;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getFirstName() {
		return firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public String getGender() {
		return gender;
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
