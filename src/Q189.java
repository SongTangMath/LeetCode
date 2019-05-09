

public class Q189 {
	 public void rotate(int[] nums, int k) {
	        if(nums.length<=1)return;
	        k=k%nums.length;
	        if(k==0)return;
	        int[]b=new int[nums.length];
	        for(int i=0;i<=nums.length-1-k;i++)b[i+k]=nums[i];
	        for(int i=nums.length-k;i<=nums.length-1;i++)b[i-nums.length+k]=nums[i];
	        for(int i=0;i<=nums.length-1;i++)nums[i]=b[i];
	        		
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {-1,-100,3,99};
		int k=2;
		new Q189().rotate(nums, k);
		for(int i=0;i<nums.length;i++)System.out.print(nums[i]+" ");
	}

}
