import java.util.*;
public class Q90 {
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	        Arrays.sort(nums);
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
	        while(begin<nums.length-1&&nums[begin]==nums[begin+1])begin++;
			  generate(totalList,list,nums,begin+1);
		  
	}

}
