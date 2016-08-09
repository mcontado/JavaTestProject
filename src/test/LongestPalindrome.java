package test;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LongestPalindrome {
	public static String longestPalindrome(String a) {
		if (a.isEmpty()) {
			return null;
		}
	 
		if (a.length() == 1) {
			return a;
		}
	 
		String longest = a.substring(0, 1);
		for (int i = 0; i < a.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(a, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
	 
			// get longest palindrome with center of i, i+1
			tmp = helper(a, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
	 
		return longest;
	}
	
	// Given a center, either one letter or two letter, 
	// Find longest palindrome
	public static String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aaaaabbaaa";
		System.out.println(longestPalindrome(a));
	}

}
