
import java.util.*;
public class Q187 {
	 public List<String> findRepeatedDnaSequences(String s) {
	        List<String> list=new ArrayList<String>();
	        
	        if(s.length()<=9)return list;
	        HashSet<String> set=new HashSet<String>();
	        HashSet<String>repeated=new HashSet<String>();
	        for(int i=0;i<=s.length()-10;i++)
	            if(!set.contains(s.substring(i, i+10)))
	            	set.add(s.substring(i, i+10));
	            	else repeated.add(s.substring(i, i+10));
	        for(String temp:repeated)list.add(temp);
	        return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAAAAAAAAAAA";
		 List<String> list=new Q187().findRepeatedDnaSequences(s);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
//		 HashSet<String> set=new HashSet<String>();
//		 String s1="AA";
//		 set.add(s1);
//		 String s2=new String("AA");
//		 System.out.println(set.contains(s2));
	}

}
