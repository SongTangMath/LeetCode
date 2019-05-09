import java.util.*;
public class Q363 {
	public int maxSumSubmatrix(int[][] matrix, int k) {
		int n=matrix.length,m=matrix[0].length;
		if(n>m) {
			
			int[][] matrix1=new int[m][n];
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					matrix1[i][j]=matrix[j][i];
			return maxSumSubmatrix(matrix1);
		}
		List<Integer>list=new ArrayList<Integer>();
		 for(int i=0;i<n;i++)
	        {	int[]nums=new int[m];
	        	for(int j=i;j<n;j++)
	        {
	        	for(int t=0;t<m;t++)
	        		nums[t]+=matrix[j][t];
	        	Integer maxEnd=maxSubArray(nums,k);
	        	if(maxEnd!=null)list.add(maxEnd);
	        }
	        }
	        if(!list.isEmpty())return Collections.max(list);
	        else return Integer.MIN_VALUE;
	}
public int maxSumSubmatrix(int[][] matrix) {
	int n=matrix.length,m=matrix[0].length;
	if(n>m) {
		
		int[][] matrix1=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				matrix1[i][j]=matrix[j][i];
		return maxSumSubmatrix(matrix1);
	}
        int[][]ans=maxSumWithUpperRight(matrix);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        	for(int j=0;j<m;j++)
        		max=Math.max(max, ans[i][j]);
        return max;
        
    }


public int[][] maxSumWithUpperRight(int[][] matrix) {
	int n=matrix.length,m=matrix[0].length;
        //O(n^2m)
        int[][]ans=new int[n][m];
        for(int i=0;i<n;i++)
        {	int[]nums=new int[m];
        	for(int k=i;k<n;k++)
        {
        	for(int j=0;j<m;j++)
        		nums[j]+=matrix[k][j];
        	int[]maxEndWith=maxSubArray(nums);
        	for(int j=0;j<m;j++)
        		ans[i][j]=maxEndWith[j];
        }
        }
        return ans;
    }
	public int[] maxSubArray(int[] nums) {
    int []maxEndWith=new int[nums.length];
   maxEndWith[0]=nums[0];
   for(int i=1;i<nums.length;i++) {
   	if(maxEndWith[i-1]<=0)maxEndWith[i]=nums[i];
   	else maxEndWith[i]=maxEndWith[i-1]+nums[i];
   }
  return maxEndWith;
	}

	public Integer maxSubArray(int[] nums,int k) {
		if(nums==null||nums.length==0)return null;
		int n=nums.length;
		int[]preSum=new int[n];
		preSum[0]=nums[0];
		for(int i=1;i<n;i++)preSum[i]=preSum[i-1]+nums[i];
		TreeSet<Integer>set=new TreeSet<Integer>();
		List<Integer>list=new ArrayList<Integer>();
		set.add(0);
		for(int i=0;i<n;i++)
		{
			//preSum-lowerBound<=k,lowerBound>=preSum[i]-k
			Integer lowerBound=set.ceiling(preSum[i]-k);
			if(lowerBound!=null)list.add(preSum[i]-lowerBound);
			set.add(preSum[i]);
		}
		if(!list.isEmpty())return Collections.max(list);
		else return null;
		
	   
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matrix= {
				{0,-2,-7,0},
				{9,2,-6,2},
				{-4,1,-4,1},
				{-1,8,0,-2}
				
		};
		int[][]matrix1= {
				{1,0,1},
				{0,-2,3}
		};
		int k=2;
		System.out.print(new Q363().maxSumSubmatrix(matrix1,k));
	}

}
