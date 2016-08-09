package test;

public class SuperReducedString {
	
	public static void reducedString (String s) {
		for (int i = 1; i<s.length(); i++) {
			if (s.charAt(i) == s.charAt(i-1)) {
				s = s.substring(0, i-1) + s.substring(i+1);
				i = 0;
			}
		}
		
		if (s.length() == 0) {
			System.out.println("Empty String");
		} else {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a"; //a
		String ab = "ab"; //ab
		String abc = "abc"; //abc
		String aabb = "aabb"; //Empty String
		String aaabccddd = "aaabccddd"; //abd
		String baab = "baab"; //Empty String
		String aab = "aab"; //b
		String nullStr = ""; //Empty String
		
		//System.out.println(aaabccddd.substring(0, -1));
//		reducedString(a);
//		reducedString(ab);
//		reducedString(abc);
//		reducedString(aabb);
		reducedString(aaabccddd);
//		reducedString(baab);
//		reducedString(aab);
//		reducedString(nullStr);
		

	}

}
