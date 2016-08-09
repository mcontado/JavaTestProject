package array;

import java.util.*;

public class RemoveDupeIntArr {
	
	/*
	 * Remove duplicates from Sorted Array
		Given a sorted array, remove the duplicates in place 
		such that each element appears only once and return the new length.
	 Example: 
		Given input array A = [1,1,2],
		Your function should return length = 2, and A is now [1,2]
	*/
	public static int removeDuplicates(ArrayList<Integer> a) {
		if (a.size() < 2) {
			return a.size();
		}
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(a);
		a.clear();
		a.addAll(set);
		
		return a.size();
	}
	
	// InterviewBit recommended solution
	// Using 2 pointers
	public int removeDuplicates1(ArrayList<Integer> A) {
	    int index = 1;
	    int n = A.size();
	    
	    if (A == null || A.size() == 0)
	        return 0;
	    
	    for (int i = 1; i < n; i++) {
	        
	        if (A.get(i).intValue() != A.get(i - 1).intValue()) {
	            int temp = A.get(index);
	            A.set(index, A.get(i));
	            index++;
	        }
	    }
	    
	    return index;
	    
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		System.out.println(arr);
		removeDuplicates(arr);
		System.out.println(arr);
		

	}

}
