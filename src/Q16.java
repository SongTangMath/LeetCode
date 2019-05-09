

import java.util.Arrays;

public class Q16 {
	  public int threeSumClosest(int[] nums, int target) {
	        Arrays.sort(nums);
	        if(nums.length<=3)return 0;
	        int currentbestsum=nums[0]+nums[1]+nums[2];
	        int currentdist=Math.abs(target-currentbestsum);
	        for(int i=0;i<=nums.length-3;i++) {
	        	int low=i+1,high=nums.length-1;
	        	while(low<high) {
	        		//首先更新值然后决定下一步搜索路径
	        		if(Math.abs(nums[low]+nums[high]+nums[i]-target)<currentdist)
	        		{
	        			currentdist=Math.abs(nums[low]+nums[high]+nums[i]-target);
	        			currentbestsum=nums[low]+nums[high]+nums[i];
	        		}
	        		if(nums[low]+nums[high]+nums[i]==target)return target;
	        		if(nums[low]+nums[high]+nums[i]<target)low++;
	        		if(nums[low]+nums[high]+nums[i]>target)high--;
	        	}
	        	
	        }
	        return currentbestsum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
