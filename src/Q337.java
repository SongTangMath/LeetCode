import java.util.*;
public class Q337 {
		public int rob(TreeNode root) {
			int[] ans=robRecursive(root);
			return Math.max(ans[0], ans[1]);
    }
		public int[] robRecursive(TreeNode root)
		{
			
			int[] ans=new int[2];
			if(root==null)return ans;
			ans[0]=root.val;ans[1]=0;
			int[]left=robRecursive(root.left);
			int[]right=robRecursive(root.right);
			ans[0]+=left[1];
			ans[0]+=right[1];
			ans[1]+=Math.max(left[0], left[1]);
			ans[1]+=Math.max(right[0], right[1]);
			return ans;

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
