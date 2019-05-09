
import java.util.*;
public class Q94 {
	 public List<Integer> inorderTraversal(TreeNode root) {
		 List<Integer>list= new ArrayList<Integer>();
	       Stack<TreeNode>stack=new Stack<TreeNode>();
	       TreeNode cur=root;
	       while(cur!=null||!stack.isEmpty()) {
	    	   while(cur!=null) {
	    		   stack.push(cur);cur=cur.left;
	    	   }
	    	   cur=stack.pop();
	    	   list.add(cur.val);
	    	   cur=cur.right;
	       }
	       return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
