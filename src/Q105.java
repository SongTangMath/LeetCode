

public class Q105 {
	private TreeNode buildTree(int[] preorder, int[] inorder,
			int prebegin,int preend,int inbegin,int inend) {
					if(preend==prebegin)return null;
			        if(preend-prebegin==1)return new TreeNode(preorder[prebegin]);
			        int i=inbegin;
			        while(inorder[i]!=preorder[prebegin])i++;
			        //inorder[i]==preorder[prebegin]
			        //左子树节点个数=i-inbegin,右子树节点个数inend-i-1
			        //左子树先序preorder[prebegin+1..prebegin+i-inbegin+1)
			        //中序inorder[inbegin..i)
			        //右子树先序preorder[prebegin+i-inbegin+1..preend)
			        //中序inorder[i+1..inend)
			        TreeNode root=new TreeNode(preorder[prebegin]);
			        TreeNode left=buildTree(preorder,inorder,
			        		prebegin+1,prebegin+i-inbegin+1,inbegin,i);
			        TreeNode right=buildTree(preorder,inorder,
			        		prebegin+i-inbegin+1,preend,i+1,inend);
			        root.left=left;root.right=right;return root;
			    }
	
	  public TreeNode buildTree(int[] preorder, int[] inorder) {
	        return buildTree(preorder,inorder,0,preorder.length,0,inorder.length);
	    }


	public static void main(String[] args) {
	
		int[]preorder = {3,9,20,15,7};
				int[]inorder = { 9,3,15,20,7};
				TreeNode root=new Q105().buildTree(preorder,inorder);
				System.out.println();
				
	}

}
