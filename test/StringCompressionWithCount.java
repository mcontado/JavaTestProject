package test;

public class StringCompressionWithCount {

	public static void main(String[] args) {
		System.out.println(compressString("a"));
		
	}
	
	public static String compressString(String str) {
		//Algorithm
		//Check if the string is not empty
		if (str.isEmpty() || str == null) return "";
		
		//Create StringBuffer sb, int count
		StringBuffer sb = new StringBuffer();
		int count = 1;
		
		//Create character that hold the first character of ths tring
		char prev = str.charAt(0);
				
		//Navigate the string taking each char at a time
		for (int i=1; i<str.length(); i++) {
			//Create a char that holds the current character
			char curr = str.charAt(i);
			//If you find the same character, increase the count
			if (prev == curr) {
				count++;
			} else {
				//If not, append the character and its count to the stringbuffer
				sb.append(prev);
				sb.append(count);
				//Set the prev char to curr char
				prev = curr;
				//Reset the count value
				count = 1;
			}
		}

		sb.append(prev);
		sb.append(count);
		
		//Compare the length of the compressed string and original, return the smaller string
		if (str.length() < sb.length()) {
			return str;
		} else {
			return sb.toString();
		}

	}
}
