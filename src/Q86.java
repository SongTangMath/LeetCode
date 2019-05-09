

public class Q86 {
	 public ListNode partition(ListNode head, int x) {
	        ListNode newhead=null,lastlessthanx=null,
	        		previous=null,cur=null;
	        if(head==null||head.next==null)return head;
	        previous=head;cur=head.next;
	        if(head.val>=x) {
	        while(cur!=null) {
	        	if(cur.val>=x) {previous=previous.next;cur=cur.next;}
	        	else if(lastlessthanx==null) {
	        		//cur���Ϊ�µı�ͷ
	        		newhead=cur;
	        		previous.next=cur.next;
	        		newhead.next=head;
	        		lastlessthanx=newhead;
	        		cur=previous.next;
	        	}
	        	else {
	        		previous.next=cur.next;
	        		cur.next=lastlessthanx.next;
	        		lastlessthanx.next=cur;
	        		lastlessthanx=cur;
	        		cur=previous.next;
	        	}
	        }
	        if( newhead!=null)return newhead;
	        else return head;
	        }
	        else {
	        	lastlessthanx=head;
	        	 while(cur!=null) {
	 	        	if(cur.val>=x) 
	 	        	{previous=previous.next;cur=cur.next;}
	 	        	else if(previous==lastlessthanx) {
	 	        		previous=previous.next;cur=cur.next;
	 	        		lastlessthanx=previous;
	 	        	}
	 	        	
	 	        	else {
	 	        		previous.next=cur.next;
	 	        		cur.next=lastlessthanx.next;
	 	        		lastlessthanx.next=cur;
	 	        		lastlessthanx=cur;
	 	        		cur=previous.next;
	 	        	}
	 	        	
	 	        	
	 	        }
	 	        return head;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
//		head.next.next.next=new ListNode(2);
//		head.next.next.next.next=new ListNode(5);
			head=new Q86().partition(head, 4);
			while(head!=null) {System.out.println(head.val);head=head.next;}

	}

}
