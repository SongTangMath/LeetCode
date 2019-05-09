
public class Q304 {
	private int[][]sum;
    public Q304(int[][] matrix) {
    	 if(matrix==null||matrix.length==0)return;
        int m=matrix.length,n=matrix[0].length;
        sum=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        	for(int j=0;j<=n;j++)sum[i][j]=0;
        for(int i=1;i<=m;i++)
        	for(int j=1;j<=n;j++) {
        		sum[i][j]=sum[i][j-1]+sum[i-1][j]-sum[i-1][j-1]+matrix[i-1][j-1];
        	}
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    	if(sum==null)return 0;
        return sum[row2+1][col2+1]+sum[row1][col1]
        		-sum[row2+1][col1]-sum[row1][col2+1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matrix = {
		          {3, 0, 1, 4, 2},
		          {5, 6, 3, 2, 1},
		          {1, 2, 0, 1, 5},
		          {4, 1, 0, 1, 7},
		          {1, 0, 3, 0, 5}
		        };
		Q304 obj=new Q304(matrix);
		System.out.print(obj.sumRegion(1, 1, 2, 2));
	}

}
