

import java.util.HashMap;

public class Q13 {
	  public int romanToInt(String s) {
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);
		int ret=0;
		for(int i=0;i<s.length();i++) {
			if(i+1<s.length()&&map.get(s.charAt(i))<map.get(s.charAt(i+1)))
			ret-=map.get(s.charAt(i));
			else ret+=map.get(s.charAt(i));
		}
		return ret;
	    }
	    
	  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q13().romanToInt("MCMXCIV"));
	}

}
