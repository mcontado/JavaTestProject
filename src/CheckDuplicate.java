import java.util.HashSet;
import java.util.Set;

public class CheckDuplicate {
	public static boolean isDuplicate(int[] numbers) {
		if (numbers.length == 0)
			return false;
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=i+1; j<numbers.length; j++) {
				if (numbers[i] == numbers[j])
					return true;
			}
		}
		return false;
	}
	
	public static boolean charDuplicateInString (String s) {
		if (s.length() == 0)
			return false;
		
		Set set = new HashSet();
		char[] strArray = s.toCharArray();
		for (char ch: strArray) {
			if (!set.add(ch))
				return true;
		}
		
		return false;
				
	}
	
	public static boolean isDuplicateUsingSet(int[] numbers) {
		Set set = new HashSet();
		for (int n:numbers) {
			if (set.add(n) == false) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,3};
		//System.out.println(isDuplicateUsingSet(arr));
		
		System.out.println(charDuplicateInString("mari"));

	}

}
