package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	/*
	 * Given an array of strings, return all groups of strings that are anagrams. 
	 * Represent a group by a list of integers representing the index in the original list
	 * */
	//input: cat, dog, god, tca
	//output: [[1, 4], [2, 3]]
	
//	cat and tca are anagrams which correspond to index 1 and 4. 
//	dog and god are another set of anagrams which correspond to index 2 and 3.
//	The indices are 1 based ( the first element has index 1 instead of index 0).
	
//	Ordering of the result : You should not change the relative ordering of the words 
//	/ phrases within the group. Within a group containing A[i] and A[j], A[i] comes before A[j] if i < j
	
	public static ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		
		int i=1;
		
		for (String str: a) {
			char[] array = str.toCharArray();
			Arrays.sort(array);
			String sorted = new String(array);
			
			if (map.containsKey(sorted)) {
				ArrayList<Integer> list = map.get(sorted);
				list.add(i);
			} else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(sorted, list);
				
			}
			i++;
		}
		
		for (Map.Entry<String, ArrayList<Integer>> entrySet: map.entrySet()) {
			result.add(entrySet.getValue());
		}
		
		return result;
		
		
	}
	
	public static void main(String[] args) {
		List<String> strs = new ArrayList<String>(Arrays.asList("cat","dog","god","act"));
		ArrayList<ArrayList<Integer>> res  = anagrams(strs);
		
		for (int i = 0; i <res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
		

	}

}
