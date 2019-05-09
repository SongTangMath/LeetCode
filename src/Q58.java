
public class Q58 {
public int lengthOfLastWord(String s) {
        s=s.trim();
        if(s.length()==0)return 0;
        else return s.length()-s.lastIndexOf(' ')-1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q58().lengthOfLastWord("Hello World  "));
	}

}
