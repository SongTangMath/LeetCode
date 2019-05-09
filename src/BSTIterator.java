
import java.util.*;
public class BSTIterator {
	  List<Integer> result;
	    int cur;
	    public List<Integer> preorderTraversal(TreeNode root) {
	         List<Integer>list=new ArrayList<Integer>();
	         Stack<TreeNode>rights=new  Stack<TreeNode>();
	         TreeNode cur=root;
	         while(cur!=null||!rights.isEmpty())
	        	 {
	        	 while(cur!=null) {
	        	 list.add(cur.val);
	        	if(cur.right!=null)rights.push(cur.right);
	        	cur=cur.left;
	        	 }
	        	if(!rights.isEmpty() ) cur=rights.pop();
	        	 }
	         return list;
	    }


	    public BSTIterator(TreeNode root) {
	        result=preorderTraversal(root);
	        cur=0;
	    }
	    
	    /** @return the next smallest number */
	    public int next() {
	        int ret= result.get(cur);
	        cur++;
	        return ret;
	        
	    }
	    
	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return (cur<result.size());
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
