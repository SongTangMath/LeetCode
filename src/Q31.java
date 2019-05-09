

import java.util.Collections;

public class Q31 {
	 public void nextPermutation(int[] nums) {
	       if(nums==null||nums.length==1)return ;
	        int j=nums.length-1;
	        while(j>=1&&nums[j-1]>=nums[j])j--;
	        if(j==0) {
	        	
	        	int b[]=new int[nums.length];
	        	for(int i=0;i<nums.length;i++)b[i]=nums[nums.length-1-i];
	        	for(int i=0;i<nums.length;i++)nums[i]=b[i];
	        	return;
	        }
	        
	        int k=j;while(k<=nums.length-1&&nums[k]>nums[j-1])k++;
	       
	        if(k==nums.length||nums[k]<=nums[j-1])k--;
	       
	        int temp=nums[j-1];
	        nums[j-1]=nums[k];
	        nums[k]=temp;
	      
	        int[] b=new int[nums.length];
	        for(int i=j;i<nums.length;i++)b[i]=nums[nums.length-1+j-i];
	        for(int i=j;i<nums.length;i++)nums[i]=b[i];
	        
       	 return;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums= {5,1,1};
			new Q31().nextPermutation(nums);
			for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
	}

}
