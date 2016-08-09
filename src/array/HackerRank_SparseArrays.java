package array;

import java.util.HashMap;
import java.util.Scanner;

public class HackerRank_SparseArrays {

	/*
	 There are  strings. Each string's length is no more than  characters. 
	 There are also  queries. For each query, you are given a string, and 
	 you need to find out how many times this string occurred previously.

		Input Format
		
		The first line contains , the number of strings.
		The next  lines each contain a string.
		The N + 2nd line contains , the number of queries.
		The following  lines each contain a query string.
 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i<n; i++) {
			String s = sc.next();
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		
		int queryNo = sc.nextInt();
		String[] arr = new String[queryNo];
		for (int i=0; i<queryNo; i++) {
			arr[i] = sc.next();
		}
		
		for (int i = 0; i<arr.length; i++) {
			if (map.get(arr[i]) == null) {
				System.out.println(0);
			} else {
				System.out.println(map.get(arr[i]));
			}
		}
		
		//System.out.println(map);

	}

}
