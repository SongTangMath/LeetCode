

import java.util.Arrays;

public class Q108 {
	  public TreeNode sortedArrayToBST(int[] nums) {
		  //Arrays.sort(nums);
	        return sortedArrayToBST(nums,0,nums.length);
	    }
	  private TreeNode sortedArrayToBST(int[] nums,int begin,int end) {
		  if(begin==end)return null;
		  if(begin==end-1)return new TreeNode(nums[begin]);
		  int index=(begin+end)/2;
		  TreeNode root=new TreeNode(nums[index]);
		  TreeNode left=sortedArrayToBST(nums,begin,index);
		  TreeNode right=sortedArrayToBST(nums,index+1,end);
		  root.left=left;root.right=right;return root;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {-10,-3,0,5,9};
		TreeNode root=new Q108().sortedArrayToBST(nums);
		System.out.println(1);
	}

}
