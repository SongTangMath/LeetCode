

public class Q152 {
	  public int maxProduct(int[] nums) {
	        int[]a=new int[nums.length];
	        int[]b=new int[nums.length];
	        a[0]=nums[0];b[0]=nums[0];
	        for(int i=1;i<nums.length;i++) {
	        	if(nums[i]==0) {
	        		a[i]=0;
	        		b[i]=0;
	        	}
	        	else if(nums[i]>0) {
	        		a[i]=Math.max(nums[i],nums[i]*a[i-1]);
	        				b[i]=Math.min(nums[i],nums[i]*b[i-1]);

	        	}
	        	else {
	        		a[i]=Math.max(nums[i],nums[i]*b[i-1]);
	        				b[i]=Math.min(nums[i],nums[i]*a[i-1]);

	        	}
	        	
	        }
	        int max=a[0];
	        for(int i=1;i<nums.length;i++)
	        	if(max<a[i])max=a[i];
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]nums= {-2,0,-1};
			System.out.println(new Q152().maxProduct(nums));
	}

}
