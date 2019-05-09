

import java.util.*;

public class Q127 {
	public boolean isOneLetterDif(String s,String t) {
		if(s.length()!=t.length())return false;
		int count=0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)!=t.charAt(i))count++;
		return (count==1);
	}
	 public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		 int index=0;
		   
		    if(wordList.size()==0)return 0;
		    while(index<wordList.size()&&!wordList.get(index).equals(endWord))index++;
		    if(index>=wordList.size())return 0;//目标单词不在单词本中
		    //现在beginWord作为0号顶点建立图
		    	
		    Queue<String>queue=new LinkedList<String>();
		    queue.add(beginWord);
		    HashMap<String,Integer>map=new HashMap<String,Integer>();
		    boolean[]visited=new boolean[wordList.size()];
		    map.put(beginWord, 1);
		    while(!queue.isEmpty()) {
		    	for(int i=0;i<wordList.size();i++)
		    		if(!visited[i]&&
		    				isOneLetterDif(queue.peek(),wordList.get(i))) {
		    			queue.add(wordList.get(i));
		    			visited[i]=true;
		    			if(i==index)return map.get(queue.peek())+1;
		    			map.put(wordList.get(i), map.get(queue.peek())+1);
		    			
		    		}
		    	queue.poll();		    }
		    if(!visited[index])return 0;
		    else return map.get(beginWord)+1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginWord = "set",
				endWord = "oar";
		String[] strs=
				{"oar","sat","dip","sir","lap","tat","off","din","caw",
						"hob","lie","tam","wyo","noe","rob","nay","hah",
						"box","mac","low","tin","tip","set","geo","too",
						"tea","fin","tad","zed","key","ray","shy","min",
						"kin","rep","now","ink","fag","fed","pas","huh",
						"bad","oks","pan","kip","inc","bat","pop","pat",
						"aol","cud","tan","car","hut","oat","gap","hes",
						"hen","chi"};
				List<String>wordList =new ArrayList<String>(Arrays.asList(strs));
				int ret=new Q127().ladderLength(beginWord, endWord, wordList);
				System.out.println(ret);
	}

}
