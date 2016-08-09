package test;

import java.util.Scanner;

public class StringOddEven {

	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		String[] arr = new String[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = in.next();
		}
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		
		for (int i=0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length(); j++) {
				if (j%2 == 0) {
					sb1.append(arr[i].charAt(j));
				} else {
					sb2.append(arr[i].charAt(j));
				}
			}
			System.out.println(sb1.toString() + " " +sb2.toString());
			sb1 = new StringBuffer();
			sb2 = new StringBuffer();
		}
	}

}
