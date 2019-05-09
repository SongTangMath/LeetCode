

public class Q129 {
	int totalSum=0;
	 public int sumNumbers(TreeNode root) {
		 totalSum=0;
		 if(root==null)return 0;
		 recursiveSum(root,0);
		 return totalSum;
	    }
	 private void recursiveSum(TreeNode n,int sum) {
		 if(n.left!=null)recursiveSum(n.left,sum*10+n.val);
		 if(n.right!=null)recursiveSum(n.right,sum*10+n.val);
		 if(n.left==null&&n.right==null)totalSum+=(sum*10+n.val);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		root.right=new TreeNode(0);
		root.left=new TreeNode(9);
		root.left.left=new TreeNode(5);
		root.left.right=new TreeNode(1);
//		TreeNode root=new TreeNode(1);
//		root.left=new TreeNode(0);
		//List<String>list=new Q129().traverse(root);
		//for(String temp:list)System.out.println(temp);
		System.out.println(new Q129().sumNumbers(root));
	}

}
