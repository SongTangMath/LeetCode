
import java.util.*;
public class Q116 {
	
	 public void connect(TreeLinkNode root) {
		 LinkedList<TreeLinkNode > queue=new LinkedList<TreeLinkNode >();
		    int count=1;queue.add(root);
		    while(!queue.isEmpty()) {
		    	for(int i=0;i<count;i++) {
		    		if(queue.get(i).left!=null)queue.add(queue.get(i).left);
		    		if(queue.get(i).right!=null)queue.add(queue.get(i).right);
		    	}
		    	for(int i=0;i<count-1;i++) 
		    		queue.poll().next=queue.peek();
		    	queue.poll();
		    	count=queue.size();
			 
		 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
