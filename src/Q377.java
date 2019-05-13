
public class Q377 {
	 public int combinationSum4(int[] nums, int target) {
		 int n=nums.length;
	        int[]ans=new int[target+1];
	        //for(int i=1;i<=target;i++)ans[i]=-1;
	        ans[0]=1;
	        for(int i=1;i<=target;i++){
	        	int temp=0;
	        	 for(int j=0;j<n;j++)
	        if(i>=nums[j]&&ans[i-nums[j]]!=-1)temp+=ans[i-nums[j]];
	       ans[i]=temp;
			}
			
	       return ans[target];
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {3,33,333};int target=10000;
		System.out.print(new Q377().combinationSum4(nums, target));
	}

}
