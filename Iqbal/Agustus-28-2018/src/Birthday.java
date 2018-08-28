
public class Birthday extends card{
	int age;
	Birthday(String r , int years){
		recipient = r ;
		age = years;
	}
	
	public void greeting() {
		System.out.println("Dear " + recipient + ",\n");
	    System.out.println("Happy " + age + "th Birthday\n\n");
	}
}
