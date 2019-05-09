

public class Q153 {
	 public int findMin(int[] nums) {
	        if(nums[0]<nums[nums.length-1])return nums[0];
	        int left=0,right=nums.length-1;
	        
	        //���������б�����С���±���[left,right]��
	        //nums[left]>nums[mid]˵����С���±���[left+1,mid]
        	//nums[mid]>nums[right]˵����С���±���[mid+1,right]
        	//ע�����mid=left.��ʱ����right=left+1
	        //����������nums[left]<=nums[mid]<=nums[right]
	        //��˵��nums[left..right]����,����С�±�����֮��,��Ϊleft
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
