

public class Q61 {
	 public ListNode rotateRight(ListNode head, int k) {
	        if(head==null||head.next==null)return head;
	        int count=1;
	        ListNode p=head;
	        while(p.next!=null) {count++;p=p.next;}
	        k=k% count;
	        if(k==0)return head;
	        
	        ListNode newHead=head.next;
	        ListNode newTail=head;
	        for(int i=1;i<count-k;i++) {
	        	newHead=newHead.next;
	        	newTail=newTail.next;
	        }
	        p.next=head;
	        newTail.next=null;
	        return newHead;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
			head=new Q61().rotateRight(head, 1);
			while(head!=null) {System.out.println(head.val);head=head.next;}
	}

}
