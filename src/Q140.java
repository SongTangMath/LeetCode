
import java.util.*;
public class Q140 {
	  public List<String> wordBreak(String s, List<String> wordDict) {
		  if(s.length()==0||!canwordBreak(s,wordDict))return new ArrayList<String>();
		  List<List<String>>totalList=new ArrayList<List<String>>();
		  for(int i=0;i<=s.length();i++)
			  totalList.add(new ArrayList<String>());
		  totalList.get(0).add("");
		  
	        boolean[]a=new boolean[s.length()+1];
	        a[0]=true;
	        for(int i=1;i<=s.length();i++) {
	         for(String temp:wordDict) {
	        	if(temp.length()<=i&&
	        			temp.equals(s.substring( i-temp.length(),i))&&
	        			a[i-temp.length()]) {
	        		a[i]= true;
	        		for(String tempstr:totalList.get(i-temp.length())) {
	        			totalList.get(i).add(tempstr+" "+temp);
	        		}
	        }}}
	        if(a[s.length()]) {
	         List<String>list=totalList.get(s.length());
	         List<String> ans=new ArrayList<String>();
	         for(String temp:list)ans.add(temp.trim());
	         return ans;
	        }
	        
	        else return new ArrayList<String>();
	        
	    }
	  
	  public boolean canwordBreak(String s, List<String> wordDict) {
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
		String[]strs= {"apple", "pen", "applepen", "pine", "pineapple"};
		String s="pineapplepenapple";
		List<String> wordDict=new ArrayList<String>(Arrays.asList(strs));
		List<String>ans=new Q140().wordBreak(s, wordDict);
		for(String temp:ans)System.out.println(temp);
	}

}
