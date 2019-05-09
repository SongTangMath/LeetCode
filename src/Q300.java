
public class Q300 {
	 public int lengthOfLIS(int[] nums) {
		 int n=nums.length;
		 if(n==0)return 0;
		int[]tails=new int[n];
		int size=1;tails[0]=nums[0];
		for(int i=1;i<n;i++) {
			if(nums[i]>tails[size-1]) {
				tails[size]=nums[i];size++;
			}
			else if(nums[i]<=tails[0])tails[0]=nums[i];
			else {
				int begin=0,end=size-1;
				while(begin<end-1) {
					int mid=begin+(end-begin)/2;
					if(tails[mid]<nums[i])begin=mid;
					else end=mid;
				}
				//tails[begin]<nums[i]<=tails[end]
				tails[end]=nums[i];
			}
		}
		return size;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {3,5,6,2,5,4,19,5,6,7,12};
				System.out.print(new Q300().lengthOfLIS(nums));
	}

}
