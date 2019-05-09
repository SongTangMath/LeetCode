
import java.util.*;
public class Q95 {
	  public List<TreeNode> generateTrees(int n) {
		 
		 return generateTrees(1,n+1);
	    }
	  private List<TreeNode> generateTrees(int begin,int end) {
		  List<TreeNode> list=new ArrayList<TreeNode>();
		  if(begin>=end) {list.add(null);return list;}
		  for(int i=begin;i<end;i++) {
			  
			  for(TreeNode left:generateTrees(begin,i)) 
				  for(TreeNode right:generateTrees(i+1,end)) {
					  TreeNode temp=new TreeNode(i);
					  temp.left=left;temp.right=right;
					  list.add(temp);
				  }
			  
		  }
		  return list;
	    }
	  public static String preorderTraversal(TreeNode root) {
		  if(root==null) return "null";
	       String left=preorderTraversal(root.left);
	       String right=preorderTraversal(root.right);
	       return root.val+","+left+","+right;

		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TreeNode> list=new Q95().generateTrees(3);
		System.out.println(list.size());
		for(TreeNode temp:list)
			System.out.println(preorderTraversal(temp));
	}

}
