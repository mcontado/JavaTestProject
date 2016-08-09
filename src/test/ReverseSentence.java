package test;
import java.util.Stack;

public class ReverseSentence {

	public static String reverseSentence(String str) {
		StringBuilder sb = new StringBuilder();
		
		String[] words = str.split("\\s+");
		
		for (int i=words.length-1; i>=0; i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
	
	//reverse using Stack
	public static void reverseUsingStack(String s) {
		Stack<String> stack = new Stack<String>();
		String[] words = s.split(" ");
		
		for (String str:words) {
			stack.push(str);
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "        Coding     is     awesome!     ";
		//System.out.println(reverseSentence(str));
		System.out.println(reverseSentence(str));
	}

}
