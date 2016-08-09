package test;
import java.util.Stack;

public class MyLinkedList {
	private Node head;
	
	public static class Node {
		
		int item;
		Node next;
		
		public Node(int data) {
			item = data;
			//next = null;
		}

		@Override
		public String toString() {
			return "Node [next=" + next + ", item=" + item + "]";
		}
		
		
	}

	public MyLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void append(int data) {
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
				System.out.print(node.item + "->");
				node = node.next;
				if (node == null) {
					System.out.println("null");
				}
			}			
		} else {
			System.out.println("Empty list");
		}
	}
	
	public void delete(int data) {
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
	
	public Node detectCycle(Node a) {
		
		Node slow = head;
		Node fast = head;
		
		while (true) {
			if (slow.next != null) {
				slow = slow.next;
			} else {
				return null;
			}
			
			if (fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
			} else {
				return null;
			}
			
			if (slow == fast) {
				fast  = a;
				while ( fast != slow) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
			
		}
		
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
		
		//if we need to start at 0 from the last, then i should be less than (len-n-1)
		for (int i=0; i<len-n; i++) {
			node = node.next;
		}
		
		System.out.println(node.item);
		
	}
	/*
	 *Given a linked list, remove the nth node from the end of list and return its head.

		For example,
		Given linked list: 1->2->3->4->5, and n = 2.
		After removing the second node from the end, the linked list becomes 1->2->3->5.
	 * */
	
	public static Node removeNthFromEnd(Node a, int b) {
		if (a == null) 
			return null;
		
		//get length of the list
		Node node = a;
		int len = 0;
		while (node != null) {
			node = node.next;
			len++;
		}
		
		//Assign back to the beginning of the node
		node = a;
		
		int fromStart = len-b+1;
		//if only the one last node or b is greater than length of the nodes (as per requirement)
		if (fromStart == 1 || b > len) {
			node = node.next;
			return node;
		}
		
		int i = 0;
		
		while (node != null) {
			i++;
			if (i == fromStart-1) {
				node.next = node.next.next;
			}
			
			node = node.next;
		}
		
		return a;
		
	}
	
	//
	//Problem: Write a program to find the node at which the intersection of two singly linked lists begins.
	/*Constraints:
	 * If the two linked lists have no intersection at all, return null.
		The linked lists must retain their original structure after the function returns.
		You may assume there are no cycles anywhere in the entire linked structure.
		Your code should preferably run in O(n) time and use only O(1) memory.
	 * */
	//Algorithm:
	/*
	 This approach is the most efficient approach and utilizes a little brain power and a little maths trick, 
	 which can really give us a fast solution to the problem. The steps involved are:-

		1. Find the length of both the lists. Let ‘m’ be the length of List 1 and ‘n’ be the length of List 2.
		2. Find the difference in length of both the lists. d = m – n
		3. Move ahead ‘d’ steps in the longer list.
		4. This means that we have reached a point after which, both of the lists have same number of 
			nodes till the end.
		5. Now move ahead in both the lists in parallel, till the ‘NEXT’ of both the lists is not the same.
		6. The NEXT at which both the lists are same is the merging point of both the lists.
	 * */
	public static Node getIntersectionNode(Node head1, Node head2) {
	   //get the count of the list
		int lenHead1 = getCount(head1);
		int lenHead2 = getCount(head2);

		//to store the merge point
		Node mergePoint = null;
		
		//find the value of diff based on the longer list
		int diff = (lenHead1 > lenHead2) ? lenHead1 - lenHead2 : lenHead2 - lenHead1;
		
		//traverse through the longer list for 'diff' steps
		if (lenHead1 > lenHead2) {
			while (diff > 0) {
				diff--;
				head1 = head1.next;
				
			}
		} else {
			while (diff > 0) {
				diff--;
				head2 = head2.next;
			}
		}
		
		//now both lists have equal nodes till the end
		while (head1 != null & head2 != null) {
			if (head1.next == head2.next) {
				mergePoint = head1.next;
				break;
			}
			
			head1 = head1.next;
			head2 = head2.next;
		}
		
		return mergePoint;
		
	}
	
	//helper function to get the count of the list
	public static int getCount(Node a) {
		int count = 0;
		while (a != null) {
			a = a.next;
			count++;
		}
		return count;
	}
	
	
	public boolean linkedListIsPalindrome() {
		Node node = head;
		
		Stack<Integer> stack = new Stack<Integer>();
		
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
	/*
	 * You are given two linked lists representing two non-negative numbers. 
	 * The digits are stored in reverse order and each of their nodes contain a single digit. 
	 * Add the two numbers and return it as a linked list.
	 * 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	 * Output: 7 -> 0 -> 8
	 * */
	public static Node addTwoNumbers(Node l1, Node l2) {
		Node dummyHead = new Node(0);
		Node p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		
		while(p!=null || q!=null) {
			int x = (p != null) ? (int) p.item : 0;
			int y = (q != null) ? (int) q.item : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new Node(sum % 10);
			curr = curr.next;
			
			if (p!=null) p = p.next;
			if (q!=null) q = q.next;
		} //end of while
		
		if (carry > 0) 
			curr.next = new Node(carry);
		
		return dummyHead.next;
	}
	
	//Given a singly linked list of 0s and 1s find its decimal equivalent
		// Example:
		//  Input  : 0->0->0->1->1->0->0->1->0
		//  Output : 50
	public static long binaryToDecimalOfLinkedList(Node node) {
			long decimal = 0;
			int power = 0;
			boolean inBinaryFormat = true;
			
			Stack<Integer> stack = new Stack<Integer>();
			
			while(node!=null) {
				if(node.item == 1 || node.item == 0) {
					stack.push(node.item);
					node = node.next;
				} else {
					System.out.println("Linked List is not in binary format");
					inBinaryFormat = false;
					break;
				}
			}
			
			if (inBinaryFormat) {
				while (!stack.isEmpty()) {
					if (stack.pop().equals(1)) {
						decimal += Math.pow(2, power);
					}
					power++;
				}			
			} 
			
			return decimal;
		}
	
	
	
	//Merge two sorted list
	public static Node mergeTwoList(Node A, Node B) {
	    
	    if (A == null)
	        return B;
	        
	    if (B == null)
	        return A;
	        
	    Node head;
	    Node node = new Node(0);
	    head = node;
	        
	    while (A != null && B != null) {
	        
	        if (A.item <= B.item) {
	            node.next = A;
	            A = A.next;
	            node = node.next;
	        } else {
	            node.next = B;
	            B = B.next;
	            node = node.next;
	        }
	    }
	    
	    if (A == null)
	        node.next = B;
	    else
	        node.next = A;
	    
	    head = head.next;
	    
	    return head;
	    
	}
	
	/*
	 Given a linked list and a value x, partition it such that all nodes less than x come
	  before nodes greater than or equal to x.
		
	You should preserve the original relative order of the nodes in each of the two partitions.

	For example, given 1->4->3->2->5->2 and x = 3, return 1->2->2->4->3->5.
	*/
	
	public static Node partition(Node A, int B) {
		Node lessPrev = null;
		Node greaterPrev = null;
		Node head = A;
		Node greaterHead = null;
	    
	    while (A != null) {
	        if (A.item < B) {
	            if (lessPrev != null) {
	                lessPrev.next = A;
	                lessPrev = A;
	            } else {
	                lessPrev = A;
	                head = A;
	            }
	        } else {
	            
	            if (greaterPrev != null) {
	                greaterPrev.next = A;
	                greaterPrev = A;
	            } else {
	                greaterPrev = A;
	                greaterHead = A;
	            }
	            
	        }
	        
	        A = A.next;
	    }
	    
	    if (greaterPrev != null)
	        greaterPrev.next = null;
	    
	    if (lessPrev != null) {
	        lessPrev.next = greaterHead;
	    }
	    
	    return head;
    }
	
	
	public static Node insertNth(Node head, int data, int position) {
		Node newNode = new Node(data);
		
		if (head == null) {
			newNode.next = null;
			head = newNode;
			return head;
		}
	       
		
	    if (position == 0) {
	    	newNode.next = head.next;
	    	head = newNode;
	    	return head;
	    }
	       

	    // strict checking as my habit
	    if (position < 0)
	        return null;

	    Node root = head;
	    
	    while (root.next != null && --position > 0) {
	    	root = root.next;
	    }
	        
	    newNode.next = root.next;
	    root.next = newNode;
	  
	    return head;
				
	}
	
	
	public static void main(String[] args) {
//		MyLinkedList list = new MyLinkedList();
//		list.append(5);
//		list.append(8);
//		list.append(20);
//		
//		MyLinkedList list2 = new MyLinkedList();
//		list2.append(4);
//		list2.append(11);
//		list2.append(15);
//		
//		
//		list.traverse();
//		list2.traverse();
//		
//		MyLinkedList result = new MyLinkedList();
//		result.head = mergeTwoList(list.head, list2.head);
//		
//		result.traverse();
		
		//Partitioning test
//		MyLinkedList list = new MyLinkedList();
//		list.append(1);
//		list.append(4);
//		list.append(3);
//		list.append(2);
//		list.append(5);
//		list.append(2);
//		
//		list.traverse();
//		
//		MyLinkedList res = new MyLinkedList();
//		res.head = partition(list.head, 3);
//		
//		res.traverse();
		
		
		
		MyLinkedList list = new MyLinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.traverse();
		removeNthFromEnd(list.head, 6);
		
		list.traverse();
		
		
		
	}

}
