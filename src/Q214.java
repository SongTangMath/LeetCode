

public class Q214 {
	 public String shortestPalindrome(String s) {
	        if(isPalindromic(s))return s;
	        int minExtendedlen=s.length()-1;
	        
	        for(int index=s.length()/2;index>=0;index--) {
	        	if(canExtendSingle(s,index)&&
	        			minExtendedlen>s.length()-1-2*index) {
	        		
	        		minExtendedlen=s.length()-1-2*index;
	        		
	        	}
	        	if(canExtendDouble(s,index)&&
	        			minExtendedlen>s.length()-1-2*index) {
	        		
	        		minExtendedlen=s.length()-2*index;
	        		
	        	}
	        	
	    }
	        char[] charSeq=new char[minExtendedlen];
        	for(int i=0;i<minExtendedlen;i++)charSeq[i]=s.charAt(s.length()-1-i);
        	return  new String(charSeq)+s;   
	 }
	 private boolean canExtendSingle(String s,int index) {
		 
		 if(index<=0||s.length()-1<2*index)return false;
		 for(int i=1;i<=index;i++)if(s.charAt(index-i)!=s.charAt(index+i))
			 return false;
		 return true;
	 }
	 
	 private boolean canExtendDouble(String s,int index) {
		 if(index<=0||index>=s.length())return false;
		 if(s.charAt(index)!=s.charAt(index-1))return false;
		 for(int i=1;i<=index-1;i++)if(s.charAt(index-1-i)!=s.charAt(index+i))
			 return false;
		 return true;
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
			System.out.println(new Q214().shortestPalindrome("abcd"));
	}

}
