package stacksqueues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        Stack<Character> stack = new Stack<Character>();
       
        boolean isBalanced = true;
        
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            
            for (int i = 0; i<s.length(); i++) {
                char c = s.charAt(i);
                
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    
                	if (stack.isEmpty()) {
                		isBalanced = false;
    					break;
    				}

                    char top = stack.peek();
                    
                    if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']')) {
                        stack.pop();
                    } else {
                    	isBalanced = false;
                        break;
                    }
                    
                }
            }
            
            if (!isBalanced) {
                System.out.println("NO");
                stack.clear();
                isBalanced = true;
            } else {
                System.out.println("YES");
                isBalanced = true;
            }
            
            
        }

	}

}
