import java.util.*;
import java.util.Map.Entry;
public class Q347 {
	 public List<Integer> topKFrequent(int[] nums, int k) {
	       HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
	       for(int i=0;i<nums.length;i++)
	    	   if(map.containsKey(nums[i]))map.put(nums[i], map.get(nums[i])+1);
	    	   else map.put(nums[i],1);
	       List<Map.Entry<Integer, Integer>>list=new ArrayList(map.entrySet());
	       
	       PriorityQueue<Map.Entry<Integer, Integer>>queue=
	    		   new PriorityQueue<Map.Entry<Integer, Integer>>(
	    				 new Comparator<Map.Entry<Integer, Integer>>(){

							@Override
							public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
								// TODO Auto-generated method stub
								return o1.getValue().compareTo(o2.getValue());
							}
	    					 
	    				 }
	    				   );
	     for(int i=0;i<list.size();i++)
	    	 if(queue.size()<k)queue.add(list.get(i));
	    	 else if(list.get(i).getValue()>queue.peek().getValue()) {
	    		 queue.poll();
	    		 queue.add(list.get(i));
	    	 }
	       List<Integer>ans=new ArrayList<Integer>();
	       for(int i=list.size()-1;i>=Math.max(0, list.size()-k);i--)
	    	   ans.add(queue.poll().getKey());
	       return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {1,1,1,2,2,3};
		int k = 2;
		List<Integer>ans=new Q347().topKFrequent(nums, k);
		for(int i:ans)System.out.print(i+" ");
	}

}
