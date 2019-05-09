
import java.util.*;
public class Q128 {
public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer>map=new  HashMap<Integer,Integer>();
        for(int n:nums) {
        	if(map.containsKey(n))continue;
        	int left=0,right=0;
        	if(map.containsKey(n-1))left=map.get(n-1);
        	if(map.containsKey(n+1))right=map.get(n+1);
        	int sum=left+1+right;
        	map.put(n,sum);
        	map.put(n-left,sum);
        	map.put(n+right,sum);
        }
        int max=0;
        for(int key:map.keySet())
        	max=Math.max(max, map.get(key));
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {1,2,0,1};
		System.out.println(new Q128().longestConsecutive(nums));
	}

}
