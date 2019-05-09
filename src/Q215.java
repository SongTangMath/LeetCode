
import java.util.*;
public class Q215 {
	public int findKthLargest(int[] nums, int k) {
		
       PriorityQueue<Integer>queue=new   PriorityQueue<Integer>();
       for(int i=0;i<k;i++)queue.add(nums[i]);
       for(int i=k;i<nums.length;i++)
    	   if(nums[i]>=queue.peek()) {
    		   queue.poll();
    		   queue.add(nums[i]);
    	   }
       return queue.peek();
    }
	
	public int findKthSmallest(int[] nums, int k) {
		Comparator<Integer>comp=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		};
	       PriorityQueue<Integer>queue=new   PriorityQueue<Integer>(comp);
	       for(int i=0;i<k;i++)queue.add(nums[i]);
	       for(int i=k;i<nums.length;i++)
	    	   if(nums[i]<=queue.peek()) {
	    		   queue.poll();
	    		   queue.add(nums[i]);
	    	   }
	       return queue.peek();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {3,2,1,5,6,4};
		int k = 1;
		System.out.println(new Q215().findKthSmallest(nums, k));
	}

}
