package test;

import java.util.ArrayList;
import java.util.List;

public class FirstLastOccurences {
	public static int findFirstOccurrence(int[] array, int value) {
		int low = 0, high = array.length-1;
		int firstOccurence = -1;
		
		while (low<=high) {
			int mid = (low + high) / 2;
			
			if (array[mid] == value) {
				high = mid - 1;
				firstOccurence = mid;	
			} else if (value < array[mid])
				high = mid - 1;
			else 
				low = mid + 1;
		}
		
		return firstOccurence;
	}
	
	public static int findLastOccurence(int[] array, int value) {
		int low = 0, high = array.length-1;
		int lastOccurence = -1;
		
		while (low<=high) {
			int mid = (low + high) / 2;
			
			if (array[mid] == value) {
				low = mid + 1;
				lastOccurence = mid;	
			} else if (value < array[mid])
				high = mid - 1;
			else 
				low = mid + 1;
		}
		
		return lastOccurence;
	}
	
	//Combined search of first and last occurrence using 2 methods findFirstOccurrence and findLastOccurence
	public static ArrayList<Integer> mySearchRange(int[] A, int B) {
		int low, up;
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		low = findFirstOccurrence(A, B);
		
		if (low == -1) {
			result.add(-1);
			result.add(-1);
			return result;
		}
		
		up = findLastOccurence(A, B);
		
		result.add(low);
		result.add(up);
		
		return result;
		
	}
	
	//Combined search of first and last occurrence
	public static int[] findFirstAndLastOccurence (int[] A, int target) {
		int[] ret = {-1, -1};
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (A[mid] < target)
                start = mid + 1;
            else
                end = mid;
        }
        int low;
        if (A[start] != target)
            return ret;
        else
            low = start;
        start = 0;
        end = A.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (A[mid] < target + 1)
                start = mid + 1;
            else
                end = mid;
        }
        int high = A[start] == target ? start : start - 1;
        ret[0] = low;
        ret[1] = high;
        return ret;
	}
	
	//Interview Bit Challenge using return type ArrayList
	public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		ArrayList<Integer> ret = new ArrayList<Integer>(2);
		ret.add(-1);
		ret.add(-1);
		
        int start = 0;
        int end = a.size() - 1;
        
        while (start < end) {
            int mid = (start + end) / 2;
            if (a.get(mid) < b)
                start = mid + 1;
            else
                end = mid;
        }
        
        int low;
        
        if (a.get(start) != b)
            return ret;
        else
            low = start;
        
        start = 0;
        end = a.size() - 1;
        
        while (start < end) {
            int mid = (start + end) / 2;
            if (a.get(mid) < b + 1)
                start = mid + 1;
            else
                end = mid;
        }
        
        int high = a.get(start) == b ? start : start - 1;
        
        ret.set(0, low);
        ret.set(1, high);
    
        return ret;
	}
	
	public static void main(String[] args) {
		int[] arr = {0, 1,1,1,2,3, 4, 4, 4, 4, 5,6};
		System.out.println(mySearchRange(arr, 4));
		//System.out.println(findFirstAndLastOccurence(arr, 4));
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(7);
		a.add(7);
		a.add(8);
		a.add(8);
		a.add(10);
		
		System.out.println(searchRange(a, 8));
	}
	
	
}
