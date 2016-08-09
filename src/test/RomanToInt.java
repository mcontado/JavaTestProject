package test;

public class RomanToInt {
	public static int romanToInt(String a) {
		int sum = 0;
		int len = a.length();
		int prev = 0;
		
		if (a == null) return 0;
		
		for (int i = len-1; i>=0; i--) {
			int cur = romanTable(a.charAt(i));
			
			if (i == len - 1) {
				sum = sum + cur;
			} else {
				if (cur < prev) {
					sum = sum - cur;
				} else {
					sum = sum + cur;
				}
			}
			
			prev = cur;
		}
		
		return sum;
	}
	
	public static int romanTable(char c){
	    int num = 0;
	    switch(c){
	        case 'I':
	            num = 1;
	            break;
	        case 'V':
	            num = 5;
	            break;
	         case 'X':
	            num = 10;
	            break;
	         case 'L':
	             num = 50;
	             break;
	         case 'C':
	             num = 100;
	             break;
	         case 'D':
	             num = 500;
	             break;
	         case 'M':
	             num = 1000;
	             break;
	         default:
	             num = 0;
	             break;
	    }
	    return num;
	}
	
	public static String intToRoman(int a) {
		 	String roman="";
	        int repeat;
	        int magnitude[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String symbol[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        repeat=a/1;
	        for(int x=0; a>0; x++){
	            repeat=a/magnitude[x];
	            for(int i=1; i<=repeat; i++){
	                roman=roman + symbol[x];
	            }
	            a=a%magnitude[x];
	        }
	        return roman;
	}

	public static void main(String[] args) {
		String a = "X";
		System.out.println(romanToInt(a));
		
		int b = 4;
		System.out.println(intToRoman(b));
		

	}

}
