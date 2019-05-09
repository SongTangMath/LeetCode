

public class Q233 {
	   public int countDigitOne(int n) {
	        if(n<=0)return 0;
	        String s=n+"";
	        int k=s.length();
	        if(k==1)return 1;
	        int highestbit=s.charAt(0)-'0';
	        int lowerbits=Integer.parseInt(s.substring(1));
	        char[]seq=new char[k-1];
	        for(int i=0;i<k-1;i++)seq[i]='9';
	        int later=Integer.parseInt(new String(seq));
	       
	        	//最高位至少是2.
	        	//与n相同位数且最高位小于n的数按照最高位分为highestbit-1组
	        	//将比n少一位的数视为首位为0,这样共highestbit组
	        	//它们的低位都可以从0取到later
	        
	       int ans=(highestbit)*countDigitOne(later);
	       //再来考虑与n有相同位数且最高位也相同的数,有lowerbits个
	       //以及最高位1的个数
	       //如果最高位>=2,最高位的1有later+1个否则有lowerbits+1个
	       if(highestbit>=2)ans+=(later+1);
	       else ans+=(lowerbits+1);
	       ans+=countDigitOne(lowerbits);
	       return ans;
	        //later=9999..9的个数=n的位数-1=k-1.
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q233().countDigitOne(11));
	}

}
