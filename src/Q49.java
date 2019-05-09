
import java.util.*;
public class Q49 {
	 public List<List<String>> groupAnagrams(String[] strs) {
		 
		 HashMap<String,List<String>>map=new HashMap<String,List<String>>();
		 for(int i=0;i<strs.length;i++) {
			 char[] seq=strs[i].toCharArray();
			 Arrays.sort(seq);
			 String temp=new String(seq);
			 if(!map.containsKey(temp)) {
				 ArrayList<String> newList=new ArrayList<String>();
				 newList.add(strs[i]);
				 map.put(temp,newList );
			 }
			 else map.get(temp).add(strs[i]);
		 }
		 return new  ArrayList<List<String>>(map.values());
 	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new Q49().anagrams("eat", "ate"));
		String [] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> totalList=new Q49().groupAnagrams(strs);
		System.out.println();
	}

}
