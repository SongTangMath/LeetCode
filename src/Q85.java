

public class Q85 {
public int maximalRectangle(char[][] matrix) {
        if(matrix==null||matrix.length==0)return 0;
        int m=matrix.length,n=matrix[0].length;
        int [][]heights=new int[m][n];
        for(int j=0;j<n;j++) {
        	for(int i=0;i<m;i++) {
        		if(matrix[i][j]=='1') {
        			int count=0;
        			while(i<m&&matrix[i][j]=='1') {count++;i++;}
        			//heights[i-1][j]=1,...heights[i-count][j]=count
        			for(int p=1;p<=count;p++)
        				heights[i-p][j]=p;
        		}
        	}
        }
        int[] maxRowArea=new int[m];
        for(int i=0;i<m;i++) {
        int[]left=new int[n];
        int[]right=new int[n];
        int[]maxArea=new int[n];
        left[0]=-1;
        for(int j=1;j<n;j++) {
        	int p=j-1;
        	while(p>=0&&heights[i][p]>=heights[i][j])p=left[p];
        	left[j]=p;
        }
        right[n-1]=n;
        for(int j=n-2;j>=0;j--) {
        	int p=j+1;
        	while(p<n&&heights[i][p]>=heights[i][j])p=right[p];
        	right[j]=p;
        }
        for(int j=0;j<n;j++) {
        	maxArea[j]=heights[i][j]*(right[j]-left[j]-1);
        	maxRowArea[i]=Math.max(maxRowArea[i], maxArea[j]);
        }
        
        }
        int max=0;
        for(int i=0;i<m;i++)max=Math.max(max, maxRowArea[i]);
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]matrix={
		  {'1','0','1','0','0'},
		  {'1','0','1','1','1'},
		  {'1','1','1','1','1'},
		  {'1','0','0','1','0'}
		};
		System.out.println(new Q85().maximalRectangle(matrix));
	}

}
