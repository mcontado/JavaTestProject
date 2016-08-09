package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;


class MyComparator implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
 
		String str1 = a.toString() + b.toString();
		String str2 = b.toString() + a.toString();
 
		if(str1.compareTo(str2) > 0)
			return -1;
		else
			return 1;
	}
}

public class LargestNumber {
	
	public static String largestNumber(final List<Integer> a) {
		int n = a.size();
		StringBuffer sb = new StringBuffer();
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
		for (int i=0; i<n; i++) {
			arr1.add(a.get(i));
		}
		
		Collections.sort(arr1, new MyComparator());
		
		for (int i = 0; i<n; i++) {
			if (sb.length() == 0 && arr1.get(i) == 0)
				continue;
			
			sb.append(arr1.get(i));
		}
			
			
		if (sb.length() == 0) {
			sb.append(0);
		}
		return sb.toString();
		
	}

	public static void arrangeGivenNumbersToFormTheBiggestNumbers(int[] arr) {
		int n = arr.length;
 
		Integer[] arr1 = new Integer[n];
 
		for(int i=0;i<n;i++)
			arr1[i] = arr[i];
 
		Arrays.sort(arr1,new MyComparator());
 
		for(int i=0;i<n;i++)
			arr[i] = arr1[i];
 
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
		System.out.println();
	}
	
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
 
	public static void main(String[] args) {
		int[] arr = {3,30,34,5,9};
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);
		
		//printArray(arr);
		
		for (int i = 0; i<a.size(); i ++) {
			System.out.print(a.get(i));
			System.out.print(" ");
			
		}
 
		System.out.println("");
		System.out.println(largestNumber(a));
		//arrangeGivenNumbersToFormTheBiggestNumbers(arr);
	}
}
