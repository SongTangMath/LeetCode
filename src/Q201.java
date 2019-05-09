
import java.util.*;
public class Q201 {
	  public int rangeBitwiseAnd(int m, int n) {
	        boolean[]bits=new boolean[31];
	        for(int k=0;k<=30;k++) {
	        	if(n-m>=(long)Math.pow(2, k))bits[k]=false;
	        	else {
	        		long a=m%(long)Math.pow(2, k+1);
	        		if(a>=Math.pow(2, k)&&
	        				a+n-m<=(long)Math.pow(2, k+1)-1)
	        			bits[k]=true;
	        	}
	        }
	        int ans=0;
	        for(int k=0;k<=30;k++)
	        	if(bits[k])ans+=(1<<k);
	        return ans;
	    }
	  
	  public boolean isHappy(int n) {
	        HashSet<Integer>set=new HashSet<Integer>();
	        while(n!=1&&!set.contains(n)) {set.add(n);n=nextNum(n);}
	        if(n==1)return true;
	        else return false;
	    }
	  private int nextNum(int n) {
		  
		  int ans=0;
		while(n!=0) {
			int a=n%10;ans+=a*a;n/=10;
		}
		  return ans;
	  }
	  
	  public boolean isIsomorphic(String s, String t) {
	        if(s.length()!=t.length())return false;
	        HashMap<Character,Character>map=new HashMap<Character,Character>();
	        for(int i=0;i<s.length();i++) {
	        	if(map.containsKey(s.charAt(i)))
	        			{
	        			if(map.get(s.charAt(i))!=t.charAt(i))
	        				return false;
	        			
	        	}
	        	//不存在以s.charAt(i)为key的映射项
	        	else if(map.containsValue(t.charAt(i)))return false;
	        	//但是已经有以t.charAt(i)为值的映射项,表示2个不同的key
	        	//会被映为同一个字符,与单射矛盾
	        	else map.put(s.charAt(i), t.charAt(i));
	        }
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new Q201().rangeBitwiseAnd(2147483647,
				//2147483647));
		//System.out.println(Math.pow(2, 2)+" "+Math.pow(2,3));
		System.out.println(new Q201().isHappy(2));
	int a=2;
		Q201 obj=new Q201();
		while(a!=1) {System.out.println(a);a=obj.nextNum(a);}
	}

}
