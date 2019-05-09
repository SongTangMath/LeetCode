

public class Q80 {
	 public int removeDuplicates(int[] nums) {
		 if(nums==null||nums.length==0)return 0;
	        int count=1,cur=0,temp=nums[0];
	        int []diff=new int[nums.length];
	        diff[0]=nums[0];
	        int []times=new int[nums.length];
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]!=temp)
	        	{
	        		temp=nums[i];
	        		diff[++cur]=temp;
	        		times[cur]=1;
	        		count++;
	        	}
	        	else times[cur]++;
	        }
	        cur=0;
	        int totalcount=0;
	        for(int i=0;i<count;i++) {
	        	if(times[i]>=2) {
	        		nums[cur++]=diff[i];
	        		nums[cur++]=diff[i];
	        		totalcount+=2;
	        	}
	        	else {
	        		nums[cur++]=diff[i];
	        		totalcount+=1;
	        	}
	        }
	        return totalcount;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {};
		System.out.println(new Q80().removeDuplicates(nums));
		System.out.println();
	}

}
