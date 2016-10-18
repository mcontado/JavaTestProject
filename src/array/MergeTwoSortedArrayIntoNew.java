package array;

public class MergeTwoSortedArrayIntoNew {
	public static int[] mergeArray(int a[], int b[]) {
		int aSize = a.length;
		int bSize = b.length;
		
		int c[] = new int[aSize + bSize];
		
		while (aSize > 0 && bSize > 0) {
			if (a[aSize - 1] > b[bSize - 1]) {
				c[aSize + bSize - 1] = a[aSize -1];
				aSize--;
			} else {
				c[aSize + bSize - 1] = b[bSize -1];
				bSize--;
			}
		}
		
		while (aSize > 0) {
			c[aSize - 1] = a[aSize - 1];
			aSize--;
		}
		
		while (bSize > 0) {
			c[bSize - 1] = b[bSize - 1];
			bSize--;
		}
		
		return c;
		
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,6,7,8,9};
		int[] b = {1,3,4,5,8};
		
		int c[] = mergeArray(a, b);
		
		for (int input: c) {
			System.out.print(input + " ");
		}
	}

}
