package test;

public class Permutation {
	
	public static void perm(String s) {
		perm("",s);
	}
	public static void perm(String prefix, String s) {
		//int n = s.length();
		if (s.length() == 0) System.out.println("===> " +prefix);
		else {
			for (int i=0; i<s.length(); i++) {
				//System.out.println("Current Letter : " + s.charAt(i));
				//System.out.println("Prefix: " + prefix);
				perm(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, s.length()));
			}
		}
		
	}
	public static void main(String[] args) {
		String s = "abcdef";
		//System.out.println(s.substring(1,3));
		perm(s);
	}
}
