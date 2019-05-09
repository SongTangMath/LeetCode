import java.util.*;
public class TsMath {
	public String addWithoutLeadingZeros(String s,String t) {
		int[]num1=new int[s.length()];
		int[]num2=new int[t.length()];
		for(int i=0;i<s.length();i++)num1[i]=s.charAt(s.length()-1-i)-'0';
		for(int i=0;i<t.length();i++)num2[i]=t.charAt(t.length()-1-i)-'0';
		int len=Math.max(s.length(), t.length())+1;
		int[]ans =new int[len];
		for(int i=0;i<len;i++)ans[i]=0;
		for(int i=0;i<len;i++) {
			if(i<s.length())ans[i]+=num1[i];
			if(i<t.length())ans[i]+=num2[i];
			if(ans[i]>=10) {
				ans[i+1]++;
				ans[i]-=10;
			}
		}
		StringBuilder ab=new StringBuilder("");
		for(int i=0;i<len;i++)ab.append(ans[i]);
		ab.reverse();
		if(ab.charAt(0)=='0')ab.delete(0, 1);
		return ab.toString();

	}
	public String add(String s,String t) {
		int index1=0,index2=0;
		while(index1<s.length()&&s.charAt(index1)=='0')index1++;
		while(index2<t.length()&&t.charAt(index2)=='0')index2++;
		s=s.substring(index1);
		t=t.substring(index2);
		if(s.equals("")) {
			
			if(t.equals(""))return "0";
			else return t;
			}
		if(t.equals(""))return s;
		return addWithoutLeadingZeros(s,t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="",t="";
		System.out.print(new TsMath().add(s, t));
	}

}
