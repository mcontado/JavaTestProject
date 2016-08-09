package test;

import java.util.Stack;

public class BalancedParenthesis {
	private static final char L_PAREN = '(';
	private static final char L_BRACE = '{';
	private static final char L_BRACKET = '[';
	private static final char R_PAREN = ')';
	private static final char R_BRACE = '}';
	private static final char R_BRACKET = ']';

	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == L_PAREN) {
				stack.push(L_PAREN);
			} else if (s.charAt(i) == L_BRACE) {
				stack.push(L_BRACE);
			} else if (s.charAt(i) == L_BRACKET) {
				stack.push(L_BRACKET);
			} else if (s.charAt(i) == R_PAREN) {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != L_PAREN)
					return false;
			} else if (s.charAt(i) == R_BRACE) {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != L_BRACE)
					return false;
			} else if (s.charAt(i) == R_BRACKET) {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != L_BRACKET)
					return false;
			}
		}

		return stack.isEmpty();
	}

	public static int isValid(String A) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < A.length(); i++) {

			char c = A.charAt(i);

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {

				if (stack.isEmpty()) {
					return 0;
				}

				char top = stack.peek();

				if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']')) {
					stack.pop();
				} else
					return 0;
			}
		}

		if (!stack.isEmpty())
			return 0;

		return 1;

	}

	public static void main(String[] args) {
		String balance = "[()]{}{[()()]()}";
		String unbal = "[(])";
		System.out.println(isValid(balance));
		System.out.println(isValid(unbal));
	}

}
