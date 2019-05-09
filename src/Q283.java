
public class Q283 {
	 public void moveZeroes(int[] nums) {
	        int nextpos=0,begin=0;
	        while(begin<nums.length) {
	        	if(nums[begin]!=0) {nums[nextpos]=nums[begin];nextpos++;}
	        	begin++;
	        }
	        for(int i=nextpos;i<nums.length;i++)nums[i]=0;
	      
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {0,1,0,3,12,0};
		new Q283().moveZeroes(nums);
		for(int i=0;i<nums.length;i++)System.out.println(nums[i]);
	}

}
