package searchingsorting;

public class MergeSort {
	
	public static void merge(int[] left, int[] right, int[] result) {
		// Merge both halves into the result array
       
		// Next element to consider in the left array
		int iLeft = 0;
		 // Next element to consider in the right array
		int iRight = 0;
		
		 // Next open position in the result
		int j = 0;
		
		// As long as neither iLeft nor iRight is past the end, move the
        // smaller element into the result.
		while (iLeft < left.length && iRight < right.length) {
			if (left[iLeft] < right[iRight]) {
				result[j] = left[iLeft];
				iLeft++;
			} else {
				result[j] = right[iRight];
				iRight++;
			}
			j++;
		}
		
		   // copy what's left
		System.arraycopy(left, iLeft, result, j, left.length - iLeft);
		System.arraycopy(right, iRight, result, j, right.length - iRight);
		
	}
	
	public static int[] mergeSort(int[] A) {
		if (A.length <= 1) {
			return A;
		}
		
		//Split the array in half
		int[] left = new int[A.length/2];
		int[] right = new int[A.length - left.length];
		
		System.arraycopy(A, 0, left, 0, left.length);
		System.arraycopy(A, left.length, right, 0, right.length);
		
		 // Sort each half
		mergeSort(left);
		mergeSort(right);
		
		 // Merge the halves together, overwriting the original array
		merge(left, right, A);
		
		return A;

		
	}

	public static void main(String[] args) {
		int[] arr = {2,4,1,6,8,5,3,7};
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
		System.out.println("");
		mergeSort(arr);
		
		
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}

	}

}
