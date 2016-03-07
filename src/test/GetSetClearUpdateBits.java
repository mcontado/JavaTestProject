package test;

public class GetSetClearUpdateBits {
	static boolean getBit(int num, int i) {
		return ((num & (1 << i)) != 0);
	}
	
	public static void main (String[] args) {
		System.out.println(4 & 4);
	}
}
