package area;

public class Triangle extends Shape{
	Triangle() {}
	
	Triangle(int height, double base) {
		this.height = height;
		this.base = base;
		
		
	}
	
	@Override
	public void getArea() {
		double area =  ((getHeight() * getBase() ) /2);
		setResult(area);
		
		
	}

}
