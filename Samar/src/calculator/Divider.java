package calculator;

public class Divider extends Calculatebase {
	Divider() {}
	Divider(double leftValue, double rightValue) {
		super(leftValue, rightValue);
	}

	@Override
	public void calculate() {
		double value = getLeftValue() / getRightValue();
		setResult(value);
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
