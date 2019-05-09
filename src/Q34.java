

public class Q34 {
	 public int[] searchRange(int[] nums, int target) {
		 int[] err= {-1,-1};
		 int ex=-1;
		 if(nums==null||nums.length==0)return err;
	        int low=0,high=nums.length;
	        while(low<high) {
	        	int mid=(low+high)/2;
	        	if(nums[mid]==target) {
	        		ex=mid;break;
	        	}
	        	if(nums[mid]<target)low=mid+1;
	        	else high=mid;
	        }
	        if(ex==-1)return err;
	       
	        int lowerbound=0,higherbound=nums.length-1;
	        int exlow=ex,exhigh=ex;
	        
	        if(nums[0]!=target) {
	        	
	        	
	        	while(lowerbound+1<exlow) {
	        		int mid=(lowerbound+exlow)/2;
	        		
	        		if(nums[mid]==target)exlow=mid;
	        		else lowerbound=mid;
	        }
	        	lowerbound++;
	        }
	        
	        if(nums[nums.length-1]!=target) {
	        	
	        	while(higherbound>exhigh+1) {
       		
	        		int mid=(higherbound+exhigh)/2;
	        		if(nums[mid]==target)exhigh=mid;
	        		else higherbound=mid;
	        }
	        	higherbound--;
	        }
	        return new int[] {lowerbound,higherbound};
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,7,7,8,8,10};
		int[] ans=new Q34().searchRange(nums, 8);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		
	}

}
