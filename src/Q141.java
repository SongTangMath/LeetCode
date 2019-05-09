
import java.util.*;
public class Q141 {
public boolean hasCycle(ListNode head) {
        HashSet<ListNode>set=new  HashSet<ListNode>();
       
       while(head!=null) {
    	   if(!set.contains(head)) {
    		   set.add(head);
    		   head=head.next;
    	   }
    	   else return true;
    	   
       }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
