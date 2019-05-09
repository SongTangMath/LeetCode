

public class Q124 {
private int maxval=Integer.MIN_VALUE;
private int maxDownSum(TreeNode root) {
	if(root==null)return 0;
	int left=Math.max(maxDownSum(root.left), 0);
	int right=Math.max(maxDownSum(root.right), 0);
	if(left+root.val+right>maxval)
		maxval=left+root.val+right;
	return root.val+Math.max(left, right);
}
public int maxPathSum(TreeNode root) {
	maxval=Integer.MIN_VALUE;
	maxDownSum(root);
	return maxval;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
