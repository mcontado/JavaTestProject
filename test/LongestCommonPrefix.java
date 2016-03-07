package test;

import java.util.ArrayList;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(ArrayList<String> a) {
		if (a == null) return "";
		
		String ret = "";
		int idx = 0;
		
		while(true) {
			char thisLetter = 0;
			for(String word:a) {
				//if we reached the end of a word then we are done
				System.out.println("idx: "  + idx + " , word.length(): " + word.length());
				if (idx == word.length()) {
					System.out.println("word: " + word);
					return word;
				}
				System.out.println("thisLetter: " +thisLetter);
				//if this is the first word then note the letter we are looking for
				if (thisLetter == 0) {
					thisLetter = word.charAt(idx);
				}
				System.out.println("word.charAt(idx):" +word.charAt(idx));
				//if this word doesn't match the letter at this position we are done
				if (thisLetter != word.charAt(idx)) {					
					System.out.println("ret: " + ret);
					return ret;
					
				}
				
			}
			//if we haven't said we are done then this position passed
			ret += thisLetter;
			System.out.println("ret ==> : " +ret);
			idx++;
		}
	}	

	 public static void main(String[] args){
		 ArrayList<String> a = new ArrayList<>();
		 a.add("abcde");
		 a.add("abce");
		 a.add("abcfgh");
		 System.out.println(longestCommonPrefix(a));
	       
	    }
}
