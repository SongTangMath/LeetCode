

import java.util.Arrays;

public class Q123 {
	public int maxProfit(int[] prices) {
		  if(prices==null||prices.length<=1)return 0;
			 int buy1=Integer.MIN_VALUE,sell1=0,buy2=Integer.MIN_VALUE,sell2=0;
	        for(int i=0;i<prices.length;i++){
	            sell2=Math.max(sell2,buy2+prices[i]);
	            buy2=Math.max(buy2,sell1-prices[i]);
	            sell1=Math.max(sell1,buy1+prices[i]);
	            buy1=Math.max(buy1,-prices[i]);
	        }
	        return sell2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]prices= {2,1,4,5,2,9,7};
		System.out.println(new Q123().maxProfit(prices));
		//System.out.println(Integer.MIN_VALUE);
	}

}
