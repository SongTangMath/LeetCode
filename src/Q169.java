

public class Q169 {
	 public int majorityElement(int[] nums) {
	        int unMatched=0;;
	        int count=0;
	        for(int i=0;i<nums.length;i++) {
	        	if(count==0) {
	        		unMatched=nums[i];
	        		count++;
	        	}
	        	else if(unMatched==nums[i])count++;
	        	else count--;
	        }
	        return unMatched;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]nums= {2,2,1,1,1,1,2};
			System.out.println(new Q169().majorityElement(nums));
	}

}
