
public class PalindromeChecker {
	
	//Iterative check
	public static boolean isPalindrome (String str) {
		//Check the length of the string
		if (str == null) return false;
		
		//Navigate through the string to check 
		int start = 0;
		int end = str.length()-1;
		
		while (start < end) {
			char left = str.charAt(start);
			char right = str.charAt(end);
			
			if (left!=right) 
				return false;
			
			start++;
			end--;
		}
		return true;
	}
	
	//Recursive check
	//reverse the string recursive first before checking with original string

	public static String reverseString(String str) {
		//base case
		if (str.length() < 2) 
			return str;
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}
	
	public static boolean isPalindromeChecker(String str) {
		if (str == null) return false;
		String reverse = reverseString(str);
		return str.equals(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "level";
		System.out.println(str + " is palindrome? : " + isPalindromeChecker(str));
		
		String reverseStr = "hello";
		System.out.println(reverseString(reverseStr));
	}

}
