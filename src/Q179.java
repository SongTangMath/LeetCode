

import java.util.*;

public class Q179 {
public String largestNumber(int[] nums) {
        String[] s_num=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        	s_num[i]=""+nums[i];
        Comparator<String> comp=new Comparator<String>(){

        	@Override
        	public int compare(String s1,String s2){
        	return (s2+s1).compareTo(s1+s2);}
        	};
        	Arrays.sort(s_num,comp);
        	String ans="";
        	for(int i=0;i<nums.length;i++)
        		ans=ans+s_num[i];
        	return ans;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]nums= {3,30,34,5,9};
			System.out.println(new Q179().largestNumber(nums));
	}

}
