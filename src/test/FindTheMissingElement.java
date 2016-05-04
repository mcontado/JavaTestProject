package test;

public class FindTheMissingElement {

	public static int finder(int[] arr1, int[] arr2) {
		
		int sumFirstArr=0;
		int sumSecondArr=0;
		
		for (int i=0; i<arr1.length; i++) {
			sumFirstArr += arr1[i];
		}
		
		for (int j=0; j<arr2.length; j++) {
			sumSecondArr += arr2[j];
		}
		
		return sumFirstArr - sumSecondArr;
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8};
		int[] arr2 = {3,4,6,7,8,1,5};

		System.out.println(finder(arr1,arr2));
	}

}
