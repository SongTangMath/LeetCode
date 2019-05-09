
import java.util.*;
public class Q93 {
	 public List<String> restoreIpAddresses(String s) {
		 if(s.length()>=4&&s.length()<=12)
	        return divide(s,4);
		 else return new ArrayList<String>();
	    }
	 private   List<String> divide(String s,int n) {
		  List<String>totalList=new ArrayList<String>();
		  if(s.length()==0)return new ArrayList<String>();
	      if(n==1&&s.length()>=1) {
	    	 
	    	  int temp=Integer.parseInt(s);
	    	  String s1=""+temp;
	    	  if(0<=temp&&temp<=255&&s1.equals(s))totalList.add(s);
	    	  return totalList;
	      }
	      
	       
	    	  for(String temp:divide(s.substring(1),n-1))
	    		  totalList.add(s.charAt(0)+"."+temp);
	      
	      if(s.length()>=2&&Integer.parseInt(s.substring(0, 2))>=10) {
	    	  for(String temp:divide(s.substring(2),n-1))
	    		  totalList.add(s.substring(0,2)+"."+temp);
	      }
	      if(s.length()>=3&&Integer.parseInt(s.substring(0, 3))>=100
	    		  &&Integer.parseInt(s.substring(0, 3))<=255) {
	    	  for(String temp:divide(s.substring(3),n-1))
	    		  totalList.add(s.substring(0,3)+"."+temp);
	      }
	      return totalList;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1111";
		List<String> list=new Q93().restoreIpAddresses(s);
		for(String temp:list)
			System.out.println(temp);
	}

}
