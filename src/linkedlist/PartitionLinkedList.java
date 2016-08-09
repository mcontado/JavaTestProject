package linkedlist;



public class PartitionLinkedList {
	
	public ListNode partition(ListNode A, int B) {
		 	ListNode lessPrev = null;
		    ListNode greaterPrev = null;
		    ListNode head = A;
		    ListNode greaterHead = null;
		    
		    while (A != null) {
		        if (A.val < B) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
