
import java.util.*;
public class Q150 {
	 public int evalRPN(String[] tokens) {
	        Stack<Integer>stack=new Stack<Integer>();
	        for(int i=0;i<tokens.length;i++) {
	        	if(tokens[i].equals("+")) {
	        		int num2=stack.pop();
	        		int num1=stack.pop();
	        		stack.push(num1+num2);
	        	}
	        	else if(tokens[i].equals("-")) {
	        		int num2=stack.pop();
	        		int num1=stack.pop();
	        		stack.push(num1-num2);
	        	}
	        	else if(tokens[i].equals("*")) {
	        		int num2=stack.pop();
	        		int num1=stack.pop();
	        		stack.push(num1*num2);
	        	}
	        	else if(tokens[i].equals("/")) {
	        		int num2=stack.pop();
	        		int num1=stack.pop();
	        		stack.push(num1/num2);
	        	}
	        	else stack.push(Integer.parseInt(tokens[i]));
	        }
	        return stack.pop();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[]tokens= {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
			System.out.println(new Q150().evalRPN(tokens));
	}

}
