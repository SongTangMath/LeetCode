

public class Q154 {
public int findMin(int[] nums) {
	if(nums.length==1)return nums[0];
        int left=0,right=nums.length-1;
        while(left<right&&nums[left]==nums[right])left++;
        if(left==right)return nums[left];
        else if(nums[left]<nums[right])return nums[left];
        else {
        while(nums[left]>nums[right]) {
        	int mid=(left+right)/2;
        	if(nums[left]>nums[mid]) {
        		left++;right=mid;
        	}
        	else left=mid+1;
        }
        return nums[left];
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]nums= {3,3,1,2,3};
			System.out.println(new Q154().findMin(nums));
	}

}
