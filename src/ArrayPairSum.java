import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPairSum {

	//Complexity : O(n^2)
	//brute force solution
	public static void printPairs(int arr[], int sum) {
		for (int i=0; i<arr.length; i++) {
			int first = arr[i];
			for (int j = i+1; j<arr.length; j++) {
				int second = arr[j];
				
				if ((first+second) == sum) {
					System.out.println(first + ", " + second);
				}
			}
		}
		
	}
	
	//Using HashSet
	public static void printPairsUsingSet(int arr[], int sum) {
		if (arr.length < 2) return;
		
		Set set = new HashSet(arr.length);
		
		for (int value:arr) {
			int target = sum - value;
			//if target number is not in set, then add
			if (!set.contains(target)) {
				set.add(value);			
			} else {
				System.out.println("PAIRS ==> " + value +  ", " + target);
			}
		}
	}
	
	//Sort the array, and use 2 pointers to scan through array from both direction
	public static void printPairsUsingTwoPointers(int[] arr, int sum) {
		
		if (arr.length < 2) return;
		
		Arrays.sort(arr);
		
		int start = 0;
		int end = arr.length-1;
		
		while (start < end) {
			int target = arr[start] + arr[end];
			
			if (target == sum) {
				System.out.println(arr[start] + ", " + arr[end]);
				start++;
				end--;
			} else if (target < sum) {
				start++;
			} else {
				end--;
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = { 2, 4, 7, 5, 9, 10, -1, 2, -1};
				
		//printPairs(arr2, 9);
		printPairsUsingSet(arr2, 9);
				
	}

}
