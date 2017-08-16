package calculator;

public class Substracter extends Calculatebase {
	
	Substracter() {}
	Substracter(double leftValue, double rightValue) {
		super(leftValue, rightValue);
	}
	
	
	public static void main(String[] args) {
	
	}


	@Override
	public void calculate() {
		double value = getLeftValue() - getRightValue() ;
		setResult(value);
		// TODO Auto-generated method stub
		
	}
}
