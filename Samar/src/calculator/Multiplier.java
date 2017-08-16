package calculator;

public class Multiplier extends Calculatebase {
	Multiplier() {}
	Multiplier(double leftValue, double rightValue) {
		super(leftValue, rightValue);
	}
	
	
	
	@Override
	public void calculate() {
		double value = getLeftValue() - getRightValue();
		setResult(value);
		
	}

}
