
public class ListNode {
	   int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	      public ListNode hangNext(int newval) {
	    	  if(this==null)return new ListNode(newval);
	    	  ListNode p=this;
	    	  while(p.next!=null)p=p.next;
	    	  p.next=new ListNode(newval);
	    	  return this;
	      }
}
