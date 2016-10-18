package test;

import java.util.Arrays;

public class TestWithMethods {
	
	//Anagrams
	//Method to Sort first then compare if equals
	public static boolean isAnagram(String s1, String s2) {
		char[] arr1 = s1.replaceAll("\\W", "").toLowerCase().toCharArray();
		char[] arr2 = s2.replaceAll("\\W", "").toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	
	//Iterative method
	//Method to compare each, by not using sort and equals
	public static boolean anagramCheck(String s1, String s2) {
		//Remove whitespace and changing case
		s1 = s1.replaceAll("\\W", "").toLowerCase();
		s2 = s2.replaceAll("\\W", "").toLowerCase();
		
		//check first if the lenght of both string is equal
		if (s1.length() != s2.length()) {
			return false;
		}
		
		//convert string 1 to char array;
		char[] arr1 = s1.toCharArray();
		
		for (char c: arr1) {
			int index = s2.indexOf(c);
			
			// if index is found
			if (index != -1) {
				//then we substring the second string
				s2 = s2.substring(0, index) + s2.substring(index + 1); 
				
				
			} else {
				//we haven't found the letter in the second string
				return false;
				
			}
			
		}
		
		// if the string 2 is not empty then, two string are not anagrams of each other
		return s2.isEmpty();
	}

	public static void main(String[] args) {
		String s1 = "clint eastwood";
		String s2 = "old west actions";
		
		System.out.println(anagramCheck(s1, s2));

	}

}
