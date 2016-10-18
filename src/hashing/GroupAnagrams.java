package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		HashMap<String, ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		
		for(String str: strs){
			char[] arr = new char[26];
			for(int i=0; i<str.length(); i++){
				arr[str.charAt(i)-'a']++;
			}
				
			String ns = new String(arr);
			if(map.containsKey(ns)){
				map.get(ns).add(str);
			}else{
				ArrayList<String> al = new ArrayList<String>();
				al.add(str);
				map.put(ns, al);
			}
		} //end for loop
		result.addAll(map.values());
		return result;
	}

	public static void main(String[] args) {
		String[] strs = {"cat","dog","god","act"};
		List<List<String>> output = groupAnagrams(strs);
		
		for (int i = 0; i <output.size(); i++) {
			System.out.println(output.get(i));
		}

	}

}
