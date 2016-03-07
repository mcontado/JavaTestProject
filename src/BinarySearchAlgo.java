
public class BinarySearchAlgo {

	//Iterative binary search
	public static int binarySearchIterative(int arr[], int value) {
		int low = 0;
		int high = arr.length-1;
		
		while (low <= high) {
			int mid = (low+high) / 2;
			if (arr[mid] == value)
				return mid;
			else if (value < arr[mid])
				high = mid - 1;
			else 
				low = mid + 1;
		}
		
		return -1;
	}
	
	//Recursive binary search
	public static int binarySearchRecursive(int arr[], int low, int high, int value) {
		//base case
		if (low>high) return -1;
		
		//recursive case
		int mid = (low + high) / 2;
		if (arr[mid] == value) return mid;
		else if (value < arr[mid])
			return binarySearchRecursive(arr, low, mid-1, value);
		else
			return binarySearchRecursive(arr, mid+1, high, value);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {7, 10, 34, 42, 56, 67, 88, 99}; 
		System.out.println(binarySearchIterative(arr, 99));
		System.out.println(binarySearchRecursive(arr, 0, arr.length, 7));

	}

}
