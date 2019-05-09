

public class Q97 {
	 public boolean isInterleave(String s1, String s2, String s3) {
		 if(s1.length()+s2.length()!=s3.length())return false;
		if(s1.length()==0)return s2.equals(s3);
		if(s2.length()==0)return s1.equals(s3);
		boolean[][]a=new boolean [s1.length()+1][s2.length()+1];
		a[0][0]=true;
		for(int k=1;k<=s3.length();k++)
			for(int i=0;i<=Math.min(k, s1.length());i++) {
				int j=k-i;
				if(j<=s2.length()) {
				if(i>=1&&s1.charAt(s1.length()-i)==s3.charAt(s3.length()-i-j)
						&&a[i-1][j])a[i][j]=true;
				if(j>=1&&s2.charAt(s2.length()-j)== s3.charAt(s3.length()-i-j)
						&&a[i][j-1])a[i][j]=true;}}

			
	 return a[s1.length()][s2.length()];
	    }
	 private int commonPrefix(String s,String t)
	 {
		
		 int maxlen=Math.min(s.length(), t.length());
		 int i=0;
		 while(i<maxlen&&s.charAt(i)==t.charAt(i))i++;
			return i;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q97().commonPrefix("abc","abd"));
//		String s1="aa",s2="ab",s3="aaba";
		String  s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
		System.out.println(new Q97().isInterleave(s1, s2, s3));
	}

}
