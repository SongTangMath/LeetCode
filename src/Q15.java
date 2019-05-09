
import java.util.*;
public class Q15 {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
        	map.putIfAbsent(nums[i], 0);
        	map.put(nums[i], map.get(nums[i])+1);
        }
        if (map.containsKey(0)&&map.get(0)>=3) {
        	
        	list.add(Arrays.asList(0,0,0));
        }
        Set<Integer> keys=map.keySet();
        Integer[] nums1=keys.toArray(new Integer[0]);
        Arrays.sort(nums1);
        for(Integer temp:keys) {
        	if(temp!=0&&map.get(temp)>=2&&map.containsKey(-2*temp)) {
        		
            	list.add(Arrays.asList(temp,temp,-2*temp));
        	}
        }
        for(int i=0;i<nums1.length;i++) { for(int j=i+1;j<nums1.length;j++) {
        if(nums1[j]<-nums1[i]-nums1[j]&&map.containsKey(-nums1[i]-nums1[j]))
        	list.add(Arrays.asList(nums1[i],nums1[j],-nums1[i]-nums1[j]));
        	
        	
        }}
     
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]nums= {0,0,1,1,1,2,6,4,8};  Arrays.sort(nums);

new Q15().threeSum(nums);
	}

}
