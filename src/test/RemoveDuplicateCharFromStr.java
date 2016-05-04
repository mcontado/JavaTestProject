package test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharFromStr {

	//using Set
	public static String removeDupe(String s) {
		StringBuffer sb = new StringBuffer();
		Set set = new HashSet();
		char[] strArr = s.toCharArray();
		
		for (char c : strArr) {
			if (set.add(c)) {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
	
	//Without using utilities
	public static String removeDuplicate(String s) {
		StringBuffer sb = new StringBuffer();
		int[] letters = new int[128];
		char[] strArr = s.toCharArray();
		for (char c: strArr) {
			letters[c]++;
		}
		for (int i=0; i<s.length(); i++) {
			int c = s.charAt(i);
			if (--letters[c] == 0) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bananas";
		System.out.println(removeDuplicate(s));
	}

}
