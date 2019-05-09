
import java.util.*;
public class Q109 {
	
	 public TreeNode sortedListToBST(ListNode head) {
		 List<Integer>list=new ArrayList<Integer>();
		 while(head!=null) {
			 list.add(head.val);
			 head=head.next;
		 }
	        int[]nums=new int[list.size()];
	        for(int i=0;i<list.size();i++)nums[i]=list.get(i);
	        return sortedArrayToBST(nums);
	    }
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
		//int i=Math.abs(a)
		
	}

}
