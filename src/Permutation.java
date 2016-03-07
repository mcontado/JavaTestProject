
public class Permutation {
	
	public static void perm(String s) {
		perm("",s);
	}
	public static void perm(String prefix, String s) {
		//int n = s.length();
		if (s.length() == 0) System.out.println("===>" +prefix);
		else {
			for (int i=0; i<s.length(); i++) {
				//System.out.println("Prefix: " + prefix);
				//System.out.println("s.substring(0," +i+ ") : " + s.substring(0,i));
				//System.out.println("s.substring(" + (i+1) +"," + n +") : " + s.substring(i+1, n));
				//System.out.println("s.charAt(" + i + ") : " + s.charAt(i));
				perm(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, s.length()));
			}
		}
		
	}
	public static void main(String[] args) {
		String s = "abcd";
		perm(s);
	}
}
