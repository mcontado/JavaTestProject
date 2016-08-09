package test;

import java.util.*;

public class SortedInsertPosition {

	// public static int searchInsert(ArrayList<Integer> a, int b) {
	// int pos = -1;
	//
	// int start = 0;
	// int end = a.size() -1;
	//
	// while (start <= end) {
	// int mid = (start + end) / 2;
	//
	// if (a.get(mid) == b) {
	// pos = mid;
	// return pos;
	// } else if (a.get(mid) < b) {
	// start = mid + 1;
	// pos = start;
	// } else {
	// end = mid - 1;
	//
	// pos = end;
	// }
	// }
	//
	// if (pos == -1) {
	// pos = 0;
	// }
	//
	// return pos;
	// }

	public static int searchInsert(ArrayList<Integer> a, int b) {
		if (a == null || a.size() == 0)
			return 0;

		return searchInsert(a, b, 0, a.size() - 1);
	}

	public static int searchInsert(ArrayList<Integer> a, int target, int start, int end) {
		int mid = (start + end) / 2;

		if (target == a.get(mid))
			return mid;
		else if (target < a.get(mid))
			return start < mid ? searchInsert(a, target, start, mid - 1) : start;
		else
			return end > mid ? searchInsert(a, target, mid + 1, end) : (end + 1);
	}

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(3);
		a1.add(5);
		a1.add(6);

		System.out.println(a1);

		System.out.println("Index # / To be added at: " + searchInsert(a1, 0));
	}

}
