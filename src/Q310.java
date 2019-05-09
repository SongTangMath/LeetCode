import java.util.*;
public class Q310 {
	 public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		  List<HashSet<Integer>>list=new ArrayList<HashSet<Integer>>();
	        for(int i=0;i<n;i++) 
	        	list.add(new HashSet<Integer>());
	        	for(int[]temp:edges) {
	        		list.get(temp[0]).add(temp[1]);
	        		list.get(temp[1]).add(temp[0]);
	        	}
	        	List<Integer>leaves=new ArrayList<Integer>();
	        	for(int i=0;i<list.size();i++)
	        		if(list.get(i).size()==1)leaves.add(i);
	        	while(leaves.size()>2) {
	        		HashSet<Integer>newleaves=new HashSet<Integer>();
	        		for(int curleaf:leaves)
	        		{
	        			int nextPoint=list.get(curleaf).iterator().next();
	        			list.get(nextPoint).remove(curleaf);
	        			list.get(curleaf).remove(nextPoint);
	        			if(list.get(nextPoint).size()==1)
	        			newleaves.add(nextPoint);
	        		}
	        		leaves.clear();
	        		leaves.addAll(newleaves);
	        	}
	        	return leaves;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int[][]edges = {{0,1},{1,2},{2,3},{0,4},{4,5},{4,6},{6,7}};
		List<Integer> list=new Q310().findMinHeightTrees(n, edges);
		for(int temp:list)System.out.print(temp+" ");
	}

}
