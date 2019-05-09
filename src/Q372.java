import java.math.BigInteger;
import java.util.*;
public class Q372 {
public int superPow(int a, int[] b) {
	StringBuilder indexString=new StringBuilder("");
	for(int i=0;i<b.length;i++)indexString.append(b[i]);
        BigInteger index=new BigInteger(indexString.toString());
        BigInteger fixVal=new BigInteger("1141");
        while(index.compareTo(fixVal)>0) {
        	BigInteger x=index.divide(fixVal);
        	BigInteger y=index.mod(fixVal);
        	index=x.add(y);
        }
        int power=index.intValue();
        int ans=1;
        for(int i=0;i<power;i++) {
        	ans*=a;
        	ans%=1337;
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1048576%1337);
		int[]b= {2,0};
		int a=2;
		System.out.print(new Q372().superPow(a, b));
	}

}
