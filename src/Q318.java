
public class Q318 {
	 public int maxProduct(String[] words) {
		 int n=words.length;if(n<=1)return 0;
	        boolean[][]hasCommonCharacter=new boolean[n][n];
	        for(char ch='a';ch<='z';ch++) {
	        	int numOfWordshasCurrentCharacter=0;
	        	boolean[] hasCurrentCharacter=new boolean[n];
	        	for(int i=0;i<words.length;i++) {
	        		String temp=words[i];
	        		for(int j=0;j<temp.length();j++)
	        			if(temp.charAt(j)==ch) {
	        				numOfWordshasCurrentCharacter++;
	        				hasCurrentCharacter[i]=true;
	        				break;
	        			}
	        	}
	        	if(numOfWordshasCurrentCharacter>=2)
	        		for(int i=0;i<words.length;i++)
	        			for(int j=i+1;j<words.length;j++)
	        				if(hasCurrentCharacter[i]&&hasCurrentCharacter[j])
	        				{
	        					hasCommonCharacter[i][j]=true;
	        					hasCommonCharacter[j][i]=true;
	        				}
	        }
	        int max=0;
	        for(int i=0;i<words.length;i++)
    			for(int j=i+1;j<words.length;j++)
    				if(!hasCommonCharacter[i][j])
	        max=Math.max(max, words[i].length()*words[j].length());
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]words= {"a","aa","aaa","aaaa"};
		System.out.print(new Q318().maxProduct(words));
	}

}
