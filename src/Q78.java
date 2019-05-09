

import java.util.ArrayList;
import java.util.List;

public class Q78 {
public List<List<Integer>> subsets(int[] nums) {
	List<List<Integer>> totalList=new ArrayList<List<Integer>>();
	List<Integer>list =new ArrayList<Integer>();
	generate(totalList,list,nums,0);
	return totalList;
    }

private void generate(List<List<Integer>> totalList,
		  List<Integer>list,int[] nums,int begin) {
	 if(begin==nums.length) {totalList.add(new ArrayList<Integer>(list));
	 return;}
	 
		  list.add(nums[begin]);
		  generate(totalList,list,nums,begin+1);
		  list.remove(list.size()-1);
		  generate(totalList,list,nums,begin+1);
	  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {};
		List<List<Integer>> totalList=new Q78().subsets(nums);
		for(int i=0;i<totalList.size();i++) {
			List<Integer> temp=totalList.get(i);
			for(int j=0;j<temp.size();j++)System.out.print(temp.get(j));
			System.out.println();
	}

}}
