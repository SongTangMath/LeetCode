
import java.util.*;
public class Q32 {
	  public int longestValidParentheses(String s) {
	        if(s==null||s.length()==0)return 0;
	        Stack<Integer>stack=new Stack<Integer>();
	        int pos=0;while(pos<s.length()) {
	        	if(s.charAt(pos)==')'&&!stack.empty()&&s.charAt(stack.peek())=='(')
	        		stack.pop();
	        	else stack.push(pos);
	        
	        	pos++;}
	        	if(stack.empty())return s.length();
	        	int maxlength=0;
	        	int top=s.length();
	        	while(!stack.empty()) {
	        		maxlength=Math.max(maxlength, top-stack.peek()-1);
	        		top=stack.pop();	        	
	    }
	        	maxlength=Math.max(maxlength, top);	        	
	        	return maxlength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(new Q32().longestValidParentheses("(()"));
	}

}
