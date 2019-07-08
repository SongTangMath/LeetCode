import java.util.*;

/**
*@author SongTang
*/
public class Q394 {
	 public String decodeString(String s) {
	        Stack<StringBuilder> stack1=new Stack<StringBuilder>();
	        stack1.push(new StringBuilder());
	        //System.out.println("stack1.size():"+stack1.size());
	        Stack<Integer> stack2=new Stack<Integer>();
	        for(int i=0;i<s.length();i++) {
	            if(Character.isDigit(s.charAt(i))) {
	                int beginIndex=i;
	                while(Character.isDigit(s.charAt(i+1)))i++;
	                int endIndex=i+1;
	                stack2.push(Integer.parseInt(s.substring(beginIndex, endIndex)));
	                
	            }
	            else if(s.charAt(i)=='[')stack1.push(new StringBuilder(""));
	            
	            else if(s.charAt(i)==']') {
	               int times=stack2.pop();
	               StringBuilder top=stack1.pop();
	               StringBuilder temp=new StringBuilder();
	               for(int j=0;j<times;j++)temp.append(top);
	               stack1.peek().append(temp);
	               
	            }
	            else {
	                stack1.peek().append(s.charAt(i));
	                
	            }
	            //System.out.println("stack1.size():"+stack1.size());
	        }
	       
	        return stack1.pop().toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    StringBuilder sb=new StringBuilder();
	    String s="2[abc]3[cd]ef";
	    System.out.print(new Q394().decodeString(s));
	}

}
