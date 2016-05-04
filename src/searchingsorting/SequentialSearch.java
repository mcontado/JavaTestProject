package searchingsorting;

public class SequentialSearch {
	
	//Sequential Search on unordered list on an array of integers
	public static boolean seqSearch(int[] arr, int target) {
		boolean found = false;		
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] == target) {
				found = true;
			} 
		}		
		return found;		
	}
	
	//Sequential Search on Ordered List an array of integers
	public static boolean orderedSeqSearch(int[] arr, int target) {
		boolean found = false;
		for (int i=0; i<arr.length;i++) {
			if (arr[i] == target) {
				found = true;
			} else  {
				if (arr[i] > target) {
					return found;
				}
			}
		}
		return found;
	}

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int target = 4;
		
		System.out.println(orderedSeqSearch(arr, target));

	}

}
