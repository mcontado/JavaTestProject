package test;
import java.util.HashMap;

public class Recursion {
	public static int factorial(int n) {
		//4! = 24
		//Solved as: 4 * 3!
		// if n=0; n = 1
		
		//Base Case
		if (n == 0)
			return 1;
		else
			//recursive case
			return n * factorial(n-1);
	}

	
	public static int factorialMemoize(int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//Base Case
		if (n == 0)
			return 1;
		else if (map.containsKey(n)) {
			return map.get(n);
		} else {
			int x = n * factorialMemoize(n-1);
			map.put(n, x);
			System.out.println(map);
			return x;
		}
			
	}
	
	
	
	
	//Recursive function that takes an integer and computes the cumulative sum of 0 to n
	public static int cumulativeSum(int n) {
		//Base Case
		if (n < 2)
			return n;
		else
		//Recursive Case
			return n + cumulativeSum(n-1);
	}
	
	//Recursive Fibonacci
	public static int fibonacci(int n) {
		//Base case
		if (n <= 1)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	//Sum all digits
	public static int sumAllDigits(int n) {
		//Base case
		if (String.valueOf(n).length() == 1)
			return n;
		//Recursive case
		return n % 10 + sumAllDigits(n/10);
	}
	
	public static void main(String[] args) {
		int n = 5;
		//System.out.println(factorialMemoize(1));
		
		//System.out.println(cumulativeSum(n));
		
		System.out.println(sumAllDigits(123456));

	}

}
