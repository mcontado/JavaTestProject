package test;

public class MultiplesOf3Or5 {
	public static int multiple(int n) {
		int sum = 0;
		
		for (int i=n-1; i>0; i--) {
			if (i%3 == 0 || i%5==0)
				sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(multiple(1000));
	}
}
