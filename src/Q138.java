
import java.util.*;
public class Q138 {
public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null)return null;
        RandomListNode newHead=new RandomListNode(head.label);
        RandomListNode newTail=newHead,tail=head;
        HashMap<Integer, RandomListNode> map=
        		new HashMap<Integer, RandomListNode>();
        map.put(newHead.label,newHead);
        while(tail.next!=null) {
        	tail=tail.next;
        	newTail.next=new RandomListNode(tail.label);
        	newTail=newTail.next;
        	map.put(newTail.label, newTail);
        }
        newTail=newHead;tail=head;
        while(tail!=null) {
        	if(tail.random!=null)
        	newTail.random=map.get(tail.random.label);
        	tail=tail.next;
        	newTail=newTail.next;
        }
        return newHead;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
