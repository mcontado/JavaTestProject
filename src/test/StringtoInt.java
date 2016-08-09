package test;

import java.util.ArrayList;

public class StringtoInt {
	
	public static void convert() {
		String  s = "-1+234-5+6";
        StringBuffer sb = new StringBuffer("");
		for (int i=0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        String sc = String.valueOf(c);
	        if (!sc.matches("[0-9]")) {
	        	sb.append(sc);
	        } else {
	        	sb.append(sc);
	        	System.out.println(sb);
	        	sb = new StringBuffer("");
	        }
		}
	}

	public static void convertUsingStack() {
		String  s = "-1+234-5+6";
        Stack stack = new Stack();
		for (int i=0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        String sc = String.valueOf(c);
	        if (!sc.matches("[0-9]")) {
	        	stack.push(sc);
	        } else {
	        	String snew = "";
	        	while (!stack.isEmpty()) {
	        		snew = snew + stack.pop();
	        	}
	        	snew = snew + sc;
	        	System.out.println(snew);
	        }
		}
	}
	
	public static int ASCII_OF_0 = 0;
	public static int ASCII_OF_9 = 9;

	public static void convertToAscii() {
		String  s = "-1+234-5+6";
        StringBuffer sb = new StringBuffer("");
		for (int i=0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c >= ASCII_OF_0 && c <= ASCII_OF_9) {
	        	sb.append(c);
	        	System.out.println(sb);
	        	sb = new StringBuffer("");
	        } else {
	        	sb.append(c);
	        }
		}
	}
	
	
	
	 public static void main (String args[])
	    {
		// String  convertingString="-105";
		// System.out.println(stringToint(convertingString));
		 
	        String  convertingString="543";
	        System.out.println("String Before Conversion :  "+ convertingString);
	        
	        int i = 0, number = 0;
	        System.out.println("String Length: " + convertingString.length());
	        while( i < convertingString.length() ){
	        	System.out.println();
	        	System.out.println("i: " + i );
	        	System.out.println("1) Number: " + number);
	        	System.out.print(number + "*" + "10 : " );
	            number *= 10;	
	            System.out.println(number);
	            System.out.println("convertingString.charAt("+i+") :" + convertingString.charAt(i));
	            //System.out.println('5'-'0');
	            number += (convertingString.charAt(i)-'0');
	            i++;
	            System.out.println("2) Number: " + number);
	           
	            
	            
	        }
	        
	      
	
	    }
	    
	    /*
	     *      1.   Start number at 0

       			2.   If the first character is '-'
                       Set the negative flag
                       Start scanning with the next character
              		For each character in the string  
                       Multiply number by 10
                       Add( digit number - '0' ) to number
                	If  negative flag set
                        Negate number
                        Return number
	     * */
	    public static int stringToint( String str ){
	        int i = 0, number = 0;
	        boolean isNegative = false;
	        int len = str.length();
	        if( str.charAt(0) == '-' ){
	            isNegative = true;
	            i = 1;
	        }
	        while( i < len ){
	            number *= 10;
	            number += ( str.charAt(i++) - '0' );
	        }
	        if( isNegative )
	        number = -number;
	        return number;
	    }   
	    
	    
	   


	
	
}
