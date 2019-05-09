
import java.util.*;
public class Q133 {
	private HashMap<Integer,UndirectedGraphNode>map;
	  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
	        if(node==null)return null;
	        map=new HashMap<Integer,UndirectedGraphNode>();
	        UndirectedGraphNode curNode=new UndirectedGraphNode(node.label);
	        map.put(curNode.label, curNode);
	        dfs(curNode,node);
	        return curNode;
	    }
	  private void dfs(UndirectedGraphNode curNode,
			  UndirectedGraphNode node) {
		 for(UndirectedGraphNode temp:node.neighbors)
		  if(!map.containsKey(temp.label)) {
			  UndirectedGraphNode next= new UndirectedGraphNode(node.label);
			  map.put(next.label, next);
			  curNode.neighbors.add(next);
			  dfs(next,temp);
			 //感觉这里是java的一个bug,不加这对括号就报错.
			  
		  }
		  else {
			  UndirectedGraphNode next=map.get(node.label);
			  curNode.neighbors.add(next);
			  if(node.label!=temp.label)dfs(next,temp);
		  }
		
		 
		  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndirectedGraphNode node=new UndirectedGraphNode(0);
		node.neighbors.add(node);
		node.neighbors.add(node);
		UndirectedGraphNode node1=new Q133().cloneGraph(node);
		System.out.println(1);
	}

}
