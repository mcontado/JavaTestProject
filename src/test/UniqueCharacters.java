package test;
import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static boolean isUnique(String str) {
		//HashSet set = new HashSet();
		Set<Character> set = new HashSet<Character>();
 		for (int i=0;  i<str.length(); i++) {
			if (!set.add(str.charAt(i)))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "abcdea";
		System.out.println(isUnique(s));

	}

}
