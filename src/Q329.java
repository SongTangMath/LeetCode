
public class Q329 {
	 public int longestIncreasingPath(int[][] matrix) {
		 if(matrix==null||matrix.length==0||matrix[0].length==0)return 0;
		 int n=matrix.length,m=matrix[0].length;
		 int[][]dp=new int[n][m];
		 DP(matrix,dp);
		 int ans=0;
		 for(int i=0;i<n;i++)
			 for(int j=0;j<m;j++)ans=Math.max(ans, dp[i][j]);
		 return ans;
	    }
	 public int memorizedDP(int[][]matrix,int[][]dp,int begin,int end) {
		 
		 if(dp[begin][end]!=-1)return dp[begin][end];
		 int ans=1;
		 if(isValid(matrix,begin-1,end)&&matrix[begin-1][end]>matrix[begin][end])
			 			 ans=Math.max(ans, 1+memorizedDP(matrix,dp,begin-1,end));
		 if(isValid(matrix,begin+1,end)&&matrix[begin+1][end]>matrix[begin][end])
			 			 ans=Math.max(ans, 1+memorizedDP(matrix,dp,begin+1,end));
		 
		 if(isValid(matrix,begin,end-1)&&matrix[begin][end-1]>matrix[begin][end])
 			 ans=Math.max(ans, 1+memorizedDP(matrix,dp,begin,end-1));
		 if(isValid(matrix,begin,end+1)&&matrix[begin][end+1]>matrix[begin][end])
 			 ans=Math.max(ans, 1+memorizedDP(matrix,dp,begin,end+1));
		 dp[begin][end]=ans;
		 return ans;
	 }
	 public void DP(int[][]matrix,int[][]dp) {
		 int n=matrix.length,m=matrix[0].length;
		 for(int i=0;i<n;i++)
			 for(int j=0;j<m;j++)dp[i][j]=-1;
		 
		 for(int i=0;i<n;i++)
			 for(int j=0;j<m;j++)
				memorizedDP(matrix,dp,i,j);
		 
	 }
	 public boolean isValid(int[][]matrix,int x,int y) {
		 int n=matrix.length,m=matrix[0].length;
		 return(0<=x&&x<n&&0<=y&&y<m);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matrix = 
				{
				  {3,4,5},
				  {3,2,6},
				  {2,2,1}
				} ;
		System.out.print(new Q329().longestIncreasingPath(matrix));
	}

}
