import java.util.*;
public class Q336 {
	
	
	private boolean isPalindromic(String s,int i,int j)
	{
	if(i>j||i>=s.length())return true;
	
	for(int k=i;k<=(i+j)/2;k++)
	if(s.charAt(k)!=s.charAt(i+j-k))return false;
	return true;
	}

	 public void addWords(Q336TrieNode root ,String[] words) {
		 Q336TrieNode node=root;
		 for(int k=0;k<words.length;k++) {
			 String word=words[k];
			 for(int i=0;i<word.length();i++) {
				 if(isPalindromic(word,i,word.length()-1))node.list.add(k);
		        	char ch=word.charAt(i);
		        	if(node.children[ch-'a']==null)
		        		node.children[ch-'a']=new Q336TrieNode();
		        	node=node.children[ch-'a'];
		        	
		        }
			 	node.list.add(k);
		        node.index=k;
		        node=root;
		 }
	       
	    }
	 public List<Integer> formPalindrome(Q336TrieNode root, String word){
		 List<Integer>list=new ArrayList<Integer>();
		 Q336TrieNode node=root;
		 int j=0;
		 for(j=word.length()-1;j>=0;j--)
		 {
			 if(node.index!=-1&&isPalindromic(word,0,j))
				 list.add(node.index);
			 if(node.children[word.charAt(j)-'a']!=null)
				 node=node.children[word.charAt(j)-'a'];
			 else	return list;
			 
				
		 }
		 list.addAll(node.list);
		return list;
	 }
	 public List<List<Integer>> getPalindromePairs(Q336TrieNode root,String[] words) {	        
	    
		  List<List<Integer>>ans=new ArrayList<List<Integer>>();
		 for(int j=0;j<words.length;j++)
		 {
			 List<Integer>list=formPalindrome(root,words[j]);
			 if(!list.isEmpty()) {
				 for(int temp:list)
					 //注意题设要求i,j不同所以这里判断一下
					if(temp!=j) ans.add(new ArrayList<Integer>(Arrays.asList(temp,j)));
			 }
		 }
		 return ans;
	 }
	 public List<List<Integer>> palindromePairs(String[] words) {
		 Q336TrieNode root=new Q336TrieNode ();
		 addWords(root,words);
		 return getPalindromePairs(root,words);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]words= {"abcd","dcba","lls","s","sssll"};
		List<List<Integer>>totalList=new Q336().palindromePairs(words);
		for(List<Integer>list:totalList) {
			for(int temp:list)System.out.print(temp);
			System.out.println();
		}
	}

}
class Q336TrieNode{
	public int index;
	public List<Integer>list;
	public Q336TrieNode[] children;
	public Q336TrieNode() {
		index=-1;
		children=new Q336TrieNode[26];
		list=new ArrayList<Integer>();
	}
}