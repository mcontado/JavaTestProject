
public class SortSelection {
	
	public static int[] selectionSort(int arr[]) {
		
		
		for (int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int minValue = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = minValue;
			
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = selectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(" ");
        }  
	}

}
