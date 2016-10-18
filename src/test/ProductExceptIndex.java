package test;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ProductExceptIndex {
	
	public static int[] prodindex(int[] num) {
		int[] output = new int[num.length];
		int product = 1;
		int i = 0;
		
		while (i < num.length) {
			output[i] = product;
			product *= num[i];
			System.out.print(output[i] + " ");
			i++;
			
			
		}
		
		
		
		product = 1;
		i = num.length-1;
		System.out.println("");
		while (i >= 0) {
			output[i] *= product;
			product *= num[i];

			System.out.print(output[i] + " ");
			i--;
			
		}
		
		return output;
	}

	public static void main(String[] args) {
		int[] prod = {1,2,3,4};
		
		int[] result = prodindex(prod);
		System.out.println(" ");
		for (int a: result) {
			System.out.print(a + " ");
		}
		

	}

}
