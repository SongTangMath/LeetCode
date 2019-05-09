

import java.io.Console;

public class Q162 {
	 public int findPeakElement(int[] nums) {
		 if(nums.length==1)return nums[0];
		 if(nums[0]>nums[1])return nums[0];
		 if(nums[nums.length-1]>nums[nums.length-2])return nums[nums.length-1];
		 int left=0,right=nums.length-1;
		 while(left<right) {
			 int mid=(left+right)/2;
			 if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1])return mid;
			 else if(nums[mid]<nums[mid+1])left=mid;
			 else right=mid;
		 }
		 return -1;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []nums= {1,2,3,1};
			System.out.println(new Q162().findPeakElement(nums));
			StringBuilder sb=new StringBuilder("abcd");
			sb.insert(1, 'X');
			System.out.println(sb.toString());
	}

}
