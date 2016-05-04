package collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveFromArrayList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println("The array list contains: " + numbers);
		
		numbers.remove(1);
		
		System.out.println("The array list now-->: " + numbers);
		
	}

}
