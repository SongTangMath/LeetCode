import javafx.util.*;
import java.util.*;
class Q239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0)return new int[0];
	
    Deque<Pair<Integer,Integer>>queue=new ArrayDeque<Pair<Integer,Integer>>();
  for(int i=0;i<k;i++) {
  	while(!queue.isEmpty()&&queue.getLast().getKey()<=nums[i])        			
  			queue.removeLast();
  	queue.addLast(new Pair<Integer,Integer>(nums[i],i));
  	
  }
  int[]ans=new int[nums.length-k+1];
  int index=0;
  ans[index]=queue.getFirst().getKey();
  for(int i=k;i<nums.length;i++) {
  	if(queue.getLast().getValue()-queue.getFirst().getValue()==k-1)
  	{queue.removeFirst();}
  	while(!queue.isEmpty()&&queue.getLast().getKey()<=nums[i])        			
			queue.removeLast();
	queue.addLast(new Pair<Integer,Integer>(nums[i],i));
	ans[++index]=queue.getFirst().getKey();        }
  
  
  return ans;
    }
}
