package test;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CountAndSay {
	
	//BEST SOLUTION
	public static String countAndSayOrig(int A) {
	    
	    StringBuilder res = new StringBuilder("1");
	    int count;
	    char num;
	    StringBuilder last = new StringBuilder("1");
	    
	    if (A < 1)
	        return "";
	    
	    for (int i = 1; i < A; i++) {
	        
	        int idx = 0;
	        int n = last.length();
	        res = new StringBuilder();
	        
	        while (idx < n) {
	            
	            num = last.charAt(idx);
	            count = 1;
	            idx++;
	            
	            while (idx < n && last.charAt(idx) == num) {
	                idx++;
	                count++;
	            }
	            
	            res.append(String.valueOf(count));
	            res.append(String.valueOf(num));
	            
	        }
	        
	        last = res;
	    }
	    
	    
	    return res.toString();
	}
	
	public static String countAndSay(int a) {
		if (a <= 0)
			return null;
	 
		String result = "1";
		int i = 1;
	 
		while (i < a) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}
	 
			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}
	 
		return result;
	}
	
	//Other way of solving
	

	public static void main(String[] args) {
		System.out.println(countAndSayOrig(6));
	}

}
