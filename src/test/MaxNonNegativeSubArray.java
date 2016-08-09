package test;

import java.util.*;

public class MaxNonNegativeSubArray {
	
	/*
	 * Problem:
	 	Find out the maximum sub-array of non negative numbers from an array.
		The sub-array should be continuous. 
		That is, a sub-array created by choosing the second and fourth element and skipping the third 
		element is invalid.

		Maximum sub-array is defined in terms of the sum of the elements in the sub-array. 
		Sub-array A is greater than sub-array B if sum(A) > sum(B).
		
		Example:
			A : [1, 2, 5, -7, 2, 3]
			The two sub-arrays are [1, 2, 5] [2, 3].
			The answer is [1, 2, 5] as its sum is larger than [2, 3]
	 * */
	
	public static ArrayList<Integer> maxSet(ArrayList<Integer> a) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		   int len = a.size();
		   long max_sum = 0;
		   long cur_sum = 0;
		   int startmax = -1;
		   int endmax = -1;
		   int start = 0;
		   int end = 0;
		 
		   while(end < len) {
		      if(a.get(end)>=0)
		      {
		          cur_sum += a.get(end);
		          if(cur_sum > max_sum) {
			          max_sum = cur_sum;
			          startmax = start;
			          endmax = end + 1;
		          }
		          else if(cur_sum == max_sum)
		          {
		            if(end + 1 - start > endmax - startmax) {
		              startmax = start;
		              endmax = end + 1;
		              }
		          }
		      }else
		      {
		         start = end + 1;
		         cur_sum = 0;
		      }
		 
		      end++;
		   }
		 
	
		   ans.clear();
		 
		   if(startmax == -1 || endmax == -1)
		       return ans;
		 
		   for(int i = startmax; i < endmax; i++)
			   ans.add(a.get(i));
		         
		   return ans;
	}
	
	//InterviewBit best complete solution for the problem
	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    long maxSum = 0;
	    long newSum = 0;
	    ArrayList<Integer> maxArray = new ArrayList<Integer>();
	    ArrayList<Integer> newArray = new ArrayList<Integer>();
	    for (Integer i : a) {
	        if (i >= 0) {
	            newSum += i;
	            newArray.add(i);
	        } else {
	            newSum = 0;
	            newArray = new ArrayList<Integer>();
	        }
	        if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
	            maxSum = newSum;
	            maxArray = newArray;
	        }
	    }
	    return maxArray;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1967513926);
		a.add(1540383426);
		a.add(-1303455736);
		a.add(-521595368 );
		
		
		System.out.println(maxSet(a));
		
		
	}

}
