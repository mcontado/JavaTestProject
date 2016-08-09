package test;

import java.util.*;

public class FindDuplicateInArray {

	
		public static int repeatedNumber(final List<Integer> a) {
		    Set<Integer> set = new HashSet<Integer>();
		    int result = -1;
		    for (int i = 0; i< a.size(); i++) {
		    	if (set.add(a.get(i)) == false) {
		    		return a.get(i);
		    	}
		    }
		    return result;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		a.add(1);
		a.add(4);
		a.add(1);
		System.out.println(repeatedNumber(a));
		
	}

}
