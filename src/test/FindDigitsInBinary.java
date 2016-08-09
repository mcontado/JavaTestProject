package test;

import java.util.ArrayList;
import java.util.Collections;

public class FindDigitsInBinary {

	public static String convertDigitsToBinary(int a){
		StringBuilder sb = new StringBuilder();
		
		if (a==0) return Integer.toString(0);
		
		while (a > 0) {
			int rem = a % 2;
			sb.append(Integer.toString(rem));
			a = a / 2;
		}
		sb.reverse();
		return sb.toString();
	}
	
	public static int convertBinaryToDigit(int binaryNumber) {
		int decimal = 0;
		int power = 0;
		
		while (binaryNumber != 0) {
			int lastDigit = binaryNumber % 10;
			decimal += lastDigit * Math.pow(2,power);
			power++;
			binaryNumber = binaryNumber / 10;
		}
		
		return decimal;
	}
	public static void main(String[] args) {
		//System.out.println(convertDigitsToBinary(12));
		
		System.out.println(convertBinaryToDigit(101));

	}

}
