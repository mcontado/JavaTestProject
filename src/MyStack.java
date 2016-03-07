import java.util.Stack;

public class MyStack {
	private Node top;
	private int n; //number of elements in a stack
	
	private class Node {
		Node next;
		Object item;
	}
	
	public MyStack() {
		top = null;
	}
	
	//Checks if the stack is empty
	public boolean isEmpty() {
		return (top == null);
	}

	//Push data to the stack
	public void push(Object data) {
		Node node = top;
		top = new Node();
		top.item = data;
		top.next = node;
		n++;
	}
	
	//Pop data from the stack
	public Object pop() {
		if(isEmpty()) return null;
		
		Object item = top.item;
		top = top.next;
		n--;
		return item;
	}
	
	//Peek from the stack
	public Object peek() {
		if (isEmpty()) return null;
		
		return top.item;
	}
	
	//Get the size of the stack
	public int size() {
		return n;
	}
	
	public static void main(String[] args) {
		MyStack s = new MyStack();
		Stack st = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.size());  //3
		s.pop();
		System.out.println(s.size()); //2
		s.push(4);
		s.push(5);
		System.out.println(s.size()); //4
		System.out.println(s.pop());  //5
		System.out.println(s.peek()); //4
		System.out.println(s.pop());  //4
		System.out.println(s.peek()); //2
		System.out.println(s.size()); //2
		s.push(10);
		s.push(11);
		s.push(12);
		
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}

	}

}
