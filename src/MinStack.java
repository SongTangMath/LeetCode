
public class MinStack {
	int[]nums;
	int used;
	 public MinStack() {
	        nums=new int[10];
	        used=0;
	    }
	    
	    public void push(int x) {
	        if(used==nums.length) {
	        	int[] newAllocated=new int[2*nums.length];
	        	for(int i=0;i<nums.length;i++)newAllocated[i]=nums[i];
	        	newAllocated[++used]=x;
	        	nums=newAllocated;
	        }
	        else nums[++used]=x;
	    }
	    
	    public void pop() {
	        if(used>=1)used--;
	    }
	    
	    public int top() {
	        return nums[used-1];
	    }
	    
	    public int getMin() {
	    	int min=nums[0];
	    	for(int i=1;i<used;i++)
	    		if(nums[i]<min)min=nums[i];
	    	return min;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
