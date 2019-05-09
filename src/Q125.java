
import java.util.*;
public class Q125 {
	public boolean isAlphanumeric(char ch) {
		if(48<=ch&&ch<=57)return true;
		if(65<=ch&&ch<=90)return true;
		if(97<=ch&&ch<=122)return true;
		return false;
	}
	public boolean isPalindromic(String s) {
		if(s==null||s.length()==0)return true;
		for(int i=0;i<s.length()/2;i++)
			if(s.charAt(i)!=s.charAt(s.length()-1-i))return false;
		return true;
	}
	 public boolean isPalindrome(String s) {
	        return isPalindromic(preprocess(s).toLowerCase());
	    }
public String preprocess(String s) {
	if(s==null)return null;
	if(s.length()==0)return "";
	List<Character>list=new ArrayList<Character>();
	for(int i=0;i<s.length();i++)
		if(isAlphanumeric(s.charAt(i)))
			list.add(s.charAt(i));
	char[]seq=new char[list.size()];
	for(int i=0;i<list.size();i++)seq[i]=list.get(i);
	return new String(seq);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="A man, a plan, a canal: Panama";
			String s1=new Q125().preprocess(s);
			System.out.println(new Q125().isPalindrome(s1));
			List<Integer>list=new ArrayList<Integer>();
			for(int i=0;i<10;i++)list.add(null);
			list.set(3, 10);
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));			
	}

}
