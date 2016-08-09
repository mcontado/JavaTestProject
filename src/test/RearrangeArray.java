package test;

import java.util.ArrayList;

public class RearrangeArray {

	//Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
	public static void arrange(ArrayList<Integer> a) {

		int n = a.size();
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			b.add(a.get(a.get(i)));

		a.clear();

		for (int x : b) {
			a.add(x);
		}
		
	}

	// InterviewBit approach with O(1) extra space.
	public void arrangeArr(ArrayList<Integer> A) {
		int n = A.size();
		for (int i = 0; i < n; i++)
			A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n);
		for (int i = 0; i < n; i++)
			A.set(i, A.get(i) / n);
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(0);
		a.add(1);

		for (int b : a) {
			System.out.print(b);
			System.out.print(" ");
		}

		arrange(a);
		System.out.println(" ");
		for (int b : a) {
			System.out.print(b);
			System.out.print(" ");
		}

	}

}
