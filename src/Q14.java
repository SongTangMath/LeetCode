

public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        String ret=new String("");
        if(strs.length==0)return ret;
        int i=0;
        while(true){
            for(int j=0;j<strs.length;j++)if(i>=strs[j].length())return ret;
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++)if(strs[j].charAt(i)!=ch)return ret;
            ret=ret+ch;
                i++;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
