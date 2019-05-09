

public class Q73 {
	  public void setZeroes(int[][] matrix) {
	        int m=matrix.length,n=matrix[0].length;
	        boolean row=false,col=false;
	       for(int j=0;j<n;j++)if(matrix[0][j]==0) {row=true;break;}
	       for(int i=0;i<m;i++)if(matrix[i][0]==0) {col=true;break;}
	        for(int i=1;i<m;i++){
	            for(int j=0;j<n;j++)
	            	if(matrix[i][j]==0) {matrix[i][0]=0;break;}
	        }
	        for(int j=1;j<n;j++) {
	        for(int i=0;i<m;i++){	            
	            	if(matrix[i][j]==0) {matrix[0][j]=0;break;}
	        }}
	        for(int i=1;i<m;i++){
	            for(int j=1;j<n;j++)
	            	if(matrix[i][0]==0||matrix[0][j]==0)matrix[i][j]=0;
	        }
	        if(row)for(int j=0;j<n;j++)matrix[0][j]=0;
	        if(col) for(int i=0;i<m;i++)matrix[i][0]=0;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matrix={
		  {0,1,2,0},
		  {3,4,5,2},
		  {1,3,1,5}
		};
		new Q73().setZeroes(matrix);
		int m=matrix.length,n=matrix[0].length;
		 for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++)
	            	System.out.print(matrix[i][j]);
	            System.out.println();
	        }
	}

}
