

public class Q209 {
public int minSubArrayLen(int s, int[] nums) {
	 if(nums.length==0)return 0;
        int begin=0,end=0,sum=nums[0];
        int minlen=Integer.MAX_VALUE;
        if(sum>=s)return 1;
        while(end<nums.length) {
        	if(nums[end]>=s)return 1;
        	while(sum<s&&end<nums.length-1) {
        		end++;
        		sum+=nums[end];
        	}
        	if(begin==0&&end==nums.length-1&&sum<s)return 0;
        	minlen=Math.min(minlen,end-begin+1);
        	while(sum>=s&&begin<end) {
        		
        		sum-=nums[begin];
        		begin++;
        		
        	}
        	if(begin>0)minlen=Math.min(minlen,end-begin+2);
        	if(end==nums.length-1)break;
        }
        if(minlen==Integer.MAX_VALUE)return 0;
        else return minlen;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=213;
		int[]nums= {12,28,83,4,25,26,25,2,25,25,25,12};
		System.out.println(new Q209().minSubArrayLen(s, nums));
	}

}
