package array;
import java.util.*;
public class RotateArray {

	public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int i = 0; i<A.size(); i++) {
			if (i + B < A.size())
				ret.add(A.get(i + B));	
		}
		
		int limit = A.size() - ret.size();
		for (int i = 0; i < limit; i ++) {
			ret.add(A.get(i));
		}
		
		return ret;
	}
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		
		System.out.println(rotateArray(num, 0));

	}

}
