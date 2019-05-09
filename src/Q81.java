public class Q81 {
	 public boolean search(int[] nums, int target) {
		 if(nums==null||nums.length==0)
	        return false;
		 int pivot=findpivot(nums);
		 int low=0,high=pivot;
		 while(low<high) {
			 int mid=(low+high)/2;
			 if(nums[mid]==target)return true;
			 else if(nums[mid]<target)low=mid+1;
			 else high=mid;
		 }
		 low=pivot;high=nums.length;
		 while(low<high) {
			 int mid=(low+high)/2;
			 if(nums[mid]==target)return true;
			 else if(nums[mid]<target)low=mid+1;
			 else high=mid;
		 }
		 return false;
	    }
	 private int findpivot(int[] nums) {
		 int low=0,high=nums.length-1;
		 if(nums[low]<nums[high])return 0;
		 while(nums[low]==nums[high]&&low<high)low++;
		 if(low==high)return 0;//此时是个常数列.
		 
		 while(nums[low]>nums[high]) {
			 int mid=(low+high)/2;
			 if(nums[low]>nums[mid]) {
				 low++;high=mid;
			 }
			 else 
				 low=mid+1;
			 
		 }
		 return low;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {5,6,7,8,1,2,3,4,4,5,5};
		System.out.println(new Q81().findpivot(nums));
		System.out.println(new Q81().search(nums,9));
	}

}
