package test;
import java.util.Stack;

public class ReverseString {

	public static String reverseStringRecursive(String str) {
		//base case
		if (str.length() < 2) return str;
		
		//recursive case
		return reverseStringRecursive(str.substring(1)) + str.charAt(0);
	}
	
	public static String reverseStringIte(String str) {
		
		
		//StringBuffer sb = new StringBuffer();
		String reverse="";
		for (int i=str.length()-1; i>=0; i--) {
			//sb.append(str.charAt(i));
			reverse += str.charAt(i);
		}
		//return sb.toString();
		return reverse;
	}
	
	//Reverse String using Stack
	public static void reverseStringStack(String str) {
		Stack<Character> stack = new Stack<Character>();
		char[] strArr = str.toCharArray();
		for (char c:strArr) {
			stack.push(c);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(reverseStringIte("delrio"));
		reverseStringStack("maria");
	}

}
