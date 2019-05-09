

public class Q59 {
	 public int[][] generateMatrix(int n) {
	        int[][] matrix=new int[n][n];
	        int count=1;matrix[0][0]=1;
	        int i=0,j=0;
	        while(count<n*n) {
	        	while(j+1<n&&matrix[i][j+1]==0) matrix[i][++j]=++count;
	        	while(i+1<n&&matrix[i+1][j]==0) matrix[++i][j]=++count;
	        	while(j-1>=0&&matrix[i][j-1]==0) matrix[i][--j]=++count;
	        	while(i-1>=0&&matrix[i-1][j]==0) matrix[--i][j]=++count;
	        }
	        return matrix;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[][]matrix=new Q59().generateMatrix(n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}

}
