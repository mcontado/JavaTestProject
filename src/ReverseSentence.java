
public class ReverseSentence {

	public static String reverseSentence(String str) {
		StringBuilder sb = new StringBuilder();
		
		String[] words = str.split(" ");
		for (int i=words.length-1; i>=0; i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "        Coding is awesome!                 ";
		System.out.println(reverseSentence(str));
	}

}
