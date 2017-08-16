package exercises;

public class RationalNumbers {
	private double num1;
	private double denom1;
	private double num2;
	private double denom2;
	private double dividend ;
	private double divisor ;
	private double result;
	
	public RationalNumbers() {}
	public RationalNumbers(double num1, double denom1, double num2, double denom2) {
		this.num1 = num1;
		this.denom1 = denom1;
		this.num2 = num2;
		this.denom2 = denom2;	
	}
	
	public double getNum1() {
		
		return num1;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public double getDenom1() {
		
		return denom1;
	}
	
	public void setDenom1(double denom1) {
		this.denom1 = denom1;
	}
	
	
	public double getNum2() {
		
		return num2;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getDenom2() {
		
		return denom2;
	}
	
	public void setDenom2(double denom2) {
		this.denom2 = denom2;
	}
	
	public double getDividend() {
		
		return dividend;
	}
	
	public void setDividend() {
		
		dividend = num1 / denom1;
	}
	
	public double getDivisor() {
		
		return divisor;
	}
	
	public void setDivisor() {
		
		divisor = num2 / denom2;
	}
	
	public double getResult() {
		
		return result;
	}
	
	
	
	public double add() {
		result =dividend + divisor;
		return result;
	}

	public double multiply() {
		result = dividend * divisor;
		return result;
	}
}
