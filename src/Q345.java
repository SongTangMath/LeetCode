import java.util.*;
public class Q345 {
public String reverseVowels(String s) {
       char[] ans=s.toCharArray();
       int i=0,j=ans.length-1;
       while(i<j) {
       while(i<j&&!isVowel(ans[i]))i++;
       while(i<j&&!isVowel(ans[j]))j--;
       char temp=ans[i];
       ans[i]=ans[j];
       ans[j]=temp;
       i++;j--;
    }return new String(ans);
       }
	public boolean isVowel(char ch) {
		return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
				||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		System.out.print(new Q345().reverseVowels(s));
	}

}
