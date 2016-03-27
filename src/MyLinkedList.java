import java.util.Stack;

public class MyLinkedList {
	private Node head;
	
	public static class Node {
		Node next;
		Object item;
		
		public Node(Object data) {
			item = data;
			next = null;
		}
	}

	public MyLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void append(Object data) {
		Node newNode = new Node(data);
		
		
		if (isEmpty()) {
			head = newNode;
		} else {
			Node node = head;
			
			while (node.next != null) {
				node = node.next;
			}	
			node.next = newNode;
		}
	}
	
	//traverse through the list
	public void traverse() {
		if (!isEmpty()) {
			Node node = head;
			
			while (node != null) {
				System.out.println(node.item + " ");
				node = node.next;
			}			
		} else {
			System.out.println("Empty list");
		}
	}
	
	public void delete(Object data) {
		Node prev = null;
		Node curr = head;
		
		if (isEmpty()) {
			System.out.println("No items on the list");
			return;
		}
		
		while (curr != null && curr.item != data) {
			prev = curr;
			curr = curr.next;
		}
		
		if (prev == null) {
			head = head.next;
		}
		
		if (curr == null) {
			return;
		}
		
		prev.next = curr.next;
		
		
	}
	
	public boolean isCyclic() {
		Node fast = head;
		Node slow = head;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if (fast == slow)
				return true;
			
		}
		return false;
		
		
	}
	
	public Node reverseLinkedList() {
		Node currentNode = head;
		Node prevNode = null;
		Node nextNode;
		
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		
		return prevNode;
	}
	
	public void printNthNodeFromLast(int n) {
		
		Node node = head;
		int len = 0;
		
		while (node != null) {
			node = node.next;
			len++;
		}
		
		if (len < n) 
			return;
		
		node = head;
		
		for (int i=1; i<len-n+1; i++) {
			node = node.next;
		}
		
		System.out.println(node.item);
		
	}
	
	
	public boolean linkedListIsPalindrome() {
		Node node = head;
		
		Stack<Object> stack = new Stack<Object>();
		
		while(node != null) {
			stack.push(node.item);
			node = node.next;
		}
		
		node = head;
		while (node != null) {
			if (node.item == stack.pop()) {
				node = node.next;
			} else {
				return false;
			}
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.append("R");
		list.append("A");
		list.append("D");
		list.append("A");
		list.append("R");
		list.append("S");
		//list.traverse();
		System.out.println(list.linkedListIsPalindrome());
		//list.printNthNodeFromLast(4);
		
	}

}
