
import java.util.*;
public class Q135 {
	  public int candy(int[] ratings) {
	        if(ratings==null||ratings.length==0)return 0;
	        int[] nums=new int[ratings.length];
	        for(int i=1;i<ratings.length;i++)
	        	if(ratings[i]>ratings[i-1])
	        		nums[i]=nums[i-1]+1;
	        for(int i=ratings.length-2;i>=0;i--)
	        	if(ratings[i]>ratings[i+1])
	        		nums[i]=Math.max(nums[i+1]+1,nums[i]);
	        int sum=ratings.length;
	        for(int i=0;i<nums.length;i++)sum+=nums[i];
	        return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ratings= {1,3,2,2,1};
			System.out.println(new Q135().candy(ratings));
			System.out.println((1 ^ 5));
	}

}
