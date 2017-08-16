package area;

public class Rectangle extends Shape{
	Rectangle() {}
	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public void getArea() {
		double area = getHeight() * getWidth()  ;
		setResult(area);
		
	}

}
