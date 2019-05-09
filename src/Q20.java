
import java.util.*;
public class Q20 {
	 public boolean isValid(String s) {
		 Stack<Character>ss=new  Stack<Character>();
		 int count=0;
		 if(s.length()==0)return true;
		 while(count<s.length()) {
			 switch(s.charAt(count)) {
			 case '(':ss.push('(');count++;break;
			 case '[':ss.push('[');count++;break;
			 case '{':ss.push('{');count++;break;
			 case ')':if(ss.isEmpty()==true||ss.pop()!='(')return false;count++;break;
			 case ']':if(ss.isEmpty()==true||ss.pop()!='[')return false;count++;break;
			 case '}':if(ss.isEmpty()==true||ss.pop()!='{') return false;count++;break;
			 }
		 }
		 if(ss.isEmpty())return true;
		 else return false;
		 
		
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character c1=new Character('(');
		Character c2=new Character('(');
		Character c3='(';
		Character c4='(';
		System.out.println(c1.equals(c2));
		System.out.println(c1==c2);
		System.out.println(c3==c4);
		System.out.println(new Q20().isValid("()"));
	}

}
