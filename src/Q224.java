
import java.util.*;
public class Q224 {
public int calculate(String s) {
	return evalRPN(toRPN(s));
        
    }
private String[] toRPN(String s) {
	List<String>list=new ArrayList<String>();
	Stack<Character>stack=new Stack<Character>();
	//这里有个问题.负号可能表示减法运算或者负号.
	//但是题设保证数字非负.	
	boolean isSymbol=false;
	s=s.replaceAll(" ","");
	int sign=1;
	for(int i=0;i<s.length();i++) {		
	switch(s.charAt(i)) {
			case '(':			
			stack.push(s.charAt(i));			
			
			//左括号直接入栈
			break;			
			case '*':
			case '/':
			case '+':
			
				while(!stack.isEmpty()&&stack.peek()!='('&&
				compare(stack.peek(),s.charAt(i))>=0)
					list.add(stack.pop()+"");
				stack.push(s.charAt(i));
				
				//四则运算则栈中左括号之前的优先级高的都出栈,然后当前符号入栈.
				break;
			case '-':
				//前面一个字符不是数字,是运算符,说明这里的'-'是负号而不是减号
				if(i>0&&!
						Character.isDigit(s.charAt(i-1)))
				{sign=-1;}
				
				else {
					while(!stack.isEmpty()&&stack.peek()!='('&&
							compare(stack.peek(),s.charAt(0))>=0)
								list.add(stack.pop()+"");
							stack.push(s.charAt(i));
				}
				
				
				break;
			case ')':
				while(!stack.isEmpty()&&stack.peek()!='(')
					list.add(stack.pop()+"");
				stack.pop();
				//左括号以及之前的都出栈.
				
				break;
				default:
					//是数字.读取下一个整数
					{
						int index=i;
						while(index<s.length()&&Character.isDigit(s.charAt(index)))
							index++;
						String num=s.substring(i, index);
						
						if(sign==1)list.add(num);
						else list.add("-"+num);
						sign=1;i=index-1;
						
					}
					break;				
			
			}		
		}
		
	while(!stack.isEmpty())list.add(stack.pop()+"");
	String[] ans=new String[list.size()];
	list.toArray(ans);
	return ans;
}
private int getPriority(char c) {
	if(c=='*'||c=='/')return 1;
	else return 0;
}
private int compare(char c1,char c2) {
	return getPriority(c1)-getPriority(c2);
}

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
		String s="1 - -1*-6";
		String[]ans=new Q224().toRPN(s);
		//for (String temp:ans)System.out.print(temp+" ");
		System.out.println(new Q224().evalRPN(ans));
	}

}
