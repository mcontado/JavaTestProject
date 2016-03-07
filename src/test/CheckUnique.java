package test;

import java.util.HashSet;

/*
 * Algorithm to determine if a string has all unique characters. Assuming that the string is an ASCII
 * */
public class CheckUnique {
	public static void main(String[] args) {
		String str1 = "maria";
		String str2 = "delrio";
		System.out.println("str 1 = maria has all unique characters:" + isUniqueChar(str1));
		//System.out.println("str 2 = delrio has all unique characters:" + checkUnique(str2));
		
	}
	
	/*Method to create array of boolean values where the flag at index i indicates whether
	 * character i in the alphabet is contained in the string
	 * Big O : Runs in O(n) linear time 
	 */
	public static boolean isUniqueChar(String str) {
		//checks if the string lenght is more than the ASCII code positions
		if (str.length() > 128) return false;
		
		//boolean array representing each character in char set
		boolean[] charSet = new boolean[128];
		
		for (int i = 0; i < str.length(); i++) {
			//we assign a character to an int so its ASCII value gets started
			int val = str.charAt(i);
			System.out.println("val: " + val);
		
			//if it's already true
 			if (charSet[val]) {
 				System.out.println("charSet[val]:" + charSet[val]);
				return false;   //we have duplicate
			} 
			charSet[val] = true; //set boolean value representing that character to be true
		}

		return true; // all characters in string was unique
	} //end of isUniqueChar method
	
	
	/*
	 * Set is used to store unique values 
	 * Iterate through the character array of the string and add each character to a HashSet 
	 * If any character repeats, we should not be able to add the character to our HashSet
	 * and string has duplicate characters	
	 * Big O: Runs in O(n) linear time
	 * */
	public static boolean checkUnique(String str) {
		HashSet hashSet = new HashSet();
		for (char c: str.toCharArray()) { //iterate through character array
			if (!hashSet.add(Character.toUpperCase(c))) { //try to add each character to hashset
				return false;  //return false if could not add
			}			
		}
		return true;
	}
}
