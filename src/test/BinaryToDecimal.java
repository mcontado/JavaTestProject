package test;

public class BinaryToDecimal {
	
	public static int binaryToDecimal (int num) {
		int decimal = 0;
		int power = 0;
		
		while (num != 0) {
			int lastDigit = num % 10;
			decimal += lastDigit * Math.pow(2, power);
			power++;
			num = num / 10;
		}
		
		return decimal;
	}
	
	public static int binaryToDecimalRecursion (int num) {
		if (num < 2) return num;
		
		return binaryToDecimalRecursion(num/10)*2 + (num % 10);
	}

	public static void main(String[] args) {
		int a = 1111;
		System.out.println(binaryToDecimal(a));
		
		System.out.println(binaryToDecimalRecursion(a));

	}

}
