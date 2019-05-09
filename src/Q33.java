

public class Q33 {
	
	private int findPivot(int[]nums) {
		if(nums==null)return -1;
		int low=0,high=nums.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(nums[low]>nums[mid]) {low++;high=mid;}
			else if(nums[high]<nums[mid]) low=mid+1;
			
			else return low;
		}
		return low;
	}
	
	  public int search(int[] nums, int target) {
		  if(nums==null||nums.length==0)return -1;
		  int pivot=findPivot(nums);
		  if(nums[pivot]==target)return pivot;
		  
		  if(nums[pivot]>target)  return -1;
		  
		   
			  int low=pivot,high=nums.length;
			  while(low<high) {
				  int mid=(low+high)/2;
					if(target==nums[mid]) return mid;
					else if(target>nums[mid])low=mid+1;
					else high=mid;
			  }
			  
				  int lo=0,hi=pivot;
				  while(lo<hi) {
					  int mi=(lo+hi)/2;
						if(target==nums[mi]) return mi;
						else if(target>nums[mi])lo=mi+1;
						else hi=mi;
				  }
			  
		  
		  return -1;
	        
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {4,5,6,7,0,1,2};
		
		int[]nums1= {3,5,1};
		System.out.println(new Q33().search(nums1,3));
	}

}
