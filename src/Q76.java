
import java.util.*;
public class Q76 {
	 public String minWindow(String s, String t) {
		 if(s==null||s.length()==0)return "";
	        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	        for(int i=0;i<t.length();i++) {
	        	if(!map.containsKey(t.charAt(i)))
	        		map.put(t.charAt(i), 1);
	        	else map.put(t.charAt(i), map.get(t.charAt(i))+1);
	        }
	        int left=0,right=0,count=0,minlen=s.length()+1,start=0;
	        while(right<s.length()) {
	        	if(map.containsKey(s.charAt(right))) {
	        		map.put(s.charAt(right), map.get(s.charAt(right))-1);
	        		if(map.get(s.charAt(right))>=0)count++;
	        		
	        		while(count==t.length()) {
	        			if(right-left+1<minlen) {
	        				start=left;minlen=right-left+1;
	        			}
	        			if(map.containsKey(s.charAt(left))) {
	        				map.put(s.charAt(left), map.get(s.charAt(left))+1);
	        			if(map.get(s.charAt(left))>0)count--;}
	        			left++;
	        		}
	        	}
	        	right++;
	        }
	        if(minlen==s.length()+1)return "";
	        else return s.substring(start,start+ minlen);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String S = "ADOBECODEBANC", T = "ABC";
		 System.out.println(new Q76().minWindow(S, T));
	}

}
