

public class Q62 {
public int uniquePaths(int m, int n) {
        if(m==1||n==1)return 1;
        int [][]a=new int[m][n];
        for(int j=0;j<n;j++)a[0][j]=1;
        for(int i=0;i<m;i++)a[i][0]=1;
        for(int k=2;k<=m+n-2;k++) {
        	for(int i=1;i<m;i++)
        		if(1<=k-i&&k-i<n) {
        			int j=k-i;a[i][j]=a[i-1][j]+a[i][j-1];
        		}
        }
        
       
        return a[m-1][n-1];
        
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q62().uniquePaths(3, 7));
		
	}

}
