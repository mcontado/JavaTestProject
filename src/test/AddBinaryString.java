package test;

public class AddBinaryString {
	
	public static String addBinary(String a, String b) {

		int bin1 = binaryToDecimal(Integer.parseInt(a));
		int bin2 = binaryToDecimal(Integer.parseInt(b));
		
		int result = bin1 + bin2;
		
		return Integer.toBinaryString(result);
		
	}
	
	public static int binaryToDecimal (int number) {
		int decimal = 0;
		int power = 0;
		
		while (number != 0) {
			int lastDigit = number % 10;
			decimal += lastDigit * Math.pow(2, power);
			power++;
			number = number / 10;
		}
		
		return decimal;
	}
	
	public static String addBinaryStrings(String a, String b) {
		int aIndex = a.length() - 1;
		int bIndex = b.length() - 1;
		int carry = 0;
		StringBuilder rst = new StringBuilder();
		
		while (aIndex >=0 || bIndex >=0 || carry > 0) {
			int aValue = aIndex >= 0 ? a.charAt(aIndex--) - '0' : 0;
			int bValue = bIndex >= 0 ? b.charAt(bIndex--) - '0' : 0;
			int value = aValue + bValue + carry;
			carry = value / 2;
			rst.insert(0, value % 2);
		}	
		
		return rst.toString();
		
	}

	
	public static void main (String args[]) {
		//System.out.println(addBinary("11","1"));
		

		System.out.println(addBinaryStrings("111","101"));
	}

}
