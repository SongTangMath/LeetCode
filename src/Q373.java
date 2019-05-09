import java.util.*;
public class Q373 {
public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]>list=new ArrayList<int[]>();
        List<int[]>ans=new ArrayList<int[]>();
        if(nums1==null||nums2==null||nums1.length==0||nums2.length==0||k<=0)return list;
        PriorityQueue<int[]>queue=new PriorityQueue<int[]>((a,b)->a[0]+a[1]-b[0]-b[1]);
        for(int i=0;i<Math.min(k, nums1.length);i++) {
        	int[]temp=new int[3];
        	temp[0]=nums1[i];
        	temp[1]=nums2[0];
        	temp[2]=0;
        	queue.add(temp);
        }
        while(k>0&&!queue.isEmpty()) {
        	int[]temp=queue.poll();
        	ans.add(new int[]{temp[0],temp[1]});
        	k--;
        	if(temp[2]<nums2.length-1)
        		queue.add(new int[]{temp[0],nums2[temp[2]+1],temp[2]+1});
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
