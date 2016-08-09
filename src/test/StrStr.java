package test;

public class StrStr {
	public static int Search(String haystack, String needle){
	    for(int i = 0; i < haystack.length(); i++ ) {
	        for(int j = 0; j < needle.length() && i+j < haystack.length(); j++ ) {
	            if(needle.charAt(j) != haystack.charAt(i+j)) {
	                break;
	            } else if (j == needle.length()-1) {
	                return i;
	            }
	        }
	    }
	    return -1;
	}
	
	public static void main(String args[]) {
		String haystack = "helloWorld";
		String needle = "World";
		
		System.out.println(Search(haystack, needle));
	}

}
