package linkedlist;




public class ReverseLinkedList2 {
	
	
	
	public static ListNode reverseBetween(ListNode a, int m, int n) {
		if (m == n) return a;
		
		ListNode prev = null;
		ListNode first = new ListNode(0);
		ListNode second = new ListNode(0);
		
		int i = 0;
		ListNode node = a;
		
		while (node != null) {
			i++;
			
			if (i == m-1) {
				prev = node;
			}
			
			if (i == m) {
				first.next = node;
			}
			
			if (i == n) {
				second.next = node.next;
				node.next = null;
			}
			
			node = node.next;
		}
		
		if (first.next == null) {
			return a;
		}
		
		//reverse list [m,n]
		ListNode p1 = first.next;
		ListNode p2 = p1.next;
		p1.next = second.next;
		
		
		while (p1 != null && p2 != null) {
			ListNode temp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = temp;
		}
		
		if (prev != null) {
			prev.next = p1;
		} else {
			return p1;
		}
		
		return a;
	}
	
	
	
	@Override
	public String toString() {
		return "ReverseLinkedList2 [toString()=" + super.toString() + "]";
	}



	public static void main(String [] args) {
		ListNode n = new ListNode(1);

		System.out.println(n.val);
		n.next = new ListNode(2);
		System.out.println(n.next.val);
		n.next.next = new ListNode(3);
		System.out.println(n.next.next.val);
		n.next.next.next = new ListNode(4);
		System.out.println(n.next.next.next.val);
		
		System.out.println(reverseBetween(n, 2, 4));
	}

}
