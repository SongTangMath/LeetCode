

public class Q115 {
	 public int numDistinct(String s, String t) {
	        if(s.length()<t.length())return 0;
	        int[][]a=new int[s.length()][t.length()];
	        int count=0;
	        for(int i=0;i<s.length();i++) {
	        	if(s.charAt(i)==t.charAt(0))count++;
	        	a[i][0]=count;
	        }
	        for(int k=1;k<s.length()+t.length()-1;k++) {
	        	for(int i=1;i<=k;i++) {
	        		int j=k-i;
	        		if(i<s.length()&&j<t.length()&&i>=j&&j>=1) {
	        			if(s.charAt(i)!=t.charAt(j))a[i][j]=a[i-1][j];
	        			else a[i][j]=a[i-1][j-1]+a[i-1][j];

	        		}
	        	}
	        }
	        return a[s.length()-1][t.length()-1];
	    }
	public static void main(String[] args) {
	System.out.println(new Q115().numDistinct("babgbag", "bag"));

	}

}
