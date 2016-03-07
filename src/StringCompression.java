
public class StringCompression {

	public static String stringCompress(String s) {
		
		StringBuilder sb = new StringBuilder();
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
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringCompress("a"));
 
	}

}
