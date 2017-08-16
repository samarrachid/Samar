package calculator;



public class Adder extends Calculatebase {

	public Adder() {}
	public Adder(double leftValue, double rightValue) {
		super(leftValue, rightValue);
	}
	
	@Override
	public void calculate() {
		double value = getLeftValue() + getRightValue();
		setResult(value);
		
	}
	
	
}
