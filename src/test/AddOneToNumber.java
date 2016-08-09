package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddOneToNumber {

	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		
		int carry = 1;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < a.size(); i++) {

				  arr.add(0);
			  
		}
		
		
		for (int i=arr.size()-1; i>=0; i--) {
			int sum = a.get(i) + carry;
			
			if (sum >= 10) {
				carry = 1;
			} else {
				carry = 0;
			}
			arr.set(i, (sum % 10));
		}
		
		if (carry == 1) {
			ArrayList<Integer> arrResult = new ArrayList<Integer>(arr.size() + 1);
			
			arrResult.add(1);
			for (int i = 0; i < arr.size(); i++) {
				arrResult.add(arr.get(i));
			}

			return arrResult;
		} else {
			ArrayList<Integer> arrResult = new ArrayList<Integer>();
		
			boolean startOfSigDigit = false;
			
			for (int i = 0; i< arr.size(); i++) {
				if (arr.get(i) == 0 && !startOfSigDigit) {

					continue;
				} else {
					startOfSigDigit = true;
					arrResult.add(arr.get(i));
				}
			}
			return arrResult;
		}

	}
	
	public static final int[] addOne(int[] digits) {
	    int carry = 1;
	    int[] result = new int[digits.length];
	    for (int i = digits.length - 1; i >= 0; i--) {
	        int val = digits[i] + carry;
	        result[i] = val % 10;
	        carry = val / 10;
	    }
	    if (carry == 1) {
	        result = new int[digits.length + 1];
	        result[0] = 1;
	    }
	    return result;
	}
	
	//Best Solution from InterviewBit
	public ArrayList<Integer> plusOneIntoArray(ArrayList<Integer> A) {
	    
	    int size;
	    int carry = 1;
	    int num;
	    
	    size = A.size();
	    
	    for (int i = size - 1; i >= 0; i--) {
	        
	        num = A.get(i);
	        num += carry;
	        carry = 0;
	        
	        if (num == 10) {
	            num = 0;
	            carry = 1;
	        }
	        
	        A.set(i, num);
	        
	    }
	    
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    
	    if (carry == 1)
	        res.add(1);
	    
	    for (int x : A) {
	        if (x == 0 && res.size() == 0)
	            continue;
	        res.add(x);
	    }
	    
	    return res;
	    
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(3);
		arr.add(7);
		arr.add(6);
		arr.add(4);
		arr.add(0);
		arr.add(5);
		arr.add(5);
		arr.add(5);
		
//		int[] arr1 = {9,9,9};
//		System.out.println(addOne(arr1).toString());
		
		System.out.println(plusOne(arr));
		
	}

}
