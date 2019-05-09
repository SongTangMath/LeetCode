

public class Q174 {
	 public int calculateMinimumHP(int[][] dungeon) {
		 int m=dungeon.length,n=dungeon[0].length;
		 int[][]a=new int[m][n];
		 if(dungeon[m-1][n-1]>=0)a[m-1][n-1]=1;
		 else a[m-1][n-1]=1-dungeon[m-1][n-1];
		 for(int i=m-1;i>=1;i--)
			if( dungeon[i-1][n-1]>=a[i][n-1])a[i-1][n-1]=1;
			else a[i-1][n-1]=-dungeon[i-1][n-1]+a[i][n-1];
		 for(int j=n-1;j>=1;j--)
			if( dungeon[m-1][j-1]>=a[m-1][j])a[m-1][j-1]=1;
			else a[m-1][j-1]=-dungeon[m-1][j-1]+a[m-1][j];
		 for(int k=m+n-4;k>=0;k--) {
			 for(int i=0;i<=k;i++) {
				 int j=k-i;
				 if(0<=i&&i<=m-2&&0<=j&&j<=n-2) {
					 if(dungeon[i][j]>=a[i+1][j]||dungeon[i][j]>=a[i][j+1])
							 a[i][j]=1;
					 else a[i][j]=-dungeon[i][j]+
							 Math.min(a[i][j+1],a[i+1][j]);

				 }
			 }
		 }
		 	return a[0][0];

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][]dungeon= {
					{-2,-3,3},
					{-5,-10,1},
					{10,30,-5}
			};
			System.out.println(new Q174().calculateMinimumHP(dungeon));
	}

}
