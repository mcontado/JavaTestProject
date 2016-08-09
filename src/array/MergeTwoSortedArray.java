package array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		 
//		int m = a.size();
//		int n = b.size();
//		
//	        while(m > 0 && n > 0){
//	        	if (a.get(m-1) > b.get(n-1)) {
//	        		a.set(m+n-1, a.get(m-1));
//	                m--;
//	            }else{
//	            	if (m+n-1 >  a.size()) {
//	            		a.add(b.get(n-1));
//	     
//	            	} else {
//	            		a.set(m+n-1, b.get(n-1));
//	            	}
//	            	
//	                n--;
//	            }
//	        }
//	 
//	        while(n > 0){
//	        	
//	        	a.set(m+n-1, b.get(n-1));
//	            n--;
//	        }
	    }
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,5,8));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(6,9));
		//merge(a,b);
		System.out.println(a);
	}

}
