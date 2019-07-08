import java.util.Arrays;

public class Q397 {
     public int integerReplacement(int n) {
         int bound=1;
         int count=0;
         while(n%2==0) {
             n/=2;
             count++;
         }
         while(bound<n) {
             bound*=2;            
         }
         int []dp=new int[bound+1];
         Arrays.fill(dp, -1);
         dp[1]=0;
         for(int i=2;i<=bound;i++)
         dp[i]=integerReplacementMemorized(i,dp);
         return count+dp[n];
     }
     int integerReplacementMemorized(int i,int[]dp) {
         int ans=-1;
         if(dp[i]!=-1)return dp[i];
         
         else if(i%2==0)ans= 1+dp[i/2];
         else ans= 1+Math.min(integerReplacementMemorized(i-1,dp) ,integerReplacementMemorized(i+1,dp));
         dp[i]=ans;
         return ans;
     }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(new Q397().integerReplacement(111111111));
    }

}
