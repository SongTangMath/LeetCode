

public class Q53 {
	 public int maxSubArray(int[] nums) {
	        int []maxEndWith=new int[nums.length];
	        maxEndWith[0]=nums[0];
	        for(int i=1;i<nums.length;i++) {
	        	if(maxEndWith[i-1]<=0)maxEndWith[i]=nums[i];
	        	else maxEndWith[i]=maxEndWith[i-1]+nums[i];
	        }
	        int max=maxEndWith[0];
	        for(int i=1;i<nums.length;i++) max=Math.max(max, maxEndWith[i]);
	        return max;
	        	
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]nums= {-2,1,-3,4,-1,2,1,-5,4};
			System.out.println(new Q53().maxSubArray(nums));
	}

}
