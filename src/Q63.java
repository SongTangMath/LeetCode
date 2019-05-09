

public class Q63 {
	  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	        int m=obstacleGrid.length;
	        int n=obstacleGrid[0].length;
	        
	        int [][]a=new int[m][n];
	        boolean findObstacle=false;
	        for(int j=0;j<n;j++) { 
	        	if(obstacleGrid[0][j]==1)findObstacle=true;	        	
	        	if(!findObstacle)a[0][j]=1;
	        }
	        findObstacle=false;
	        for(int i=0;i<m;i++) { 
	        	if(obstacleGrid[i][0]==1)findObstacle=true;	        	
	        	if(!findObstacle)a[i][0]=1;
	        }
	        for(int k=2;k<=m+n-2;k++) {
	        	for(int i=1;i<m;i++)
	        		if(1<=k-i&&k-i<n) {
	        			int j=k-i;
	        			if(obstacleGrid[i][j]==0)a[i][j]=a[i-1][j]+a[i][j-1];
	        		}
	        }
	        
	       
	        return a[m-1][n-1];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][]obstacleGrid=new int[3][3];
			obstacleGrid[1][1]=1;
			System.out.println(new Q63().uniquePathsWithObstacles(obstacleGrid));
	}

}
