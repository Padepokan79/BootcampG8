
public class TestCircle {
	public static void main(String[]args) {
		Circle c = new Circle();
		//c.setColor("blue");
		System.out.println(c.getColor());
		System.out.println(c.toString());   // Explicitly calling toString()
		System.out.println(c);              // Implicit call to c1.toString()
		System.out.println("c is: " + c);  // '+' invokes toString() to get a String before 
	}
}
