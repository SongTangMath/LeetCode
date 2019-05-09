
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
	        //������Ҫ����һ��.���n=2k(ע�����Ǵ�1��ʼ���)
	        //...k-1-->k+2-->k-->k+1-->null
	        //n=2k+1��k-->k+1-->null
	         //����Ӧ�ñ��(n/2+1)�Ľڵ�nextָ��Ϊnull
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
