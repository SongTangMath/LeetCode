

public class Q5 {
	private void findLongestPalindromeSingle(String s,int i){
		int len=1;
		int low=i-1;int high=i+1;
		while(low>=0&&high<s.length()&&s.charAt(low)==s.charAt(high))
		{low--;high++;len+=2;}
		if (len>maxLengthOfSingle){
		maxLengthOfSingle=len;
		longestSingle=s.substring(low+1,high); }}
		private void findLongestPalindromeDouble(String s,int i){
		int len=2;
		int low=i-1;int high=i+2;
		while(low>=0&&high<s.length()&&s.charAt(low)==s.charAt(high))
		{low--;high++;len+=2;}
		if (len>maxLengthOfDouble){
		maxLengthOfDouble=len;
		longestDouble=s.substring(low+1,high);} }

	
	private static int maxLengthOfSingle=0, maxLengthOfDouble=0;
	private static String longestSingle=null,longestDouble=null;

	public String longestPalindrome(String s){
	String answer=null;
	if(s==null)return null;
	if(s.equals(""))return new String("");
	for(int i=0;i<s.length();i++){
	findLongestPalindromeSingle(s,i);
	if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1))
	findLongestPalindromeDouble(s, i);
	}
	if(maxLengthOfSingle > maxLengthOfDouble)answer= longestSingle;
	else answer= longestDouble;
	maxLengthOfSingle=0;
	maxLengthOfDouble=0;
	return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
