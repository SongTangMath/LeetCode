import java.util.*;
public class Q316 {
public String removeDuplicateLetters(String s) {
        if(s==null||s.length()<=1)return s;
        int[]first=new int[26];
        int[]last=new int[26];
        for(int i=0;i<26;i++) {
        	first[i]=-1;
        	last[i]=-1;
        }
        for(int i=0;i<s.length();i++)
        {
        	if(first[s.charAt(i)-'a']==-1)first[s.charAt(i)-'a']=i;
        	last[s.charAt(i)-'a']=i;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++)
        	if(last[i]!=-1)min=Math.min(min, last[i]);
        //int pos=Integer.MAX_VALUE;
        //List<Integer>list=new ArrayList<Integer>();
        int i=0;
        for(i=0;i<26;i++)
        	if(first[i]!=-1&&first[i]<=min)
        	break;
        //=Collections.min(list);
        int pos=first[i];
        StringBuilder sb=new StringBuilder("");
        for(int j=pos+1;j<s.length();j++)
        	if(s.charAt(j)!=s.charAt(pos))sb.append(s.charAt(j));
        return s.charAt(pos)+removeDuplicateLetters(sb.toString());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cbacdcbc";
		System.out.print(new Q316().removeDuplicateLetters(s));
	}

}
