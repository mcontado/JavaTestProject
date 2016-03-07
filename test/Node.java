package test;

class Node{
	Node next;
	int data;
	
	public Node(int val) {
		data = val;
		next = null;
	}
	

}

class LinkedList{
	private Node head = null;
	
	public void append(int val) {
		Node newNode = new Node(val);
		
		if (head == null) {
			head = newNode;
		} else {
			Node node = head;
			
			while(node.next != null) 
				node = node.next;
			
			node.next = newNode;
		}
		/*Node lastNode = getLastNode();
		if (lastNode == null) {
			head = new Node(val);
		} else {
			lastNode.next = new Node(val);
		}*/
	}
	
	public void delete(int val) {
		if (head == null) {
			return;
		}
		
		Node prevNode = null;
		Node currNode = head;
		
		while (currNode != null && currNode.data != val) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		
		if (prevNode == null) {
			head = head.next;
			return;
		}
		
		if (currNode == null) {
			System.out.println("A node with that value does not exist");
			return;
		} 
		prevNode.next = currNode.next;
	}
	
	public void print() {
		System.out.println("");
		if (head == null) {
			System.out.println("EMPTY");
			return;
		} 
		Node node = head;

		while (node != null) {
			System.out.print(node.data + "--> ");
			node = node.next;
		}
	}
	private Node getLastNode() {
		if (head == null) {
			return null;
		}
		
		Node node = head;
		while (node.next != null) {
			node = node.next;	
		}
		
		return node;
	}
	
	
}