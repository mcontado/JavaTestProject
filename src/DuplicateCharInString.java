import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {
	
	
/*First, we convert the given string to char array. 
 * We then create one HashMap with Character as a key and it’s number of occurrences as a value. 
 * Then we extract a Set containing all keys of this HashMap using keySet() method. 
 * Then we use this keySet to get the duplicate characters i.e characters which have appeared more than once in the given string.*/
	
	public static void duplicateCharCount(String s) {
		//Create a HashMap with Character as key and number of occurrences as value
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
		//Convert the given string to char array
		char[] strArray = s.toCharArray();
     
		//checking each char of strArray
		for (char c:strArray) {
			//if char is present in map, increment its count by 1
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			//else put this char to map with 1 as value
			} else {
				map.put(c, 1);
			}
		}
		//Old way of iterating through the Map
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			Map.Entry entry = (java.util.Map.Entry) it.next();
//			System.out.println("Key: " + entry.getKey() + " || " + entry.getValue());
//		}
		//new way in Java 8
		//map.forEach((k,v)->System.out.println("key: " + k + " || value: " + v));
			
		//Iterating over keys only
//		for (Character key: map.keySet()) {
//			System.out.println("Key: " + key);
//		}
		
		//Iterating over values only
//		for (Integer val: map.values()) {
//			System.out.println("Value: " + val);
//		}
		
		//keySet() - returns a set view of keys contained in the map
		for (char c:map.keySet()) {
			if (map.get(c) > 1) {
				System.out.println(c + ":"+ map.get(c));
			}
		}
		
	} 
	
	
	public static void main(String[] args) {
		duplicateCharCount("better butter");

	}

}
