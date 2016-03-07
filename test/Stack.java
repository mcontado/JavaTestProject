package test;

public class Stack {
	 private Node first;        // top of stack

	    // linked list node helper data type
	    private class Node {
	        private Object item;
	        private Node next;
	    }

	    // create an empty stack
	    public Stack() {
	        first = null;
	    }

	    // is the stack empty?
	    public boolean isEmpty() {
	        return first == null;
	    }

	    // add an element to the stack
	    public void push(Object item) {
	        Node oldfirst = first;
	        first = new Node();
	        first.item = item;
	        first.next = oldfirst;
	    }

	    // delete and return the most recently added element
	    public Object pop() {
	        if (isEmpty()) throw new RuntimeException("Stack underflow");
	        Object item = first.item;      // save item to return
	        first = first.next;            // delete first node
	        return item;                   // return the saved item
	    }


	    // a test client
	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        int[] a = {12, 13, 14, 15, 16};
	        /*stack.push("1");
	        stack.push("2");
	        //System.out.println(stack.pop());
	        stack.push("3");
	        stack.push("4");*/
	       // String[] str = {"1","2","3","4"};
	        for(int arr : a) {
				stack.push(arr);
			}
	        while (!stack.isEmpty()) {
	          //  String s = (String) stack.pop();
	        	System.out.print(stack.pop() + " ");
	        }
	    }
}
