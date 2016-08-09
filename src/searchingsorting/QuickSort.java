package searchingsorting;

import java.util.Arrays;

public class QuickSort {
	
	
	public static void quickSortFunc(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
		
		if (low>=high) 
			return;
		
		//pick the pivot
		int middle =  low + (high - low) / 2;
		int pivot = arr[middle];
		
		//make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
		}
		
		//recursively sort two subparts
		if (low < j) {
			quickSortFunc(arr, low, j);
		}
		if (high > i) {
			quickSortFunc(arr, i, high);
		}
		
	}
	

	public static void main(String[] args) {
		int[] arr = {7,6,5,4,3,2,1,0};
		System.out.println(Arrays.toString(arr));
		quickSortFunc(arr, 0, 7);
		System.out.println(Arrays.toString(arr));
		

	}

}
