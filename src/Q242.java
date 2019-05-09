

import java.util.Arrays;

public class Q242 {
	 public boolean isAnagram(String s, String t) {
	        if(s.length()!=t.length())return false;
	        char[]seq1=s.toCharArray();
	        char[]seq2=t.toCharArray();
	        Arrays.sort(seq1); Arrays.sort(seq2);
	        String s1=new String(seq1);
	        String t1=new String(seq2);
	        return s1.equals(t1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
