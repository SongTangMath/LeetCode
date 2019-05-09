
public class Q309 {
	 public int maxProfit(int[] prices) {
		 if(prices==null||prices.length<=1)return 0;
	        int[]a=new int[prices.length];
	        a[0]=0;
	        for(int i=1;i<prices.length;i++) {
	        	int profit=0;
	        	for(int j=0;j<=1;j++)
	        		profit=Math.max(profit, prices[i]-prices[j]);
	        	for(int j=2;j<i;j++)
	        		profit=Math.max(profit, prices[i]-prices[j]+a[j-2]);
	        	a[i]=Math.max(profit, a[i-1]);
	        }
	        return a[prices.length-1];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]prices= {1,4,2};
		System.out.print(new Q309().maxProfit(prices));
	}

}
