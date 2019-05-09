

public class Q106 {
	private TreeNode buildTree( int[] inorder,int[]postorder,
			int inbegin,int inend,int postbegin,int postend) {
					if(inend==inbegin)return null;
			        if(inend-inbegin==1)return new TreeNode(inorder[inbegin]);
			        int i=inbegin;
			        while(inorder[i]!=postorder[postend-1])i++;
			        //inorder[i]==preorder[prebegin]
			        //�������ڵ����=i-inbegin,�������ڵ����inend-i-1
			        //����������postorder[postbegin..postbegin+i-inbegin)
			        //����inorder[inbegin..i)
			        //����������postorder[postbegin+i-inbegin+1..postend-1)
			        //����inorder[i+1..inend)
			        TreeNode root=new TreeNode(postorder[postend-1]);
			        TreeNode left=buildTree(inorder,postorder,
			        		inbegin,i,postbegin,postbegin+i-inbegin);
			        TreeNode right=buildTree(inorder,postorder,
			        		i+1,inend,postbegin+i-inbegin,postend-1);
			        root.left=left;root.right=right;return root;
			    }
	
	  public TreeNode buildTree( int[] inorder,int[]postorder) {
	        return buildTree(inorder,postorder,0,inorder.length,0,postorder.length);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]inorder = {9,3,15,20,7},
				postorder = {9,15,7,20,3};
		TreeNode root=new Q106().buildTree(inorder, postorder);
		System.out.println();
	}

}
