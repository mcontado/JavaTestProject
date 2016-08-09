package test;

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SpiralOrderMatrix {
	
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		 // Populate result;
		 return result;
	}

	
	
	public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		Collections.sort(list);
		
		for (int num: a) {
			if (set.add(num) == false) {
				list.add(num);
			}
		}
		
		int actualXOR = 0;
		int expectedXOR = 0;
		
		for (int num: set) {
			actualXOR = actualXOR ^ num;
		}
		
		
		for (int i=1; i<= set.size()+1; i++) {
			expectedXOR = expectedXOR ^ i;
		}
	
		list.add(actualXOR ^ expectedXOR);
		return list;
		
		
		/*
		 
		 	int actualXOR = 0;
 
			for(int i=0; i<size; i++){
				actualXOR = actualXOR ^ a[i];
			}
		 
			//XOR expected numbers
			int expectedXOR = 0;
		 
			for(int i=1; i<=size+1; i++){
				expectedXOR = expectedXOR ^ i;
			}
			return actualXOR ^ expectedXOR;
		  */
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
//		a.add(3);
//		a.add(1);
//		a.add(2);
//		a.add(5);
//		a.add(3);
		
		a.add(2);
		a.add(2);
		
		System.out.println(repeatedNumber(a));
	}

}
