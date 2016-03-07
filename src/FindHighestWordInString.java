import java.util.HashMap;
import java.util.Map.Entry;

public class FindHighestWordInString {
	public static void findHighestWord(String input) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] strArray = input.split(" ");
		
		for (String s: strArray) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		
		String tmpKey = "";
		int tmpVal = 0;
		
		Entry<String, Integer> maxEntry = null;
		
		for (Entry<String, Integer> entry: map.entrySet()) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
			
		}
		System.out.println(maxEntry);
		
	}
	public static void main(String[] args) {
		findHighestWord("the fox jumps over the dog");
		
	}
}
