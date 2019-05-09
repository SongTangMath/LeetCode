

public class Q19 {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 int count=1;
		 ListNode n1=head,n2=head;
		 while(n2.next!=null) {
			 if(count>=n+1) {
				 n1=n1.next;
				 n2=n2.next;
				 count++;
			 }
			 else {
				 n2=n2.next;
				 count++;
			 }
		 }
		 if(count>=n+1) {
			 n1.next=n1.next.next;
			 return head;
		 }
		 else return head.next;
		 
		
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

