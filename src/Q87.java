

import java.util.Arrays;

public class Q87 {
	 public boolean isScramble(String s1, String s2) {
	        if(s1.equals(s2))return true;
	        if(s1.length()!=s2.length())return false;
	        char[] ss1=s1.toCharArray();
	        char[] ss2=s2.toCharArray();
	        Arrays.sort(ss1);String new1=new String(ss1);
	        Arrays.sort(ss2);String new2=new String(ss2);
	        if(!new1.equals(new2))return false;
	        for(int i=1;i<s1.length();i++) 
	        	if((s1.substring(i)+s1.substring(0, i)).equals(s2))
	        		return true;
	        for(int i=1;i<s1.length();i++) {
	        	if(isScramble(s1.substring(i),s2.substring(i))&&
	        			isScramble(s1.substring(0, i),s2.substring(0, i))
	        			)return true;
	        	if(isScramble(s1.substring(i),s2.substring(0,s2.length()-i))&&
	        			isScramble(s1.substring(0, i),s2.substring(s2.length()-i))
	        			)return true;
	        	
	        }
	        return false;
	        		
	        		
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q87().isScramble("great", "rgtae"));
	}

}
