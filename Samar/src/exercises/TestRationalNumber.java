package exercises;

public class TestRationalNumber {
	
	public static void main(String[] args) {
		RationalNumbers rn = new RationalNumbers(2, 4, 3,5);
		rn.setDividend();
		rn.setDivisor();
		

		System.out.println("result of adding = " + rn.add());
		System.out.println("result of multiplying = " + rn.multiply());


		
		
	}

}
