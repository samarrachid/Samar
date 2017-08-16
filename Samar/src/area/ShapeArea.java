package area;

public class ShapeArea {
	public static void main(String[] args) {
//		Shape circle = new Circle(2.2).getArea();
		// to do so the method must not be declared as void!
		Shape circle = new Circle(1.20);
		Shape square = new Square(2);
		Shape rectangle = new Rectangle(2, 3);
		Shape triangle = new Triangle(5, 5.00);
		
		circle.getArea();
		System.out.println("the area of the circle= " +circle.getResult());
		square.getArea();
		System.out.println("the area of the square= " + square.getResult());
		rectangle.getArea();
		System.out.println("the area of the rectangle= " +rectangle.getResult());
		triangle.getArea();
		System.out.println("the area of the triangle= " +triangle.getResult());
		
		
	}



}
