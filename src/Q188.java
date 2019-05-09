

public class Q188 {
public int maxProfit(int k, int[] prices) {
        if(prices.length<=1||k==0)return 0;
        if(k>=prices.length)k=prices.length;
        int[]buy=new int[k];
        int[]sell=new int[k];
        for(int i=0;i<k;i++)buy[i]=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++) {
        	for(int j=k-1;j>=1;j--) {
        		sell[j]=Math.max(sell[j], buy[j]+prices[i]);
        		buy[j]=Math.max(buy[j], sell[j-1]-prices[i]);
        	}
        	sell[0]=Math.max(sell[0], buy[0]+prices[i]);
        	buy[0]=Math.max(buy[0], -prices[i]);
        }
        return sell[k-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]prices= {2,1,4,5,2,9,7};
		int k=2;
		System.out.println(new Q188().maxProfit(k, prices));
	}

}
