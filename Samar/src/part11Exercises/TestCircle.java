package part11Exercises;



public class TestCircle {
	public static void main(String [] args) {
		Circle circle = new Circle(1.0);
		circle.getArea();
		System.out.println("the circle has a radius of "+ circle.getRadius()+"and area of "+ circle.getArea());
		System.out.println(circle.toString());
		
	}

}
