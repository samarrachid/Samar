package area;

public class Circle extends Shape {
	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void getArea() {
		double area = bi * (Math.pow(getRadius(), 2));
		setResult(area);

	}

}
