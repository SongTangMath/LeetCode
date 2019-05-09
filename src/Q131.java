
import java.util.*;
public class Q131 {
	 public List<List<String>> partition(String s) {
		 List<List<String>>totalList=new ArrayList<List<String>>();
		 if(s.length()==0)
		 {totalList.add(new ArrayList<String>());return totalList;}
		 
		
		 for(int i=s.length()-1;i>=0;i--)
			 if(isPalindromic(s,i,s.length()-1)) {
				 String temp=s.substring(i);
				 for(List<String>tempList:partition(s.substring(0, i))) {
					 tempList.add(temp);
				 totalList.add(tempList);}
			 }
		 for(List<String>tempList:totalList)
			 tempList.remove("");
		 return totalList;
	    }
	 private boolean isPalindromic(String s,int i,int j)
	
	{
	for(int k=i;k<=j;k++)
	if(s.charAt(k)!=s.charAt(i+j-k))return false;
	return true;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> totalList=new Q131().partition("aab");
		for(int i=0;i<totalList.size();i++) {
			List<String>tempList=totalList.get(i);
			for(String temp:tempList)System.out.print(temp+" ");
			System.out.println();}
		System.out.println(new Q131().isPalindromic("a", 0, 0));
			
		}
	
	

}
