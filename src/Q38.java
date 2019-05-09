

public class Q38 {
	   public String countAndSay(int n) {
	        String ans="1";
	        for(int i=1;i<=n-1;i++)
	        	ans=nextString(ans);
	        return ans;
	    }
	   private String nextString(String cur) {
		   String ans=new String("");
		   while(cur.length()!=0) {
			   char ch=cur.charAt(0);
			   int count=1;
			   while(count<cur.length()&&cur.charAt(count)==ch)
				   count++;
			   ans=ans+count+ch;
			   cur=cur.substring(count);
		   }
		   return ans;
		   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q38().nextString("1211"));
		System.out.println(new Q38().countAndSay(5));
	}

}
