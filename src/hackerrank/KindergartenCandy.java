package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class KindergartenCandy {

	public static int distributeCandy(int[] score) {
		
		 int len = score.length;
		    int[] candy = new int[len];

		    candy[0] =1;
		    for (int i = 1; i < len; i++) {
		        if (score[i] > score[i-1]) {
		        	
		            candy[i] = candy[i-1] + 1;
		           
		        } else {
		            candy[i] = 1;
		        }
		    }

		   /* for (int i= len-1; i>0 ; i--)
		     {
		         if(score[i-1]>score[i])
		             candy[i-1]=Math.max(candy[i]+1,candy[i-1]);
		     }
		    */
		    
		     int result=0;
		     for (int i = 0; i < len; i++)
		     {
		         result+=candy[i];
		     }
		     return result;
	}

	 public static void main(String[] args) throws IOException{
		 	int[] score = {3,1,2,2};
		 	System.out.println(distributeCandy(score));
	    }

}
