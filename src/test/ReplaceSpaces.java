package test;

public class ReplaceSpaces {
	public static void main (String[] args) {
		//String str = "the quick brown fox";
		//char[] strArray = str.toCharArray();
		
		char[] ch = {'t', 'h', 'e', ' ', 'd', 'o', 'g', ' ', ' ', ' ', ' ', ' ', ' '};
	    int length = 7;
		replaceSpaces(ch, length);
		  
	}
	
	public static void replaceSpaces(char[] str, int length) {
		int spaceCount = 0, newLength, i;
		for (i=0; i<length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		} //end for
		
		newLength = length + spaceCount * 2;
		str[newLength] = '\0';
		
		for (i = length-1; i>=0; i--) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			} //end else
		}// end for
		
		System.out.println(str);
	}// end method
}


