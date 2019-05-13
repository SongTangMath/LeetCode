import java.util.*;
public class Q387 {
	public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new  HashMap<Character,Integer>();
        HashMap<Character,Integer>map1=new  HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++) {
        	 map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        	 if(!map1.containsKey(s.charAt(i)))
        		 map1.put(s.charAt(i), i);
        }
           
        List<Integer>list=new ArrayList<Integer>();
        for(char key:map.keySet())
        	if(map.get(key)==1)list.add(map1.get(key));
        if(!list.isEmpty())return Collections.min(list);
        else return -1;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leetcode";
		System.out.print(new Q387().firstUniqChar(s));
		var list = new ArrayList <String>();
		var y=1;
		int var=2;
		

	}

}
