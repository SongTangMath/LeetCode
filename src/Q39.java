
import java.util.*;
public class Q39 {
	
		
	private void backtrack(List<List<Integer>>totalSolutions,
			List<Integer>currentList,int res,
			int[]candidates,int minimumindex) {
		if(res==0) {
			totalSolutions.add(new ArrayList<Integer>(currentList));
			return;
		}
		
		for(int i=minimumindex;i<candidates.length;i++) {
			if(candidates[i]<=res) {
				currentList.add(candidates[i]);
				backtrack(totalSolutions,currentList,res-candidates[i],candidates,i);
				currentList.remove(currentList.size()-1);
			}
		}
	}
	
	  public List<List<Integer>> combinationSum(int[] candidates, int target) {
		  List<List<Integer>> totalSolutions=new ArrayList<List<Integer>>();
		  List<Integer>currentList=new ArrayList<Integer>();
		  backtrack(totalSolutions,currentList,target,candidates,0);
		  return totalSolutions;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]candidates = {2,3,6,7};
		int target = 7;
		List<List<Integer>> totalSolutions=new Q39().
				combinationSum(candidates, target);
		for(int i=0;i<totalSolutions.size();i++) {
			List<Integer> list=totalSolutions.get(i);
			for(int j=0;j<list.size();j++)
				System.out.print(" "+list.get(j));
			System.out.println();
		}
	}

}
