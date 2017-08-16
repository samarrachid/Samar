package calculator;

public abstract class  Calculatebase {
	
	private double leftValue;
	private double rightValue;
	private double result;
	
	public double getLeftValue() {
	return leftValue;
	}
	public void setLeftValue(double leftValue) {
		this.leftValue = leftValue;
		}
	public double getRightValue() {
		return rightValue;
		}
	public void setRightValue(double rightValue) {
		this.rightValue = rightValue;
		}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public Calculatebase() {}
	public Calculatebase(double leftValue, double rightValue) {
		this.leftValue = leftValue;
		this.rightValue = rightValue;
	
	}
	
	public abstract void  calculate(); 
	
	public static void main(String[] args) {
		
	
	}
		
	
	
}
