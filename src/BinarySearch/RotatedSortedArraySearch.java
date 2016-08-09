package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatedSortedArraySearch {

	// standard binary search function
	public static int binarySearch(int[] arr, int low, int high, int key) {
		if (high < low)
			return -1;

		int mid = low + (high - low) / 2;

		if (arr[mid] == key) {
			return mid;
		}

		if (arr[mid] < key) {
			return binarySearch(arr, (mid + 1), high, key);
		} else {
			return binarySearch(arr, low, (mid - 1), key);

		}

	}

	//finding pivot point in a rotated array
	public static int findPivotPoint(int A[]) {
		int left = 0;
		int right = A.length - 1;

		while (A[left] > A[right]) {
			int mid = left + (right - left) / 2;

			if (A[mid] > A[right])
				left = mid + 1;
			else
				right = mid;
		}
		return left;
	}

	public static int rotated_binary_search(int A[], int key) {
		int left = 0;
		int right = A.length - 1;

		while (left <= right) {
			// Avoid overflow, same as M=(L+R)/2
			int mid = left + ((right - left) / 2);
			if (A[mid] == key)
				return mid;

			// the bottom half is sorted
			if (A[left] <= A[mid]) {
				if (A[left] <= key && key < A[mid])
					right = mid - 1;
				else
					left = mid + 1;
			}
			
			// the upper half is sorted
			else {
				if (A[mid] < key && key <= A[right])
					left = mid + 1;
				else
					right = mid - 1;
			}
		}
		return -1;
	}

	// same as above, only conforming with the function prototype given at InterviewBit
	public static int search(final List<Integer> a, int b) {
		int left = 0;
		int right = a.size() - 1;

		while (left <= right) {
			// Avoid overflow, same as M=(L+R)/2
			int mid = left + ((right - left) / 2);
			if (a.get(mid) == b)
				return mid;

			// the bottom half is sorted
			if (a.get(left) <= a.get(mid)) {
				if (a.get(left) <= b && b < a.get(mid))
					right = mid - 1;
				else
					left = mid + 1;
			}
			
			// the upper half is sorted
			else {
				if (a.get(mid) < b && b <= a.get(right))
					left = mid + 1;
				else
					right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 6, 1, 2 };
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i: a) {
			b.add(i);
		}
		//System.out.println(Arrays.toString(a));
		//System.out.println(findPivotPoint(a));
		System.out.println(search(b, 1));
	}

}
