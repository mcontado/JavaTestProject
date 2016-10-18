package test;

import java.util.Scanner;

public class AlternateCharacters {

	public static int getCountDeletion(String s) {
		int count = 0, index = 0;
		
		for (int i = 1; i<s.length(); i++) {
			if (s.charAt(i) == s.charAt(index)) {
				count++;
			} else {
				index = i;
			}
		}
		return count;
	}
	

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
       
		
		String[] strings = new String[n];
		
		for (int i = 0; i<n; i++) {
			strings[i] = in.nextLine();
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(getCountDeletion(strings[i]));
		}
		
		
		////
//		Scanner in = new Scanner(System.in);
//        int n = Integer.parseInt(in.nextLine());
//        int[] arr = new int[n];
//        
//        for (int i=0; i<n; i++) {
//            arr[i] = Integer.parseInt(in.nextLine());
//        }
//        
//        for (int i = 0; i<n; i++) {
//            System.out.println(sumMultiples(arr[i]));
//        }

	}

}
