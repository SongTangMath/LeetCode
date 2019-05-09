
import java.util.*;
public class Q46 {
	 public List<List<Integer>> permute(int[] nums) {
		 List<List<Integer>> totalList=new ArrayList<List<Integer>>();
		 if(nums==null||nums.length==0)return totalList;
		 boolean[]used=new boolean[nums.length];
		 List<Integer>list=new ArrayList<Integer>();
		 fillNext(totalList,list,nums,used);
		 return totalList;
	    }
	 private void fillNext(List<List<Integer>> totalList,
			 List<Integer> curList,int[] nums,boolean[]used) {
		 if(curList.size()==nums.length)
			 totalList.add(new ArrayList<Integer>(curList));
		 else {
			 for(int i=0;i<nums.length;i++) {
				 if(!used[i]) {
				 curList.add(nums[i]);
				 used[i]=true;
				 fillNext(totalList,curList,nums,used);
				 used[i]=false;
				 curList.remove(curList.size()-1);
			 }}
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3};
		List<List<Integer>> totalList=new Q46().permute(nums);
		for(int i=0;i<totalList.size();i++) {
			List<Integer> list=totalList.get(i);
			for(int j=0;j<list.size();j++)
				System.out.print(list.get(j));
			System.out.println();
		}
	}

}
