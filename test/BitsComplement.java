package test;

public class BitsComplement {
	static int getIntegerComplement(int n) {
		int complement = 0;
		int remainder = 0;
		int counter = 0;

		if (n == 1) {
			return 0;
		} else if (n == 0) {
			return 1;
		}
		while (n > 1) {
			remainder = n % 2;
			n = n / 2;
			if (remainder == 0) {
				complement = (int) (complement + Math.pow(2, counter));
			}
			counter++;
		}
		if (n == 0) {
			complement = (int) (complement + Math.pow(2, counter));
		}

		return complement;
	}

	public static void main (String[] args) {
		
		int a = 5;
		System.out.println(getIntegerComplement(a));
	}
}
