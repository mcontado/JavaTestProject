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
	
	public static int consecBit1(long a) {
		int count = 0;
		int maxCountBit1 = 0;
		while (a > 0) {
			if (a%2 == 1)
				count++;
			else {
				if (count > maxCountBit1) {
					maxCountBit1 = count;
				}
				count=0;
				
				
			}
				
			if (count > maxCountBit1) {
				maxCountBit1 = count;
			}
			a = a/2;
		}
		return maxCountBit1;
	}
	
	public static void main (String[] args) {
		//System.out.println(numSetBits(13));
		System.out.println(consecBit1(439));
	}
}
