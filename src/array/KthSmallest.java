package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallest {

	public static int kthsmallest(final List<Integer> a, int k) {
	    int currentSmallest = -1;
	    
	    ArrayList<Integer> sortedList = new ArrayList<Integer>();
	    
	    for (int i=0; i<a.size(); i++) {
	        if(sortedList.add(a.get(i)));
	    }
	    Collections.sort(sortedList);
	    
	    if (k > 0) {
	    	currentSmallest = sortedList.get(k-1);
	    } 
	    
	    
	    return currentSmallest;
	    
	}
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(1);
		a.add(4);
		a.add(3);
		a.add(2);
		
		System.out.println(kthsmallest(a, 5));

	}

}
