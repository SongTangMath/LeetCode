
import java.util.*;
public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> totalList=new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        int count=1;queue.add(root);
        while(!queue.isEmpty()) {
        	for(int i=0;i<count;i++) {
        		if(queue.get(i).left!=null)queue.add(queue.get(i).left);
        		if(queue.get(i).right!=null)queue.add(queue.get(i).right);
        	}
        	List<Integer>list=new ArrayList<Integer>();
        	for(int i=0;i<count;i++) {
        		TreeNode temp=queue.removeFirst();
        		list.add(temp.val);
        	}
        	totalList.add(list);
        	count=queue.size();
        }
        return totalList;
    }
}
