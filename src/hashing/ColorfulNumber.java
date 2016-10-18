package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class ColorfulNumber {


	public static int[] getdigits(int Number) {
		int length = String.valueOf(Number).length();
		int A[] = new int[length];
		int counter = length - 1; // start filling from the end
		while (Number > 0) {
			int x = Number % 10;
			Number = Number / 10;
			A[counter] = x;
			counter--;
		}
		return A;
	}

	public static int colorful(int number) {
		Set<Integer> set = new HashSet<Integer>();
		int[] digits = getdigits(number);
		
		int currentDigit = 1;
		
		int startIndex = 0;
		int endIndex = digits.length;
		
		for (int i=startIndex; i<endIndex; i++) {
			currentDigit *= digits[i];
	
			if (set.contains(currentDigit)) {
				return 0;
			} else {
				set.add(currentDigit);
			}
			
			if(i==endIndex-1) {
				startIndex++;
				i=startIndex-1;
				currentDigit = 1;
			}
			
		}
		
		return 1;
		
		
		
	}

	public static void main(String[] args) {
		ColorfulNumber c = new ColorfulNumber();
		//System.out.println(" 326 Colorful?? " + c.getColorFul(326));
		//System.out.println(" 3245 Colorful?? " + c.getColorFul(3245));
		int a = 24;
		int[] digits = c.getdigits(a);
		for (int x:digits) {
			System.out.print(x + " ");
		}
		System.out.println(" ");
		System.out.println(colorful(a));
		
	}

	// public static int getProduct(int digits) {
	// if (digits < 10) return digits;
	//
	// int product = 1;
	// int num = digits;
	//
	// while (num > 0) {
	// product *= (num%10);
	// num = num/10;
	// }
	//
	// return product;
	// }
	//
	// public static int[] getIndividualDigits(int number) {
	// ArrayList<Integer> digitList = new ArrayList<Integer>();
	// while (number > 0) {
	//
	// digitList.add(number % 10);
	// number = number / 10;
	//
	// }
	//
	// String numStr = String.valueOf(number);
	// for (int i=0; i<numStr.length(); i++) {
	// for (int j=1; j<numStr.length(); j++) {
	//
	// }
	// }
	//
	// int[] results = new int[digitList.size()];
	// for (int i=0; i<results.length; i++) {
	// results[i] = digitList.get(i);
	// }
	//
	//
	// return results;
	//
	//
	//
	// }
	//
	// public static int colorful(int a) {
	//
	// if (a < 10) return 1;
	//
	// String colorString = String.valueOf(a);
	// int len = colorString.length();
	//
	// HashMap<String, Integer> map = new HashMap<String, Integer>();
	//
	// for (int i=1; i<len; i++) {
	// for (int j=0; i+j<=len; i++) {
	// String sub = colorString.substring(j, j+i);
	// int product = getProduct(Integer.parseInt(sub));
	//
	// if (map.containsKey(product)) {
	// return 0;
	// } else {
	// map.put(sub, product);
	// }
	//
	//
	// }
	// }
	//
	// return 1;
	//
	// }
	//
	//
	// public static void main(String[] args) {
	// int a = 3245;
	// int[] res = getIndividualDigits(a);
	// for (int i=0; i<res.length; i++) {
	// System.out.print(res[i] + " ");
	// }
	//
	// }

}
