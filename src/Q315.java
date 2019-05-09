import java.util.*;
public class Q315 {
	 public List<Integer> countSmaller(int[] nums) {
	        
	        int []ans=new int[nums.length];       
	        	
	        List<Integer> list=new ArrayList<Integer>();
	        Q315Node root=null;
	        for(int i=ans.length-1;i>=0;i--)
	        	root=insert(root,nums,ans,i,0);
	        for(int i=0;i<ans.length;i++)list.add(ans[i]);
	        return list;
	    }
	
	 public Q315Node insert(Q315Node node,int[]nums,int[]ans,int i,int preSum) {
		 //递归插入nums[i]并计算ans[i]
		 //preSum表示从根走到当前的node下一步应该往左走的那些节点dup之和
		 if(node==null) {
			 node= new Q315Node(nums[i],0);
			 ans[i]=preSum;
			 return node;
		 }
			 
		 else if(node.val==nums[i])
		 {
			 node.dup++;
			 ans[i]=preSum+node.sum;
		 }
		 else if(node.val>nums[i]) {
			 node.sum++;
			 node.left=insert(node.left,nums,ans,i,preSum);
		 }
		 else node.right=insert(node.right,nums,ans,i,preSum+node.dup+node.sum);
		 return node;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,2,6,1};
		List<Integer>list=new Q315().countSmaller(nums);
		for(int i=0;i<list.size();i++)System.out.print(list.get(i)+" ");
	}

}
class Q315Node{
	Q315Node left,right;
	int val,sum,dup;

	public Q315Node(int val, int sum) {
		super();
		this.dup=1;
		this.val = val;
		this.sum = sum;
	}
	
	
}