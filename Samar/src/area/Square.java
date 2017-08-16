package area;

public class Square extends Shape {
	Square() {}
	Square(int height) {
		this.height = height;
	}
	
	@Override
	public void getArea() {
		double area = Math.pow(getHeight(),  2);
		setResult(area);
		
		
	}

	
}
