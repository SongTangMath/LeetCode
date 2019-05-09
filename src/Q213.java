

public class Q213 {
	public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
     public int rob(int[] nums,int begin,int end) {
       
        if(end==begin)return nums[begin];
        int[]a=new int[end-begin+1];
        a[0]=nums[begin];
        a[1]=Math.max(nums[begin],nums[begin+1]);
            for(int i=2;i<=end-begin;i++)
a[i]=Math.max(a[i-1],a[i-2]+nums[begin+i]);
        return a[end-begin];

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {1,2,3,1};
		System.out.println(new Q213().rob(nums));
	}

}
