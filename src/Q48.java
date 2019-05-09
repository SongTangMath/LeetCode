

public class Q48 {
	
	    public void rotate(int[][] matrix) {
	        
	    if(matrix==null||matrix.length<=1)return;
	    for(int i=0;i<matrix.length;i++) {
	    	for(int j=i+1;j<matrix.length;j++) {
	    		int temp=matrix[i][j];
	    		matrix[i][j]=matrix[j][i];
	    		matrix[j][i]=temp;
	    	}
	    }
	  //Ȼ�����ǽ���0�����matrix.length-1�л�...
	    for(int i=0;i<matrix.length/2;i++) {
	    	for(int j=0;j<matrix.length;j++) {
	    		int temp=matrix[j][i];
	    		matrix[j][i]=matrix[j][matrix.length-1-i];
	    		matrix[j][matrix.length-1-i]=temp;
	    	}
	    }
	    
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix={
		  {1,2,3},
		  {4,5,6},
		  {7,8,9}
		};
		new Q48().rotate(matrix);
		System.out.println();
	}

}
