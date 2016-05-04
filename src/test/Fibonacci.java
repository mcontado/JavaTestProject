package test;


public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }
    
    public static int fibIte(int n) {
    	if (n == 1 || n == 2)
    		return 1;
    	//if (n == 0) return 0;
    	
    	int fib1 = 1, fib2 = 1, fibonacci = 0;
    	for (int i = 3; i <= n; i++) {
    		fibonacci = fib1 + fib2;
    		fib1 = fib2;
    		fib2 = fibonacci;
    	}
    	return fibonacci;
    }
    
    public static int fibMemoize(int n) {
    	
    	 int [] memo = new int[n];
    	 
    	 if (n <= 1) return n;
    	 
    	 if (memo[n-1] != 0)  
    		 return memo[n];
    	 else 
    		 memo[n-1] = fibMemoize(n-1) + fibMemoize(n-2);
    	 
    	 return memo[n-1];
    	
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println( "Fib " + n + ": " + fibMemoize(n));
    }
	
}
