
import java.util.*;
public class Q23 {
	 public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode>queue=new PriorityQueue<ListNode>((a,b)->a.val-b.val);
		for(ListNode temp:lists)
			{
				if(temp!=null)queue.add(temp);
			}
		ListNode head=new ListNode(0);
		ListNode tail=head;
		while(!queue.isEmpty()) {
			ListNode temp=queue.poll();
			tail.next=temp;
			tail=tail.next;
			if(temp.next!=null)queue.add(temp.next);
		}
	        return head.next;
	    }
	 public ListNode reverse(ListNode head) {
		 if(head==null||head.next==null)return head;
		 ListNode p1=head,p2=head,p3=head.next;
		 while(p3.next!=null) {
			 p2.next=p3.next;p3.next=p1;p1=p3;p3=p2.next;
		 }
		 p3.next=p1;p2.next=null;return p3;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		head=new Q23().reverse(head);
		ListNode p=head;
		while(p!=null) {System.out.print(p.val);p=p.next;}
	}

}
