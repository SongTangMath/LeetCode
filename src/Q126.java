
import java.util.*;
public class Q126 {
public boolean isOneLetterDif(String s,String t) {
	if(s.length()!=t.length())return false;
	int count=0;
	for(int i=0;i<s.length();i++)
		if(s.charAt(i)!=t.charAt(i))count++;
	return (count==1);
}

public List<List<String>> findLadders
(String beginWord, String endWord, List<String> wordList) {
    int index=1;
    List<List<String>> ladders=new ArrayList<List<String>>();
    if(wordList.size()==0)return ladders;
    while(index<=wordList.size()&&!wordList.get(index-1).equals(endWord))index++;
    if(index>wordList.size())return ladders;//目标单词不在单词本中
    //现在beginWord作为0号顶点建立图
    wordList.add(0, beginWord);
    boolean[][]G=new boolean[wordList.size()][wordList.size()];
    for(int i=0;i<wordList.size();i++)
    	 for(int j=0;j<wordList.size();j++)
    		 if(isOneLetterDif(wordList.get(i),wordList.get(j)))G[i][j]=true;
    List<List<Integer>>previous=new ArrayList<List<Integer>>();
    for(int i=0;i<wordList.size();i++)previous.add(null);
    boolean[] visited=new boolean[wordList.size()];
    visited[0]=true;
    int[] steps=new int[wordList.size()];
    int curstep=0;
    int foundnew=1;
    while(foundnew>0) {foundnew=0;curstep++;
    boolean[]previsited=new boolean[wordList.size()];
    for(int i=0;i<wordList.size();i++)
    	if(visited[i]) {
   	 for(int j=0;j<wordList.size();j++)
   		 if(!visited[j]&&G[i][j]) {
   			 foundnew++;
   			 previsited[j]=true;
   			 if(previous.get(j)==null) {
   				 List<Integer>list=new ArrayList<Integer>();
   				 list.add(i);
   				 previous.set(j, list);
   			 }
   			 else previous.get(j).add(i);
   			 
   		 }
    	}
    for(int k=0;k<wordList.size();k++)if(previsited[k]) {visited[k]=true;
    steps[k]=curstep;
    }
    }
    if(!visited[index])return ladders;
    List<List<Integer>>totalList=new ArrayList<List<Integer>>();
    List<Integer>curList=new ArrayList<Integer>();
    curList.add(index);
    generateList(totalList,curList,index,previous);
    for(int i=0;i<totalList.size();i++)reverseList(totalList.get(i));
    for(int i=0;i<totalList.size();i++) {
		List<String>temp=new ArrayList<String>();
		for(int j=0;j<totalList.get(i).size();j++)
			temp.add(wordList.get(totalList.get(i).get(j)));
		ladders.add(temp);
	}
return ladders;
    
}
	public void generateList
	(List<List<Integer>>totalList,List<Integer>curList,
			int index,List<List<Integer>>previous){
		if(index<0||index>=previous.size())return;
		List<Integer> temp=previous.get(index);
		if(temp==null||temp.size()==0) 
		{ totalList.add(new ArrayList<Integer>(curList));return;}
		for(int i:temp) {
			curList.add(i);
			generateList(totalList,curList,i,previous);
			curList.remove(curList.size()-1);
		}
	}
	public void reverseList(List list) {
		List newList=new ArrayList();
		for(int i=0;i<list.size();i++) newList.add(list.get(list.size()-1-i));
		for(int i=0;i<list.size();i++)list.set(i, newList.get(i));
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginWord = "hot",
				endWord = "dog";
		String[] strs={"hot","dog"};
				List<String>wordList =new ArrayList<String>(Arrays.asList(strs));
				new Q126().findLadders(beginWord, endWord, wordList);
	}

}
