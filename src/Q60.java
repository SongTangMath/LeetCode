
import java.util.*;
public class Q60 {
	 public String getPermutation(int n, int k) {
	        int[] nums=new int[n];
	        for(int i=0;i<n;i++)nums[i]=i+1;
	        List<Integer> list=permute(nums).get(k-1);
	        String s="";
	        for(int i=0;i<n;i++)s=s+list.get(i);
	        return s;
	    }
	    
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
		System.out.println(new Q60().getPermutation(4, 4));
	}

}
