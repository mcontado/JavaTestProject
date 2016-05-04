package test;

public class LargestContinousSum {

	public static int findMaxSum(int[] arr) {
		int currentSum = 0;
		int currentMax = 0;
		
		for (int i=0; i<arr.length; i++) {
			currentSum += arr[i];
			
			if (currentMax < currentSum) {
				currentMax = currentSum;
			} else if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return currentMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,-1,3,4,10,10,-10,-1};
		System.out.println(findMaxSum(arr));
	}

}
