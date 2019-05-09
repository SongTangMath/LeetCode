
public class Q211 {
	private TrieNode root;
	public Q211() {
	root=new TrieNode();
	}
	 public void addWord(String word) {
		 TrieNode node=root;
	        for(int i=0;i<word.length();i++) {
	        	char ch=word.charAt(i);
	        	if(node.children[ch-'a']==null)
	        		node.children[ch-'a']=new TrieNode();
	        	node=node.children[ch-'a'];
	        	
	        }
	        node.isWord=true;
	    }
	    
	    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
	    public boolean search(String word) {
	        return search(word,0,root);
	    }
	    private boolean search(String word,int index,TrieNode node) {
	    	if(index==word.length())
	    		return node.isWord;
	    	else if(word.charAt(index)=='.') {
	    		for(int i=0;i<26;i++)
	    			if(node.children[i]!=null&&search(word,index+1,node.children[i]))return true;
	    	}
	    	else {
	    		char ch=word.charAt(index);
	    		return (node.children[ch-'a']!=null&&search(word,index+1,node.children[ch-'a']));
	    	}
	    			
	    	return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class TrieNode{
	public boolean isWord;
	public TrieNode[] children;
	public TrieNode() {
		children=new TrieNode[26];
	}
}
