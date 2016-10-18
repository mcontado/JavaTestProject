package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
	
	public static ArrayList<Integer> twoSum(final List<Integer> a, int b) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for (int i=0; i<a.size(); i++) {
				if (map.containsKey(a.get(i))) {
					int index = map.get(a.get(i));
					result.add(index+1);
					result.add(i+1);
					break;
				} else {
					if (map.containsKey(b-a.get(i))) {
						continue;
					} else {
						map.put(b-a.get(i), i);
					}
					
				}
			}
			
			return result;
		
	}
	
	
	//array instead of arraylist
	public static int[] twoSumArr(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		
		for (int i=0; i<numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index+1;
				result[1] = i+1;
				break;
			} else {
				if (map.containsKey(target-numbers[i])) {
					continue;
				} else {
					map.put(target-numbers[i], i);
				}
			
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(10, -3, 5, -7, -4));
		int target = -2;
		
		System.out.println(twoSum(a, target));
//		
//		int[] arr = {4, 7, -4, 2, 2, 2, 3, -5, -3};
//		int targetb = -3;
//		
//		int[] result = twoSumArr(arr, targetb);
//		
//		for (int n:result) {
//			System.out.print(n + " ");
//		}
		
	}

}
