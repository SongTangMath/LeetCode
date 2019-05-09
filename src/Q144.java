
import java.util.*;
public class Q144 {
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
        	if(!rights.isEmpty() )cur=rights.pop();
        	 }
         return list;
		 
	 }
	 public List<Integer> postorderTraversal(TreeNode root) {
		  List<Integer>list=new ArrayList<Integer>();
	         Stack<TreeNode>lefts=new  Stack<TreeNode>();
	         TreeNode cur=root;
	         //先构造中右左的遍历结果
	         //考虑中序遍历的代码中稍微改一下(中序:中左右)而现在我们
	         //希望中右左.因此每次有左子树则左子树根入栈
	         while(cur!=null||!lefts.isEmpty())
	        	 {
	        	 while(cur!=null) {
	        		 list.add(cur.val);
	        		 if(cur.left!=null)lefts.push(cur.left);
	        		cur=cur.right;}
	        	
	        	
	        	if(!lefts.isEmpty()) cur=lefts.pop();
	        	
	        
	        	 }
	         List<Integer>list1=new ArrayList<Integer>();
	         for(int i=list.size()-1;i>=0;i--)
	        	 list1.add(list.get(i));
	         return list1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
