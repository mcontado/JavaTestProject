package test;

import java.util.*;

public class MinStepsInfinitGrid {
	
	// X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        
        int s1=X.size(), s2=Y.size(), ans=0;

        for(int i=1;i<s1;i++)
    
        {
 
        	 ans = ans + (Math.abs(X.get(i)-X.get(i-1))
        			 < Math.abs(Y.get(i)-Y.get(i-1)) ? 
        					 Math.abs(Y.get(i)-Y.get(i-1)) : Math.abs(X.get(i)-X.get(i-1)));
        }
    
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
