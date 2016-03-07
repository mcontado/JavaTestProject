package test;

import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
	      int inarr1[] = {1, 2, 3};
	      int inarr2[] = {1, 2, 3}; 
	      Object[] arr1 = {inarr1};  // arr1 contains only one element
	      Object[] arr2 = {inarr2};  // arr2 also contains only one element
	      Object[] outarr1 = {arr1}; // outarr1 contains only one element
	      Object[] outarr2 = {arr2}; // outarr2 also contains only one element  
		/*
		 *  arr1 == arr2 --> (NOT SAME) - because they are two references to two different objects
		 *  Arrays.equals(arr1, arr2) --> SAME for now
		 *  	--> NOT SAME if the array contains arrays inside them or some other references that refer to diff obj
		 *    
		 * */
		if (Arrays.deepEquals(outarr1, outarr2)) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}

	}

}
