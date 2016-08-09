package test;

import java.util.ArrayList;
import java.util.List;

public class LargestContinousSum {

	public static int findMaxSum(int[] arr) {
		int currentSum = 0;
		int currentMax = 0;

		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];

			if (currentMax < currentSum) {
				currentMax = currentSum;
			} else if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return currentMax;
	}

	// DO NOT MODFIY THE LIST.
	public static int maxSubArray(final List<Integer> a) {
		int newsum = a.get(0);
		int max = a.get(0);

		for (int i = 1; i < a.size(); i++) {
			newsum = Math.max(newsum + a.get(i), a.get(i));
			max = Math.max(max, newsum);
		}
		return max;

	}

	// Most accepted solution
	public static int maxSubArrayFinal(final List<Integer> A) {

		int sum = Integer.MIN_VALUE;
		int last = 0;

		for (int num : A) {

			last += num;
			sum = Math.max(sum, last);
			if (last < 0)
				last = 0;
		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, -1, 3, 4, 10, 10, -10, -1 };
		// System.out.println(findMaxSum(arr));

		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(-2);
		arr1.add(1);
		arr1.add(-3);
		arr1.add(4);
		arr1.add(-1);
		arr1.add(2);
		arr1.add(1);
		arr1.add(-5);
		arr1.add(4);

		 System.out.println(maxSubArrayFinal(arr1));

	}

}
