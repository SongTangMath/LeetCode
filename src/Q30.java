
import java.util.*;
public class Q30 {
	 public List<Integer> findSubstring(String s, String[] words) {
		 
		 List<Integer> list=new ArrayList<Integer>();
		 if(words==null||words.length==0)return list;
		 HashMap<String,Integer>map=new HashMap<String,Integer>();
		 for(int i=0;i<words.length;i++)
			 if(!map.containsKey(words[i]))map.put(words[i], 1);
			 else map.put(words[i], map.get(words[i])+1);
		
		 
		 for(int i=0;i<=s.length()- words.length*words[0].length();i++) {
			 String temp=s.substring(i,i+ words.length*words[0].length());
			 HashMap<String,Integer>mapstr=new HashMap<String,Integer>();
			 for(int j=0;j<words.length;j++) {
		String str1=temp.substring(j*words[0].length(), (j+1)*words[0].length());
		if(!map.containsKey(str1))break;
				 if(!mapstr.containsKey(str1))
						 mapstr.put(str1, 1);
				 else mapstr.put(str1, mapstr.get(str1)+1);}
			 if (mapstr.equals(map))list.add(i); 
		 }
		 	return list;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wordgoodgoodgoodbestword";
		String []words= {"word","good","best","good"};
		new Q30().findSubstring(s, words);
	}

}
