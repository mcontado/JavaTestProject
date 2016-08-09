package BinarySearch;

public class PowerFunction {
	
	public static int pow(int x, int n, int d) {
		long ans=1;
		long square=x;
		
		if(n==0)
		    return 1 % d;
		
		while(n!=0)
		{
		    if(n%2 != 0)
		        ans=ans*square;
		    
		    square=(square*square)%d;
		    
		    n=n/2;
		    
		    if(ans>d)
		       ans=ans%d;
		    	
		}
		
		if (ans < 0) {
			ans = (ans + d) % d;
		}
		return (int)ans;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 3;
		System.out.println(pow(a,b,c));
		//System.out.println(Integer.MAX_VALUE);
	}


}
