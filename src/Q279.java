
public class Q279 {
	  public int numSquares(int n) {
	        int a[]=new int[n+1];
	        a[1]=1;
	        for(int i=1;i<=n;i++) {
	        	int upper=(int) Math.floor(Math.sqrt(i));
	        	if(upper*upper==i)a[i]=1;
	        	else {int minFind=i;
	        		for(int j=1;j<=upper;j++) {
	        			minFind=Math.min(minFind, 1+a[i-j*j]);
	        		}
	        		a[i]=minFind;
	        	}
	        	
	        }
	        return a[n];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(new Q279().numSquares(12));
	}

}
