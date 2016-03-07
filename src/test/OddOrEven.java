package test;

public class OddOrEven {
	
	public static void main(String[] args) {
		int number = 8;
		
		System.out.println(isOddNumber(number));
	}
	
	public static boolean isOddNumber(int number) {
		int quotient = number/2;
		if (quotient*2 == number) {
			return false;
		} else
			return true;
		
	}
	
}


