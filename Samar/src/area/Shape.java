package area;

public abstract class Shape {
	// height and width are not visible outside the class if they are private while others are!
	protected  int height;
	protected  int width;
	public double radius;
	protected  double base;
	protected double bi = 3.14;
	private double result;
	
	public Shape() {}
	
	public Shape(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public Shape(int height) {
		this.height = height;
	}
	public Shape(double radius) {
		this.radius = radius;
	}
	public Shape(int height, double base) {
		this.height = height;
		this.base = base;
	}
	
	
	public  int getHeight() {
		return height;
	}
	public  void setHeight(int height) {
		this.height = height;
	}
	public  int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public  double getRadius() {
		return radius;
	}
	public void setRadius() {
		this.radius = radius;
	}
	public  double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public abstract void getArea() ;
	
	public static void main(String[] args) {}
	
	

}
