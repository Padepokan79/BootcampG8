
public class Circle {
	private double radius;
	private String color ;
	
	public Circle() {
		radius = 1.0;
		color ="red";
	}
	public Circle(double radius) {
		this.radius = radius;
		color ="red";
	}
	public Circle(double r , String c) {
		radius = r;
		color  = c;
	}
	
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setRadius(double radiusNew) {
		radius = radiusNew;
	}
	public void setColor(String colorNew) {
		color = colorNew;
	}
	public String toString() {
		   return "Circle[radius=" + radius + ",color=" + color + "]";
	}

	
}
