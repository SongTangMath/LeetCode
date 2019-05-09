

public class Q151 {
	 public String reverseWords(String s) {
		 s=s.trim();
		 if(s.length()==0)return "";
	        String[]strs=s.split(" ");
	        String ans="";
	        for(int i=strs.length-1;i>0;i--)
	        	if(!strs[i].trim().equals(""))ans=ans+strs[i]+" ";
	        ans=ans+strs[0];
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  the sky   is blue  ";
		System.out.println(new Q151().reverseWords(s));
		System.out.println("".trim());
	}

}
