package calculator;



public class Calculator {
	
	public static void main(String[] args) {
		Calculatebase[] calculators = {
				new Adder(7.00d, 4.00d) ,
				new Substracter(7.00d, 3.50d) ,
				new Multiplier(9.00d, 6.00d) , 
				new Divider(8.00d, 2.00d)
		};
		for(Calculatebase calculator:calculators) {
			calculator.calculate();
		System.out.println(calculator.getResult());
		
	}}

	
	
	
}
