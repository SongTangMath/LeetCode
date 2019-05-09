import java.util.*;
public class Q368 {
public List<Integer> largestDivisibleSubset(int[] nums) {
	 List<Integer>ans=new ArrayList<Integer>();
     if(nums==null||nums.length==0)return ans;
        	Arrays.sort(nums);
        	int n=nums.length;
        	
        	int[]a=new int[n];
        	int[]b=new int[n];
        	a[0]=1;b[0]=-1;
        	for(int i=1;i<n;i++) {
        		int maxlen=0,previousPos=-1;
        		for(int j=0;j<i;j++)
        			if(nums[i]%nums[j]==0&&a[j]>maxlen) {
        				maxlen=a[j];
        				previousPos=j;
        			}
        		a[i]=maxlen+1;
        		b[i]=previousPos;
        	}
        	int maxPos=0;
        	for(int i=0;i<n;i++) {
        		if(a[i]>a[maxPos])maxPos=i;
        	}
        	
        	while(maxPos!=-1)
        	{
        		ans.add(nums[maxPos]);
        		maxPos=b[maxPos];
        	}
        	return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {1,2,4,8};
		List<Integer>ans=new Q368().largestDivisibleSubset(nums);
		for(int temp:ans)System.out.print(temp+" ");
	}

}
