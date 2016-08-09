package test;

import java.util.HashMap;
import java.util.Map.Entry;

public class AnagramOfPalindrome {
	
	public static boolean isPal(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = s.toCharArray();
		boolean isPalindrome = true;
		int countOdd = 0;
		
		for (char c: arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
		for (Entry<Character, Integer> entry: map.entrySet()) {
			if (!((entry.getValue() % 2) == 0)) {
				countOdd++;
			}
			if(countOdd > 1) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ffdddeewww";
		System.out.println(isPal(s));
	}

}
