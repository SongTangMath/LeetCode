
import java.util.*;
public class Q121 {
	 public int maxProfit(int[] prices) {
	        if(prices==null||prices.length<=1)return 0;
	        Stack<Integer>stack=new Stack<Integer>();
	        stack.push(prices[0]);
	        int maxprofit=0;
	        for(int i=1;i<prices.length;i++) {
	        	if(prices[i]<=stack.peek())stack.push(prices[i]);
	        	else maxprofit=Math.max(maxprofit, prices[i]-stack.peek());
	        		
	        	
	        }
	        return maxprofit;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]prices={7,6,4,3,1};
		System.out.println(new Q121().maxProfit(prices));
	}

}
