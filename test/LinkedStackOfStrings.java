package test;

public class LinkedStackOfStrings {
		private int N;          // size of the stack
	    private Node first;     // top of stack

	    // helper Node class
	    private class Node {
	        private String item;
	        private Node next;
	    }

	    // is the stack empty?
	    public boolean isEmpty() { return first == null; }

	    // number of elements on the stack
	    public int size() { return N; }


	    // add an element to the stack
	    public void push(String item) {
	        Node oldfirst = first;
	        first = new Node();
	        first.item = item;
	        first.next = oldfirst;
	        N++;
	    }

	    // delete and return the most recently added element
	    public String pop() {
	        if (isEmpty()) throw new RuntimeException("Stack underflow");
	        String item = first.item;      // save item to return
	        first = first.next;            // delete first node
	        N--;
	        return item;                   // return the saved item
	    }
	    
	    public String toString() { 
	    	   String s = ""; 
	    	   for (Node x = first; x != null; x = x.next) 
	    	      s += x.item + " "; 
	    	   return s; 
	    } 


	    // test client
	    public static void main(String[] args) {
	        LinkedStackOfStrings s = new LinkedStackOfStrings();
	        s.push("maria");
	        s.push("teresa");
	        s.push("delrio");
	        s.push("contado");
	        while (!s.isEmpty()) {
	        	 System.out.print(s.pop() + " ");	  	       
	        }
	        
	       
	    } 

}
