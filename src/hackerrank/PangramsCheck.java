package hackerrank;

import java.util.Scanner;

public class PangramsCheck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		String str = in.nextLine();
		
		if (isPangrams(str)) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
		
		
	}
	
	public static boolean isPangrams(String str) {
		String strCopy = str.toLowerCase().replaceAll("\\s", "");
		//str.toLowerCase();
		int count = 0;
		for (char c = 'a'; c<= 'z'; c++) {
			if (!strCopy.contains(String.valueOf(c))) {
				return false;
			}
			count++;
		}
		return count == 26;
	}
}
