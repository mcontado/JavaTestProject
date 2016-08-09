package searchingsorting;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int index = i;
			
			while (index > 0 && arr[index - 1] > value) {
				arr[index] = arr[index - 1];
				index--;
			}
			
			arr[index] = value;
		}
	}

	@Override
	public String toString() {
		return "InsertionSort [toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		insertionSort(arr);
		System.out.println("=====");
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
