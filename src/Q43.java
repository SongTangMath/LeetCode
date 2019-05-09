

public class Q43 {
	 public String multiply(String num1, String num2) {
	        if(num1.equals("0")||num2.equals("0"))return "0";
	        int[] Nums1=new int[num1.length()];
	        int[] Nums2=new int[num2.length()];

	        for(int i=0;i<num1.length();i++)
	        Nums1[i]=num1.charAt(num1.length()-1-i)-48;
	        for(int i=0;i<num2.length();i++)
	        Nums2[i]=num2.charAt(num2.length()-1-i)-48;
	        int[] ans=new int[num1.length()+num2.length()];
	        for(int i=0;i<ans.length;i++)ans[i]=0;
	        for(int i=0;i<Nums1.length;i++) {
	        	for(int j=0;j<Nums2.length;j++) {
	        		int temp=Nums1[i]*Nums2[j];
	        		ans[i+j]+=temp %10;
	        		if(ans[i+j]>=10) {
	        			ans[i+j]-=10;
	        			ans[i+j+1]++;
	        		}
	        		ans[i+j+1]+=temp/10;
	        		if(ans[i+j+1]>=10) {
	        			ans[i+j+1]-=10;
	        			ans[i+j+2]++;
	        		}
	        	}
	        }
	        String ansStr="";
	        for(int i=0;i<ans.length;i++)
	        	ansStr=ans[i]+ansStr;
	        if(ansStr.charAt(0)=='0')ansStr=ansStr.substring(1);
	        return ansStr;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q43().multiply("123", "456"));
	}

}
