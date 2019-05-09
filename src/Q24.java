
import java.util.*;


public class Q24 {
	  public ListNode swapPairs(ListNode head) {
		  if(head==null||head.next==null)return head;//��0��1���ڵ�
		  ListNode newHead=head.next; 
		  //һ��ֻ��2���ڵ�����
		  if(head.next.next==null) {
		  head.next=null;newHead.next=head;return newHead;
		  }
		  //������3���ڵ�.�Ȱ�ǰ��2����һ��
		  head.next=newHead.next;
		  newHead.next=head;
		  ListNode p3=head,p1=p3.next,p2=p1.next;
		  
		 while(p2!=null&&p2.next!=null&&p2.next.next!=null) {
			 p3.next=p2;p1.next=p2.next;p2.next=p1;
			 p3=p1;p1=p3.next;p2=p1.next;
		 }
		 if(p2==null)return newHead;
		 if(p2!=null&&p2.next==null) {
			 p3.next=p2;p2.next=p1;p1.next=null;return newHead;
		 }
		 p3.next=p2;p1.next=p2.next;p2.next=p1;
		  return newHead;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String test="ascji";
			test.indexOf("");
			List<Integer> list=new ArrayList<Integer>();
			List<Integer> list1=new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list1.add(2);
			list1.add(1);
			System.out.println(list.equals(list1));
	}

}

