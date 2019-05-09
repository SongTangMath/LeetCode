import java.util.Stack;

public class Q7 {
	 public int reverse(int x) {
	        int sgn;
	        if(x==0||x==-2147483648)return 0;
	        
	if(x>0)sgn=1;
	
	else {sgn=-1;x=-x;}
	while(x%10==0)x/=10;
	//这里有2个坑.如果在x==0的时候不直接返回,传入参数为0的时候在这里会死循环.
	//在x为-2147483648的时候x无法被正确地变成x绝对值
	Stack<Integer> stack=new Stack<Integer>();
	while(x!=0){stack.add(x%10);x/=10;} 
	int ret=0;
	int pos=1;
	String test=new String("");
	//手动检测溢出,范围-2147483648~2147483647是10位数
	//只在输入为10位数的时候进行比较否则会出现"321">"1234"型的错误
	boolean needCheck=(stack.size()>=10);
	
	while(!stack.isEmpty())
	{
		int temp=stack.pop();
		ret+=pos*temp;
		test=temp+test;
	pos*=10;
	} 
	if(sgn==1) {
		//System.out.println(test);
		if(needCheck&&test.compareTo("2147483647")>=1)return 0;
		return ret;}
	
	else if (sgn==-1) {ret=-ret;
	if(needCheck&&test.compareTo("2147483648")>=1)return 0;
	//System.out.println("-"+test);
	return ret; }
	return 0;}
public static void main(String[]args) {
	System.out.println(new Q7().reverse(-2147483648));
	//System.out.println("7463847412".compareTo("2147483647"));
}


}
