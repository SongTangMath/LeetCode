
import java.util.*;
public class Q98 {
	 private List<Integer> inorderTraversal(TreeNode root) {
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
	 public boolean isValidBST(TreeNode root) {
		 List<Integer>list=inorderTraversal(root);
		 for(int i=0;i<list.size()-1;i++)
			 if(list.get(i)>=list.get(i+1))return false;
		 return true;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
