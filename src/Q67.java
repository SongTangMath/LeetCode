

public class Q67 {
	 public String addBinary(String a, String b) {
	        int[]num1=new int[Math.max(a.length(), b.length())];
	        int[]num2=new int[Math.max(a.length(), b.length())];
	        for(int i=0;i<a.length();i++)num1[a.length()-1-i]=a.charAt(i)-48;
	        for(int i=0;i<b.length();i++)num2[i]=b.charAt(b.length()-1-i)-48;
	        int []ans=new int[num1.length+1];
	        for(int i=0;i<num1.length;i++) {
	        	ans[i]+=(num1[i]+num2[i]);
	        	if(ans[i]>=2) {
	        		ans[i]-=2;
	        		ans[i+1]++;
	        	}
	        }
	        String s="";for(int i=0;i<ans.length;i++)
	        	s=ans[i]+s;
	        if(s.charAt(0)!='0')return s;
	        else return s.substring(1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q67().addBinary("1000", "1"));
	}

}
