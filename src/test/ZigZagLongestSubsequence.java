package test;

import java.util.Vector;

public class ZigZagLongestSubsequence {

	public static int zigZagLongestSubsequence(int[] arr) {
		int bestLength = 1;
		
		Vector<Integer> up = new Vector<>();
		Vector<Integer> down = new Vector<>();
		
		up.add(1);
		down.add(1);
		
		for (int i = 1; i < arr.length; i++) {
			up.add(1);
			down.add(1);
			
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					up.set(i, Math.max(down.get(j) + 1, up.get(i)));
				}
				if (arr[i] < arr[j]) {
					down.set(i, Math.max(up.get(j) + 1, down.get(i)));
				}
			}
			
			bestLength = Math.max(bestLength, Math.max(up.get(i), down.get(i)));
			
		}
		
		return bestLength;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,10,5,4,6,3};
		System.out.println(zigZagLongestSubsequence(arr));
	}

}
