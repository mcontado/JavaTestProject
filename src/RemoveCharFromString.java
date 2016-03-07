
public class RemoveCharFromString {
	
	public static String remove(String word, char removeThis) {
		String newWord = "";
		
		if (word.length() == 0 || word == null) {
			return null;
		} 
		
		char[] strArray = word.toCharArray();
		for (char c:strArray) {
			if (c == removeThis) {
				int index = word.indexOf(c);
				newWord = word.substring(0, index) + word.substring(index+1, word.length());
				//System.out.print(newWord);
			}
			
			
		}
		return newWord;
	}

	public static void main(String[] args) {
		String word = "ebay";
		System.out.println(remove(word, 'y'));

	}

}
