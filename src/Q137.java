
import java.util.*;
public class Q137 {
public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new  HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
        	if(!map.containsKey(nums[i]))
        		map.put(nums[i], 1);
        	else map.put(nums[i],map.get(nums[i])+1);
        }
        for(int temp:map.keySet())
        	if(map.get(temp)==1)return temp;
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {0,1,0,1,0,1,99};
		System.out.println(new Q137().singleNumber(nums));
	}

}
