

public class Q64 {
public int minPathSum(int[][] grid) {
	int m=grid.length,n=grid[0].length;
	  
      int [][]a=new int[m][n];
      a[0][0]=grid[0][0];
      for(int j=1;j<n;j++)a[0][j]=a[0][j-1]+grid[0][j];
      for(int i=1;i<m;i++)a[i][0]=a[i-1][0]+grid[i][0];
      for(int k=2;k<=m+n-2;k++) {
      	for(int i=1;i<m;i++)
      		if(1<=k-i&&k-i<n) {
      			int j=k-i;a[i][j]=Math.min(a[i-1][j],a[i][j-1])+grid[i][j];
      		}
      }
      return a[m-1][n-1];
  }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]grid={
		              {1,3,1},
		              {1,5,1},
		              {4,2,1}
		            };
		System.out.println(new Q64().minPathSum(grid));
	}

}
