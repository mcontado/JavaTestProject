
public class FirstLastOccurences {
	public static void findOccurrences(int[] arr, int given) {
		int first = -1;
		int last = -1;
		int counter = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == given) {
				first = i;
				continue;
			}
			if (first != -1 && arr[i] == arr[first]) {
				counter++;
				last = counter;
			}
		}
		System.out.println(first + ", " + last);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,3};
		findOccurrences(arr, 6);
	}
	
	
}
