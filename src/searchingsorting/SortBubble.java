package searchingsorting;

public class SortBubble {
	
	public static int[] bubbleSort(int[] arr) {
		boolean swap;
		do {
			swap = false;
			for (int i=0; i<arr.length-1; i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swap = true;
				}
			}
		} while (swap);
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {99,10,34,2,56,7,67,88,42};
	        int[] arr2 = bubbleSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(" ");
	        }  

	}

}
