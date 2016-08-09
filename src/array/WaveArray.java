package array;
import java.util.*;

public class WaveArray {
	public static ArrayList<Integer> wave(ArrayList<Integer> a) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Collections.sort(a);
		
		for (int i = 0; i<a.size()-1; i+=2) {
			swap(a, i, i+1);
		}
		
		return res;
	}
	
	public static void swap(ArrayList<Integer> arr, int a, int b) {
		int temp = arr.get(a);
		arr.set(a, arr.get(b));
		arr.set(b, temp);
	}
	
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(4);
		
		//System.out.println(a);
		wave(a);
		System.out.println(a);
		
	}
}
