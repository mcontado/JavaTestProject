package test;

public class BinarySearch {
	
	//Iterative binarysearch
	public static int binarySearch(int array[], int n, int value) {
		int low = 0, high = n-1;
	
		while (low<=high) {
			int mid = (low + high) / 2;
			
			if (array[mid] == value)
				return mid;
			else if (value < array[mid])
				high = mid - 1;
			else 
				low = mid + 1;
		}
		
		return -1;
	}
	
	//Recursive Binary search
	public static int binarySearchRecursion(int array[], int low, int high, int value) {
		
		if (low > high) return -1;
		
		int mid = (low+high) / 2;
		
		if (array[mid] == value) return mid;
		else if (value < array[mid])
			return binarySearchRecursion(array, low, mid-1, value);
		else
			return binarySearchRecursion(array, mid+1, high, value);
			
	}
	
	public static void main (String args[]) {
		int array[] ={2,4,6,8,10,12,14,16};
		
		System.out.println(binarySearchRecursion(array, 0, array.length-1, 120));
		
	}
}
