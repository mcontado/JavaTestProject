package test;

public class PalindromChecker {
	public static void main(String[] args) {
		String str = "level";
		String str2 = "one";
		String str3 = "A man, a plan, a canal: Panama";
		//System.out.println(Character.toUpperCase(str.charAt(0)) + str.substring(1) + " " + Character.toUpperCase(str2.charAt(0)) + str2.substring(1));
		//System.out.println(str + " is Palindrome : " + isPalindromeString(str));
		//System.out.println(str + " is Palindrome : " + isPalindromeIterative(str));
	
		//System.out.println(isPalindromeIterative(str3));
		
		int a = -12321;
		System.out.println(isPalindrome(a));
		
	}
	/*
	 * Checking string if palindrome using recursion
	 * First is to reverse the string then compare 
	 * */
	public static boolean isPalindromeQ(String inputStr) {
		if (inputStr == null) return false;		
		String reverse = reverseRecursively(inputStr);		
		return inputStr.equals(reverse);
		
	}
	public static String reverseRecursively (String str) {
		//base case
		if (str.length() < 2)
			return str;
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}
	
	public static boolean isPalindromeIterative(String inputStr) {
		
		//To ignore punctuations
		inputStr = inputStr.toLowerCase().replaceAll("\\W", "");
		
		if (inputStr == null) return false;
		
		int start = 0;
		int end = inputStr.length() - 1;
		
		while (start < end) {
			char left = inputStr.charAt(start);
			char right = inputStr.charAt(end);
			
			if (left != right) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	
	public static boolean isPalindrome(int a) {
		String s = String.valueOf(a);
		if (s.charAt(0) == '-') {
			return false;
		} 
		
		int start = 0;
		int end = s.length() - 1;
		
		while (start < end) {
			char left = s.charAt(start);
			char right = s.charAt(end);
			
			if (left != right) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	
	
}
