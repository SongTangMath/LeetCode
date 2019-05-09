

public class Q92 {
	 public ListNode reverseBetween(ListNode head, int m, int n) {
	      if(m==n)return head;
	      else if(m==1) {
	    	  ListNode newhead=head,p=head.next;
	    	  for(int i=1;i<n;i++) {
	    		  head.next=p.next;
	    		  p.next=newhead;
	    		  newhead=p;p=head.next;
	    	  }
	    	  return newhead;
	      }
	      ListNode previous=head,newhead,p;
	      //previous应该指向第m-1个节点,循环次数为m-2
	      for(int i=0;i<m-2;i++)previous=previous.next;
	      newhead=previous.next;p=newhead.next;
	      for(int i=0;i<n-m;i++) {
	    	  newhead.next=p.next;
	    	  p.next=previous.next;
	    	  previous.next=p;
	    	   ;p=newhead.next;
	      }
	      return head;
	      
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		head=new Q92().reverseBetween(head,2,4		);
		ListNode p=head;
		while(p!=null) {System.out.print(p.val);p=p.next;}
		System.out.print(Integer.parseInt("012"));
	}

}
