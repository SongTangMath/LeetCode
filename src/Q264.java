
public class Q264 {
	 public int nthUglyNumber(int n) {
	        if(n<=0)return 0;
	        if(n==1)return 1;
	        int[]nums=new int[n];
	        nums[0]=1;
	        int t2=0,t3=0,t5=0;
	        for(int i=1;i<n;i++){
	            nums[i]=Math.min(2*nums[t2],Math.min(3*nums[t3],5*nums[t5]));
	            if(nums[i]==2*nums[t2])t2++;
	             if(nums[i]==3*nums[t3])t3++;
	             if(nums[i]==5*nums[t5])t5++;
	        }
	        return nums[n-1];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q264().nthUglyNumber(10));
	}

}
