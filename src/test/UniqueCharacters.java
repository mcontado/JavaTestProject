package test;
import java.util.HashSet;

public class UniqueCharacters {

	public static boolean isUnique(String str) {
		HashSet set = new HashSet();
		for (int i=0; i<str.length(); i++) {
			if (!set.add(str.charAt(i)))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "madam";
		System.out.println(isUnique(s));

	}

}
