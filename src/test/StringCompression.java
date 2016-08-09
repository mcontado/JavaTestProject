package test;

public class StringCompression {

	public static String stringCompress(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		if (s.length() > 0) {
			char last = s.charAt(0);
			int count = 1;
			
			for (int i=1; i<s.length(); i++) {
				if (s.charAt(i) == last) {
					count++;
				} else {
					sb.append(last);
					sb.append(count);
					last = s.charAt(i);
					count = 1;
				}
				
			}
			sb.append(last);
			sb.append(count);
			
			return sb.toString();
	
		} else {
			return null;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		//System.out.println(s.length());
		System.out.println(stringCompress(s));
 
	}

}
