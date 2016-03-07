package test;



public class BitCheckIfMultipleOf3 {

	public static boolean isMultipleOf3(int n)
	{
		if(n < 0) n = -n;

        int evenCtr = 0;
        int oddCtr = 0;

        while (n != 0) {
            if ((n & 1) == 1) { 
                oddCtr++;
            } 
            n = n>>1;
            if ((n & 1) == 1) {
                evenCtr++;
            } 
            n = n>>1;
        }

        return evenCtr == oddCtr;
	}
	
	public static void main(String[] args) {
		int n = 12;
		
		System.out.println(n + " multiple of 3: " + isMultipleOf3(n));
		
		if (n < 0) n = -n;

		int evenCtr = 0;
		int oddCtr = 0;
		
		while(n != 0) {
			System.out.println("\nFirst (n&1): " + (n & 1));
			if ((n & 1) == 1) { 
				oddCtr++;
			}
			System.out.println("oddCtr: " + oddCtr);
			System.out.println("First n>>1 value First: " + (n>>1));
			n = n>>1;
			System.out.println("First n: " + n);
			System.out.println("\nSecond (n&1): " + (n & 1));
			if ((n & 1) == 1) {
	            evenCtr++;
	        }
			System.out.println("evenCtr: " + evenCtr);
			System.out.println("Second n>>1 value: " + (n>>1));
	        n = n>>1;
	        System.out.println("Second n: " + n);
		}
		
	}
}
