package test;

public class MinimumCoins {
	
	public static void main (String[] args) {
		System.out.println(minCoins(3.00));
	}
	
	public static  int minCoins(double dollar){
	    int quarter = 0, nickel = 0, dime = 0, penny = 0;
	    
	    int total=0;
		
	    if(dollar <= 0){
	        return 0;
	    }

	    if (dollar == 1) {
	    	quarter = 4;
	    } else {
	    	
	    }
	    return total;
	    
	}
	// 1.05 is equal to
	// .25 = 4
	// .05 = 1
	
	// 1.86
	// .25 = 7
	// 
	
}
