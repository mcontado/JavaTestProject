package test;

import java.util.ArrayList;
import java.util.Collections;

public class AllFactors {

	public static ArrayList<Integer> allFactors(int a) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				list.add(i);

				if (i != Math.sqrt(a))
					list.add(a / i);
			}
		}
		Collections.sort(list);
		return list;
	}

	public static ArrayList<Integer> sieve(int a) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		int[] primes = new int[a + 1];

		for (int i = 0; i <= a; i++) {
			primes[i] = 1;

		}
		primes[0] = 0;
		primes[1] = 0;

		for (int i = 2; i <= a; i++) {
			if (primes[i] == 1) {
				for (int j = 2; i * j <= a; j++) {
					primes[i * j] = 0;
				}
				list.add(i);
			}
		}

		Collections.sort(list);
		return list;
	}

	public static int isPrime(int a) {

		if (a <= 1)
			return 0;

		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return 0;
		}

		return 1;
	}

	public static ArrayList<ArrayList<Integer>> squareSum(int A) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

		for (int a = 1; a * a < A; a++) {
			for (int b = 1; b * b < A; b++) {
				if (a <= b && a * a + b * b == A) {
					ArrayList<Integer> newEntry = new ArrayList<Integer>();

					newEntry.add(a);
					newEntry.add(b);
					ans.add(newEntry);

				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// System.out.println(allFactors(1000000));

		System.out.println(squareSum(13));

	}

}
