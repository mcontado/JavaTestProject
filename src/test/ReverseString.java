package test;


public class ReverseString {
	public static void main(String[] args) {
		  String str = "delrio";
	      System.out.println("Original String: " + str);
	      
	      //Reverse string using StringBuffer
	     // StringBuffer strBuf = new StringBuffer(str).reverse();
	     // System.out.println("Reverse String using StringBuffer: " + strBuf);
	      
	      //Reverse string iteratively
	      System.out.println("Reverse string iteratively: " + reverseStr(str));
	      
	     // System.out.println("Reverse string recursively: " + reverseRecursively(str));
	}
	
	
	public static String reverseStr(String str) {
		StringBuilder strBuilder = new StringBuilder();

		for (int i=str.length()-1; i>=0; i--) {
			strBuilder.append(str.charAt(i));
		}
		
		return strBuilder.toString();
	}
	
	public static String reverseRecursively(String str){
		//base case
		if (str.length() < 2)
			return str;
		
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}

}
