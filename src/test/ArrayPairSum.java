package test;
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
		int count = 0;
		for (int value:arr) {
			int target = sum - value;
			//if target number is not in set, then add the value
			if (!set.contains(target)) {
				set.add(value);			
			} else {
				System.out.println("PAIRS ==> " + value +  ", " + target);
				count++;
			}
		}
		System.out.println("TOTAL COUNT OF PAIRS : " + count);
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
	
	
	//print the indices of the pair
	public static int[] twoSums(int[] nums, int target) {
		int[] indices = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;
					break;	
				}	
			}
		}
		return indices;		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr2 = { 2, 4, 7, 5, 9, 10, -1, 2, -1};
//				
//		//printPairs(arr2, 9);
		
		
		int[] nums = {1,2,3,4,5,6};
		int target = 7;
		
		printPairsUsingSet(nums, target);
		
		//System.out.println(Arrays.toString(twoSums(nums, target)));
				
	}

}
