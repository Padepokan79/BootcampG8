public class Circle{ // Save as "Circle.java"
	// Private instance variables
	private double radius;
	private String color;

	//Constructors (overloaded)
	public Circle(){
		radius = 1.0;
		color = "red";
	}
	public Circle(double r){
		radius = r;
		color = "red";
	}
	public Circle(double r, String c){
		radius = r;
		color = c;
	}

	// Setter for color
	public void setColor(String newColor){
		color = newColor;
	}

	// Setter for radius
	public void setRadius(double newRadius){
		radius = newRadius;
	}

	// Public methods
	public double getRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	public double getArea(){
		return radius * radius * Math.PI;
	}

	// Return a String description of this instance
	public String toString() {
	   return "Circle[radius=" + radius + ",color=" + color + "]";
	}

	public static void main(String[] args){
		Circle c1 = new Circle();
		System.out.println(c1.toString());   // Explicitly calling toString()
		System.out.println(c1);              // Implicit call to c1.toString()
		System.out.println("c1 is: " + c1);  // '+' invokes toString() to get a String before 
	}

}

