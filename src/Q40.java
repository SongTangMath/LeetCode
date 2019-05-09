

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Q40 {
	public  List removeDuplicate(List list) {   
	    HashSet h = new HashSet(list);   
	    list.clear();   
	    list.addAll(h);   
	    return list;   
	}   

	private void backtrack(List<List<Integer>>totalSolutions,
			List<Integer>currentList,int res,
			int[]candidates,int minimumindex) {
		if(res==0) {
			totalSolutions.add(new ArrayList<Integer>(currentList));
			return;
		}
		
		for(int i=minimumindex;i<candidates.length;i++) {
			if(candidates[i]<=res) {
				if(i==minimumindex||candidates[i-1]!=candidates[i]) {
				currentList.add(candidates[i]);
				backtrack(totalSolutions,currentList,res-candidates[i],candidates,i+1);
				currentList.remove(currentList.size()-1);
			}}
		}
	}
	
	  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		  List<List<Integer>> totalSolutions=new ArrayList<List<Integer>>();
		  List<Integer>currentList=new ArrayList<Integer>();
		  Arrays.sort(candidates);
		  backtrack(totalSolutions,currentList,target,candidates,0);
		  return totalSolutions;
		  //return removeDuplicate(totalSolutions);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]candidates = {10,1,2,7,6,1,5};
		int target = 8;
		List<List<Integer>> totalSolutions=new Q40().
				combinationSum2(candidates, target);
		for(int i=0;i<totalSolutions.size();i++) {
			List<Integer> list=totalSolutions.get(i);
			for(int j=0;j<list.size();j++)
				System.out.print(" "+list.get(j));
			System.out.println();
		}
	}

}
