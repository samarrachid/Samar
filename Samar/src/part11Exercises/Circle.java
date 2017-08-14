package part11Exercises;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public double getArea() {
//		double area = 3.15 * (radius * radius);
		// instead do that ==>
		return radius * radius * Math.PI;
	}

}
