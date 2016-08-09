package test;

import java.util.*;

public class Search2DMatrix {
	
	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
		int found = 0;
		
		if (a == null || a.size()==0 || a.get(0).size() == 0) {
			found = 0;
		}
		
		int row = a.size();
		int col = a.get(0).size();
		
		int start = 0;
		int end = row * col -1;
		
		
		while (start <= end) {
			int mid = (start+end)/2;
			int midX = mid / col;
			int midY = mid % col;
			
			if (a.get(midX).get(midY) == b) {
				found = 1;
			} 
			
			if (a.get(midX).get(midY) < b) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
	
		return found;
	}

	
	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{20,30,34,50}};
		
//		int row = matrix.length;
//		int col = matrix[0].length;
//		
//		int start = 0;
//		int end = row * col - 1;
//		System.out.println("Row: " + row);
//		System.out.println("Col: " + col);
//		System.out.println("Row x Col: " + row * col);
//		
//		int mid = (start + end) / 2;
//		System.out.println("mid: " + mid);
//		
//		int midX = mid / col;
//		System.out.println("midX: " + midX);
//		
//		int midY = mid % col;
//		System.out.println("midY: " + midY);
		
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		row1.add(3);
		row1.add(5);
		row1.add(7);
		
		
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		row2.add(10);
		row2.add(11);
		row2.add(16);
		row2.add(20);
		
		ArrayList<Integer> row3 = new ArrayList<Integer>();
		row3.add(23);
		row3.add(30);
		row3.add(34);
		row3.add(50);
		
		a.add(row1);
		a.add(row2);
		a.add(row3);
		
		System.out.println(a);
		
		System.out.println(searchMatrix(a, 7));
		
	}

}
