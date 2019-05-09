

public class Q153 {
	 public int findMin(int[] nums) {
	        if(nums[0]<nums[nums.length-1])return nums[0];
	        int left=0,right=nums.length-1;
	        
	        //搜索过程中保持最小项下标在[left,right]中
	        //nums[left]>nums[mid]说明最小项下标在[left+1,mid]
        	//nums[mid]>nums[right]说明最小项下标在[mid+1,right]
        	//注意可能mid=left.此时必有right=left+1
	        //都不成立则nums[left]<=nums[mid]<=nums[right]
	        //这说明nums[left..right]单增,而最小下标在这之中,必为left
	        while(left<right) {
	        	int mid=(left+right)/2;
	        	
	        	
	        	if(nums[left]>nums[mid]) {left++;right=mid;}
	        	else if(nums[mid]>nums[right])left=mid+1;
	        	else return nums[left];
	        	
	        	
	        }
	        return nums[left];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {4,5,6,7,0,1,2};
		System.out.println(new Q153().findMin(nums));
	}

}
