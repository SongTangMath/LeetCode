
import java.util.*;
public class Q143 {
	 public void reorderList(ListNode head) {
		 if(head==null)return;
	        HashMap<Integer,ListNode>map=new HashMap<Integer,ListNode>();
	        int index=1;
	        while(head!=null) {map.put(index++, head);
	        head=head.next;
	        }
	        int n=map.size();
	        for(int i=1;i<=n/2;i++) {
	        	map.get(i).next=map.get(n+1-i);
	        	map.get(n+1-i).next=map.get(i+1);
	        }
	        
	         map.get(n/2+1).next=null;
	        //这里需要讨论一下.如果n=2k(注意我们从1开始编号)
	        //...k-1-->k+2-->k-->k+1-->null
	        //n=2k+1则k-->k+1-->null
	         //总是应该编号(n/2+1)的节点next指针为null
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node=new ListNode(1);
		node.hangNext(2).hangNext(3).hangNext(4)		.hangNext(5);
		ListNode p=node;
		new Q143().reorderList(node);
		while(p!=null) {
			System.out.print(p.val+" ");
			p=p.next;
		}
	}

}
