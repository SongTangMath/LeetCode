

public class Q55 {
	 public boolean canJump(int[] nums) {
	     
			if(nums.length==1)return true;
			if(nums[0]==0)return false;
			if(nums[0]>=nums.length)return true;
			int curmax=nums[0];
			
			int lastmax=0;
			while(lastmax<curmax&&curmax<nums.length) {
				int max=lastmax+1+nums[lastmax+1];
				for(int i=lastmax+1;i<=curmax;i++)
					max=Math.max(max, nums[i]+i);
				if(max>=nums.length)max=nums.length-1;
				lastmax=curmax;curmax=max;
							}
			if(curmax==nums.length-1)return true;
			else return false;
			
	   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {2,0};
		System.out.println(new Q55().canJump(nums));
	}

}
