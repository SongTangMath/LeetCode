

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q17 {
	private HashMap<Character,String>map;
	private String currentstr;
	
	public Q17() {
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
	}
	private void generate(List<String> list,String digits,int overalllength,int currentpos) {
		if(currentpos<overalllength) {
			//currentpos上可能的所有字符
			String temp=map.get(digits.charAt(currentpos));
			for(int i=0;i<temp.length();i++)
			{
				currentstr=currentstr+temp.charAt(i);
				generate( list, digits, overalllength, currentpos+1); 
			}
		}
		list.add(currentstr);
		
	}
	  public List<String> letterCombinations(String digits) {
		  List<String> list=new ArrayList<String>();
		  generate(list,digits,digits.length(),0);
		  return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
