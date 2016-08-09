package test;

import java.util.*;

public class FirstMissingPositive {

	public static int firstMissingPositive(ArrayList<Integer> a) {
		int n = a.size();

		for (int i = 0; i < n; i++) {
			while (a.get(i) != i + 1) {
				if (a.get(i) <= 0 || a.get(i) >= n)
					break;

				if (a.get(i) == a.get(a.get(i) - 1))
					break;

				int temp = a.get(i);
				a.set(i, a.get(temp - 1));
				a.set((temp - 1), temp);
			}
		}

		for (int i = 0; i < n; i++) {
			if (a.get(i) != i + 1) {
				return i + 1;
			}
		}

		return n + 1;
	}

	// SOLUTION FROM InterviewBit
	public static int firstMissingPositive1(ArrayList<Integer> A) {

		int n = A.size() + 1;
		int count;
		int idx = 0;
		int size = A.size();
		count = size - 1;

		for (idx = size - 1; idx >= 0; idx--) {

			int num = A.get(idx);

			if (num < 0) {
				int val = A.get(count);
				A.set(idx, val);
				A.set(count, num);
				count--;
			}

		}

		for (idx = 0; idx <= count; idx++) {

			int num = A.get(idx);

			num = Math.abs(num);

			if (num > 0 && num < n) {

				int index = num - 1;
				int val = A.get(index);
				A.set(index, -val);

			}

		}

		for (idx = 0; idx <= count; idx++) {

			int num = A.get(idx);

			if (num > 0) {
				return idx + 1;
			}

		}

		return idx + 1;

	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(-8);
		a.add(-7);
		a.add(-6);

		System.out.println(firstMissingPositive(a));

	}

}
