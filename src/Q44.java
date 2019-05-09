
import java.util.*;
public class Q44 {
	
	int jump(int nums[]) {
		int curmin=0,curmax=0,step=0;
		while(curmax<nums.length-1) {
			int max=0;
			for(int i=curmin;i<=curmax;i++)
				max=Math.max(i+nums[i], max);
			step++;
			curmin=curmax+1;
			curmax=max;
		}
		return step;
		
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,3,1,1,4};
		System.out.println(new Q44().jump(nums));
	}

}
