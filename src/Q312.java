import java.util.*;
public class Q312 {
	 public int maxCoins(int[] nums) {
		if(nums.length==0)return 0;
		if(nums.length==1)return nums[0];
		int n=nums.length;
		int [][]dp=new int[n+1][n+1];
		for(int begin=0;begin<n;begin++)
			dp[begin][begin+1]=countPoints(nums,begin);
		for(int k=2;k<=n;k++)
			//end-begin=k求dp[begin][end]
			//end=begin+k<=n,begin<=n-k
			for(int begin=0;begin<=n-k;begin++) {
				
				int end=k+begin;
				int []maxPoints=new int[k];
				for(int i=begin;i<end;i++) {
					maxPoints[i-begin]=dp[begin][i]+dp[i+1][end];
					 int left=1,right=1;
					 if(begin-1>=0)left=nums[begin-1];
					 if(end<nums.length)right=nums[end];
					 maxPoints[i-begin]+=left*nums[i]*right;
					
				}
				//dp[begin][end]应为maxPoints数组中的最大值
				dp[begin][end]=maxPoints[0];
				for(int u:maxPoints)dp[begin][end]=Math.max(dp[begin][end], u);
			}
		return dp[0][n];
	    }
	
	 private int countPoints(int[]nums,int index) {
		 int ans=nums[index];
		 int left=1,right=1;
		 if(index-1>=0)left=nums[index-1];
		 if(index+1<nums.length)right=nums[index+1];
		 return left*ans*right;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]nums= {7,9,8,0,7,1,3,5,5,2,3};
		int []nums= {3,1,5,8};
		//最佳2->1->3=6+3+3=12分
		System.out.print(new Q312().maxCoins(nums));
	}

}
