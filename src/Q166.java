
import java.util.*;
public class Q166 {
	 public String fractionToDecimal(int numerator, int denominator) {
	        if(numerator==0)return "0";
	        int sign=1;
	       long numerator1=(long)numerator;
	       long denominator1=(long)denominator;
	        if(numerator1>0&&denominator1<0)sign =-1;
	        if(numerator1<0&&denominator1>0)sign=-1;
	        String integerPart="";
	        if(sign==-1)integerPart="-";
	        if(numerator1<0)numerator1=-numerator1;
	        if(denominator1<0)denominator1=-denominator1;
	        integerPart+=numerator1/denominator1;
	        long num=numerator1%denominator1;
	        if(num==0)return integerPart;
	        
	        HashMap<Long,Integer>map=new HashMap<Long,Integer>();
	        map.put(num, 0);
	        num*=10;
	        StringBuilder decimalPart=new StringBuilder("");
	        int index=1;
	        while(true) {
	        	//aÎªÓàÊý
	        	Long a=num%denominator1;
	        	
	        	num=num/denominator1;
	        	
	        	if(a==0) {
	        		decimalPart.append(num);
	        		return integerPart+"."+decimalPart.toString();
	        	}
	        	if(!map.containsKey(a)) {
	        		decimalPart.append(num);
	        		map.put(a, index++);
	        	num=10*a;	        	
	        	}
	        	else {
	        		int index1=map.get(a);
	        		decimalPart.append(num);
	        		decimalPart.insert(index1, "(");
	        		decimalPart.append(")");
	        		return integerPart+"."+decimalPart.toString();
	        	}
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q166().fractionToDecimal(-1, -2147483648));
	}

}
