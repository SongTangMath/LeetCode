
import java.util.*;
public class Q228 {
	 public List<String> summaryRanges(int[] nums) {
	        List<String> list=new ArrayList<String>();
	        if(nums.length==0)return list;
	        int begin=nums[0],end=nums[0];
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]==end+1)end++;
	       else {
	           if(begin==end)list.add(begin+"");
	           else list.add(begin+"->"+end);
	           begin=nums[i];end=nums[i];
	       }
	            
	        
	    }
	        if(begin==end)list.add(begin+"");
	           else list.add(begin+"->"+end);
	          
	        return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {0,1,2,4,5,7,8,90};
		 List<String> list=new Q228().summaryRanges(nums);
		 for(String temp:list)System.out.println(temp);
	}

}
