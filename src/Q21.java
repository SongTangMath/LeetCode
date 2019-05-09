

public class Q21 {
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l1==null)return l2;
	        if(l2==null)return l1;
	        ListNode n1=l1,n2=l2,head,currentpos;
	        if(n1.val>=n2.val) {
	        	head=n2;n2=n2.next;currentpos=head;
	        }
	        else {
	        	head=n1;n1=n1.next;currentpos=head;
	        }
	        while(n1!=null&&n2!=null) {
	        	if(n1.val<=n2.val) {
	        		currentpos.next=n1;n1=n1.next;
	        		currentpos=currentpos.next;
	        	}
	        	else {
	        		currentpos.next=n2;n2=n2.next;
	        		currentpos=currentpos.next;
	        	}}
	        	if(n1==null)while(n2!=null) {
	        		currentpos.next=n2;n2=n2.next;
	        		currentpos=currentpos.next;
	        	}
	        	else while(n1!=null) {
	        		currentpos.next=n1;n1=n1.next;
	        		currentpos=currentpos.next;
	        	}
	        
	        return head;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);
		l1.next= new ListNode(2);
		l1.next.next= new ListNode(4);
		ListNode l2=new ListNode(1);
		l2.next= new ListNode(3);
		l2.next.next= new ListNode(4);
		new Q21().mergeTwoLists(l1, l2);
	}

}
//class ListNode {
//	     int val;
//	      ListNode next;
//	      ListNode(int x) { val = x; }
// }
