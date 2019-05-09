
import java.util.*;
public class Q139 {
	 public boolean wordBreak(String s, List<String> wordDict) {
	        if(s.length()==0)return true;
	        boolean[]a=new boolean[s.length()+1];
	        a[s.length()]=true;
	        for(int i=s.length()-1;i>=0;i--) {
	         for(String temp:wordDict) {
	        	if(temp.length()<=s.length()-i&&
	        			temp.equals(s.substring(i, i+temp.length()))&&
	        			a[i+temp.length()])
	        		a[i]= true;
	        }}
	        return a[0];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]strs= {"apple", "pen"};
		String s="applepenapple";
		List<String> wordDict=new ArrayList<String>(Arrays.asList(strs));
		System.out.println(new Q139().wordBreak(s, wordDict));
	}

}
