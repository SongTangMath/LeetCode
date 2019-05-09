
public class AddString {
public String add(String s,String t) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="999",t="1";
		System.out.print(new AddString().add(s, t));
	}

}
