import java.util.*;
public class Q375 {
public int getMoneyAmount(int n) {
	if(n<=1)return 0;
        int[][]dp=new int[n+1][n+1];
        for(int i=0;i<=n-1;i++)dp[i][i+1]=i;
        for(int i=0;i<=n-2;i++)dp[i][i+2]=i+1;
        for (int k=3;k<=n;k++) {
        	
        
        for(int i=0;i<=n-k;i++) {
        	List<Integer>list=new ArrayList<Integer>();
        	//j-i=k,j=i+k<=n
        	int j=i+k;
        	for(int t=i+1;t<j;t++)list.add(Math.max(dp[i][t-1], dp[t+1][j])+t);
        	
        		dp[i][j]=Collections.min(list);
        	}}
        return dp[1][n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new Q375().getMoneyAmount(4));
	}

}
