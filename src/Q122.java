

public class Q122 {
	  public int maxProfit(int[] prices) {
		  if(prices==null||prices.length<=1)return 0;
		  boolean holding=false;
		  int maxprofit=0;
		  int buyprice=0;
		  for(int i=0;i<prices.length;i++) {
			  if(!holding&&i<prices.length-1&&prices[i]<prices[i+1]) {
				  holding=true;
				  buyprice=prices[i];
			  }
			  if(holding&&i<prices.length-1&&prices[i]>prices[i+1]) {
				  holding=false;
				  maxprofit+=prices[i]-buyprice;
			  }
			  if(i==prices.length-1&&holding)maxprofit+=prices[i]-buyprice;
				  
			  
		  }
		  return maxprofit;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]prices= {7,6,4,3,1};
		System.out.println(new Q122().maxProfit(prices));
	}

}
