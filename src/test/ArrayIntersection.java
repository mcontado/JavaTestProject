package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayIntersection {

	/*
	 * Find the intersection of two sorted arrays.
		OR in other words,
		Given 2 sorted arrays, find all the elements which occur in both the arrays.
		
		1. 	Use two index variables i and j
		2. If arr[i] is smaller than arr[j] then increment i;
		2. If arr[j] is smaller than arr[i] then increment j;
		4. If both are the same, add the element into new array and increment both i and j
	 * */
	
	public static ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
		int i = 0, j = 0;
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		while (i < a.size() && j < b.size()) {
			if (a.get(i) < b.get(j)) {
				i++;
			} else if (b.get(j) < a.get(i)) {
				j++;
			} else {
				res.add(a.get(i));
				i++;
				j++;
			}
		}
		return res;
		
	}
	
	
	
	public static void main(String[] args) {
		
		String s = "helloWorld";

        int counter = 1;
        for (int i = 0; i<s.length(); i ++) {
            char c = s.charAt(i);
            
            if (Character.isUpperCase(c)) 
            	counter++;
            
        }
        System.out.println(counter);
		ArrayList<Integer> arList = new ArrayList<Integer>();
		arList.addAll(Arrays.asList(1, 3, 8, 10, 13, 13, 16, 16, 16, 18, 21, 23, 24, 31, 31, 31, 33, 35, 35, 37, 37, 38, 40, 41, 43, 47, 47, 48, 48, 52, 52, 53, 53, 55, 56, 60, 60, 61, 61, 63, 63, 64, 66, 67, 67, 68, 69, 71, 80, 80, 80, 80, 80, 80, 81, 85, 87, 87, 88, 89, 90, 94, 95, 97, 98, 98, 100, 101));
		
		ArrayList<Integer> arList2 = new ArrayList<Integer>();
		arList2.addAll(Arrays.asList(5, 7, 14, 14, 25, 28, 28, 34, 35, 38, 38, 39, 46, 53, 65, 67, 69, 70, 78, 82, 94, 94, 98));
			
		System.out.println(intersect(arList, arList2));		
		

	}

}
