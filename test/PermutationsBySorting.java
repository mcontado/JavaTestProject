/*
 * Given two strings, write a method to decide if one is a permutation of the other
 * Solution 1: Sort the strings
 * */
package test;

import java.util.Arrays;

public class PermutationsBySorting {

	public static void main(String[] args) {
		String firstStr = "god   ";
		String secondStr = "dog";
		System.out.println(firstStr + " is permutation of " + secondStr + ": " 
		+ permutation(firstStr, secondStr));
	}
	
	public static String sort(String str) {
		char[] content = str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation(String firstString, String secondString){
		if (firstString.length() != secondString.length()) return false;
		return sort(firstString).equals(sort(secondString));
	}
}
