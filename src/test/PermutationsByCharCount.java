/*
 * Check if the two strings have identical character counts
 * */
package test;

public class PermutationsByCharCount {
	public static void main(String[] args){
		String firstStr = "ABC";
		String secondStr = "ABD";
		System.out.println(permutation(firstStr,secondStr));
		
	}
	
	public static boolean permutation(String firstStr, String secondStr) {
		if (firstStr.length() != secondStr.length()) return false;
		
		int[] letters = new int[128];  //If ASCII code
		char[] firstString_array = firstStr.toCharArray();  //get the char array of the string
		
		for (char c: firstString_array) { //Count number of each char in firstString
			letters[c]++;
			System.out.println(c + ": " + letters[c] );
		}
		
		for (int i = 0; i < secondStr.length(); i++) {
			int c = secondStr.charAt(i);
			System.out.println(c + " : " + letters[c]);
			if (--letters[c] < 0) {
				return false;
			}
		}
		
		return true;
	}
}
