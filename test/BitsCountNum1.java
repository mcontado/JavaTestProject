package test;

public class BitsCountNum1 {
	public static int numSetBits(long a) {
		int count = 0;
		while (a > 0) {
			if (a%2 == 1)
				count++;
			
			a = a/2;
		}
		return count;
	}
	
	public static void main (String[] args) {
		System.out.println(numSetBits(125));
	}
}
