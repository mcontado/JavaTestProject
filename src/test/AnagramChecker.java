package test;
import java.util.Arrays;

public class AnagramChecker {
	
	// 1) Using sort and equals method
	public static boolean isAnagram(String str1, String str2) {
		char[] c1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] c2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
	
		return Arrays.equals(c1, c2);

	}

	// 2) 	Using Iterative method
	public static boolean checkAnagram(String str1, String str2) {
		//Remove whitespace and changing case
		String copyOfStr1 = str1.replaceAll("\\s", "").toLowerCase();
		String copyOfStr2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if (copyOfStr1.length() != copyOfStr1.length()) 
			return false;
		
		//Convert copy of str1 to character array
		char[] str1ToArray = copyOfStr1.toCharArray();
	
		for (char c: str1ToArray) {

			int index = copyOfStr2.indexOf(c);
			//int index = copyOfStr2.charAt(c);
			if (index != -1) {
				copyOfStr2 = copyOfStr2.substring(0, index) + 
							 copyOfStr2.substring(index+1, copyOfStr2.length());
			} else {
				return false;
			}
				
		}
	
		return copyOfStr2.isEmpty();
		
	}
	
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		
		//System.out.print(str1.substring(1,4));
		//System.out.println(checkAnagram(str1, str2));
		System.out.println(str1.substring(6));
	}

}
