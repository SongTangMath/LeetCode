public class Q82 {
public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode newhead;
        ListNode previous,cur;
        //下面来查找新的表头(可能不存在)
        if(head.val!=head.next.val)newhead=head;
        else { previous=head;cur=head.next;
        while(cur!=null&&((cur.next!=null&&cur.next.val==cur.val)||cur.val==previous.val)) {
        	cur=cur.next;previous=previous.next;}
        	if(cur==null)return null;
        	else
         newhead=cur;}
        if(newhead.next==null)return newhead;
        
        ListNode test=newhead.next;
        ListNode newtail=newhead;
        while(test!=null) {
        	if(test.next!=null&&test.val==test.next.val) {
        		int temp=test.val;
        		while(test!=null&&test.val==temp)test=test.next;
        		newtail.next=test;
        	}
        	else {
        		newtail=test;test=test.next;
        	}
        	
        		
        }
        
        return newhead;
        
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(2);
//		head.next.next.next=new ListNode(2);
//		head.next.next.next.next=new ListNode(3);
		head=new Q82().deleteDuplicates(head);
		ListNode p=head;
		while(p!=null) {System.out.print(p.val);p=p.next;}

	}

}
