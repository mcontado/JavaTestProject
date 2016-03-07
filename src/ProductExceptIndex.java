import java.util.ArrayList;

public class ProductExceptIndex {
	
	public static int[] prodindex(int[] num) {
		int[] output = new int[num.length];
		int product = 1;
		int i = 0;
		
		while (i < num.length) {
			output[i] = product;
			product *= num[i];
			i++;
		}
		
		product = 1;
		i = num.length-1;
		while (i >= 0) {
			output[i] *= product;
			product *= num[i];
			i--;
		}
		
		return output;
	}

	public static void main(String[] args) {
		int[] prod = {1,2,3,4};
		System.out.println(prodindex(prod));

	}

}
