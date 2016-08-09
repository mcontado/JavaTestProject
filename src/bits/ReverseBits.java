package bits;

public class ReverseBits {
	
	public static long reverseBits(long n) {
		for (int i = 0; i < 16; i++) {
			n = swapBits(n, i, 32 - i - 1);
		}
	 
		return n;
	}
	 
	public static long swapBits(long n, int i, int j) {
		long a = (n >> i) & 1;
		long b = (n >> j) & 1;
	 
		if ((a ^ b) != 0) {
			return n ^= (1 << i) | (1 << j);
		}
	 
		return n;
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(reverseBits(n));

	}

}
