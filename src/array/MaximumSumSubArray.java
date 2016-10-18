package array;

public class MaximumSumSubArray {
	public static int maxSubArray(int[] arr) {
		int maxSum = 0;
		int currentSum = 0;
		
		for (int i =0; i<arr.length; ++i) {
			if (currentSum + arr[i] > 0) {
				currentSum += arr[i];
			} else {
				currentSum = 0;
			}
			
			maxSum = Math.max(currentSum, maxSum);
		}
		
		return maxSum;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

}
