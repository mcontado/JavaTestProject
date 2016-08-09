package test;
import java.util.HashMap;
import java.util.Hashtable;

public class FirstNonRepeatedChar {
	public static Character findFirstNonRepChar(String s) {
		//Create character count hashmap
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//Hashtable<Character, Integer> map = new Hashtable<Character, Integer>();
		Character ch;
		String copyOfStr = s.replaceAll("\\s", "");
		char[] strArray = copyOfStr.toCharArray();
		System.out.println(strArray);
		//For each character
		for (char c:strArray) {
			//If there is value stored in character, increment by 1
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			//Else set the value to 1
			} else {
				map.put(c, 1);
				
			}
		}
		
		System.out.println(map);
		//Scan the string
		for (int i=0; i<copyOfStr.length(); i++) {
			ch = copyOfStr.charAt(i);
			//Return the character if the count in map is 1
			if (map.get(ch) == 1) {
				return ch;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(findFirstNonRepChar(" butter"));
	}

}
