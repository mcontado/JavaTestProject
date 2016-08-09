package test;

public class StringIsSubstringOf {

	
	public static boolean gene_search(String string, String substring) {
//	    // Keep track of our position in the string.
//	    int index = 0;
//
//	    // Iterate through all of the characters in the substring.
//	    for (char character : substring.toCharArray()) {
//	        // Find the current character starting from the last character we stopped on.
//	        index = string.indexOf(character, index);
//	        // If the method returned -1, the character was not found, so the result is false.
//	        if (index == -1)
//	            return false;
//	    }
//
//	    // If we reach this point, that means all characters were found, so the result is true.
//	    return true;
		
		return string.contains(substring);
		
		//return retval;
	}
	
	
	
	public static void main(String[] args) {
		//System.out.println(gene_search("CAAAT", "CAT"));
		
		String Str = new String("test");


	      System.out.print("Return Value :" );
	      System.out.println(Str.substring(3,3) );
	}

}
