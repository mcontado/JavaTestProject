package test;

public class ExcelColumnTitleToNumber {
	
	public static int titleToNumber(String a) {
		if(a==null || a.length() == 0){
	        throw new IllegalArgumentException("Input is not valid!");
	    }
	 
	    int result = 0;
	    int i = a.length()-1;
	    int t = 0;
	    while(i >= 0){
	        char curr = a.charAt(i);
	        result = result + (int) Math.pow(26, t) * (curr-'A'+1);
	        t++;
	        i--;
	    }
	 
	    return result;
	}

	public static void main(String[] args) {
		String a = "BC";
		System.out.println(titleToNumber(a));

	}

}
