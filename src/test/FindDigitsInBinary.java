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
	public static void main(String[] args) {
		System.out.println(convertDigitsToBinary(12));

	}

}
