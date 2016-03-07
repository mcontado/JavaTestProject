package test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchCountElements {

	public static int findCount(final List<Integer> a, int b) {
		
		int result = 0;
		
		int firstIndex = binarySearch(a, a.size(), b, true);
		if (firstIndex == -1) 
			result = 0;
		else {
			int lastIndex = binarySearch(a, a.size(), b, false);
			result = lastIndex - firstIndex + 1;
		}
		
		return result;
	}
	
	
/*	public static int findCount(int a[], int b) {
		int result = 0;
		
		int firstIndex = binarySearch(a, a.length, b, true);
		if (firstIndex == -1) 
			result = 0;
		else {
			int lastIndex = binarySearch(a, a.length, b, false);
			result = lastIndex - firstIndex + 1;
		}
		
		return result;
	}*/
	
	public static int binarySearch(List<Integer> a, int n, int value, boolean searchFirst) {
		
		int low = 0, high = n-1, result=-1;
	
		while (low<=high) {
			int mid = (low + high) / 2;
			
			if (a.get(mid) == value) {
				result = mid;
				if (searchFirst)
					high = mid - 1; //go searching toward left (lower indices)
				else
					low = mid + 1;
			}
				
			else if (value < a.get(mid))
				high = mid - 1;
			else 
				low = mid + 1;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(2);
		array.add(3);
		array.add(3);
		array.add(3);
		array.add(4);
		array.add(5);
				
		
		System.out.println(findCount(array, 6));

	}

}
