package test;

public class PrintEvenNumbers {
	
	public static void printEven(int n) {
		for (int i = 0; i <= n; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void printEvenUsingBitAnd(int n) {
		for (int i=0; i<=n; i++) {
			if ((i & 1) == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void printEvenUsingOperators(int n) {
		for (int i=0; i<=n; i++) {
			if (((i/2)*2) == i) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		printEvenUsingOperators(n);
	}

}
