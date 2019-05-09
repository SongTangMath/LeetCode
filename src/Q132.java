
import java.util.*;
public class Q132 {
    		public int minCut(String s) {
    			if(s.length()==0)return 0;
        if(isPalindromic(s))return 0;
        int n=s.length();     
       int []a=new int[s.length()+1];
        
       for(int k=0;k<=n;k++)a[k]=k-1;
       for(int i=0;i<n;i++) {
    	   for(int j=0;i-j>=0&&i+j<n&&
    			   s.charAt(i-j)==s.charAt(i+j);j++   ) {
    		   a[i+j+1]=Math.min(a[i+j+1], a[i-j]+1);
    		   
    	   }
    	   if(i+1<n&&s.charAt(i)==s.charAt(i+1))
    		   for(int j=0;i-j>=0&&i+1+j<n&&
			   s.charAt(i-j)==s.charAt(i+1+j);j++   ) {
		   a[i+j+2]=Math.min(a[i+j+2], a[i-j]+1);
		   
	   }
       }
       return a[s.length()];
    }
    		
    		
    		
   private boolean isPalindromic(String s,int i,int j)
    		
    		{
    		for(int k=i;k<=j;k++)
    		if(s.charAt(k)!=s.charAt(i+j-k))return false;
    		return true;}
private boolean isPalindromic(String s) {
    		return isPalindromic(s,0,s.length()-1);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="apjesgpsxoeiokmqmfgvjslcjukbqxpsobyhjpbgdfruqdke"
				+ "iszrlmtwgfxyfostpqczidfljwfbbrflkgdvtytbgqalguew"
				+ "nhvvmcgxboycffopmtmhtfizxkmeftcucxpobxmelmjtuzigsxnn"
				+ "cxpaibgpuijwhankxbplpyejxmrrjgeoevqozwdtgospohznkoy"
				+ "zocjlracchjqnggbfeebmuvbicbvmpuleywrpzwsihivnrwtxcu"
				+ "kwplgtobhgxukwrdlszfaiqxwjvrgxnsveedxseeyeykarqnjrt"
				+ "laliyudpacctzizcftjlunlgnfwcqqxcqikocqffsjyurzwysfj"
				+ "mswvhbrmshjuzsgpwyubtfbnwajuvrfhlccvfwhxfqthkcwhatk"
				+ "tymgxostjlztwdxritygbrbibdgkezvzajizxasjnrcjwzdfvdnww"
				+ "qeyumkamhzoqhnqjfzwzbixclcxqrtniznemxeahfozp";
		String t="aab";
		System.out.println(new Q132().minCut(t));
	}

}
