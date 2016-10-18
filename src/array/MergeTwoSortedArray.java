package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeTwoSortedArray {
	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {

		int m = a.size();
		int n = b.size();
		
		for (int i=0; i<n; i++) {
			a.add(0);
		}
		
		while (m > 0 && n > 0) {
			if (a.get(m-1) > b.get(n-1)) {
				a.set(m+n-1, a.get(m-1));
				m--;
			} else {
				a.set(m+n-1, b.get(n-1));
				n--;
			}
			
		}
		
		while (n > 0) {
			a.set(m+n-1, b.get(n-1));
			n--;
		}

	}

	public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
		while (m > 0 && n > 0) {
			if (A[m - 1] > B[n - 1]) {
				A[m + n - 1] = A[m - 1];
				m--;
			} else {
				A[m + n - 1] = B[n - 1];
				n--;
			}
		}
		
		while (n > 0) {
			A[m + n - 1] = B[n - 1];
			n--;
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(-1, 2));

		merge(a, b);
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}

		System.out.println("");

		// int[] A = {1,5,8, 0, 0};
		// int[] B = {6, 10};
		// mergeSortedArray(A, 3, B, B.length);
		// for(int i =0; i<A.length; i++) {
		// System.out.print(A[i] + " ");
		// }

	}

}
