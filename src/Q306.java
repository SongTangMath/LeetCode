import java.math.BigInteger;

public class Q306 {
public boolean isAdditiveNumber(String num) {
	for(int i=1;i<num.length();i++)
		for(int j=i+1;j<num.length();j++)
			if(isValid(num,i,j))return true;
	return false;
        
    }
private boolean isValid(String num,int i,int j) {
	if(j>=num.length())return false;
	//根据要求后面还要有数
	
	String s=num.substring(0,i),t=num.substring(i,j);
	
	if(
			(s.length()>1&&s.charAt(0)=='0')||
			(t.length()>1&&t.charAt(0)=='0'))
		return false;
	BigInteger num1=new BigInteger(s),num2=new BigInteger(t);
	num=num.substring(j);
	while(num.length()>0) {
		BigInteger prefix=num1.add(num2);
		String prefixString=prefix+"";
		if(!num.startsWith(prefixString))return false;
		num1=num2;num2=prefix;num=num.substring(prefixString.length());
		
	}
	return true;
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print(Integer.parseInt("0123"));
		//System.out.print(new Q306().isValid("112358", 1, 2));
		String num="121474836472147483648";
		System.out.print(new Q306().isAdditiveNumber(num));
	}

}
