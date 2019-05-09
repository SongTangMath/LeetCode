
import java.util.*;
public class Q229 {
public List<Integer> majorityElement(int[] nums) {
	 List<Integer> list=new ArrayList<Integer>();
	 if(nums.length==0)return list;
	 int numA=nums[0],numB=nums[0];
	 int countA=0,countB=0;
	 int i=0;
	 while(i<nums.length&&nums[i]==numA) {
		 i++;
		 countA++;
	 }
	 if(i==nums.length) {
		 list.add(numA);
		 return list;
	 }
	 numB=nums[i];
	 //countB=1;
	 for(;i<nums.length;i++) {
		 if(nums[i]==numA) {
			 countA++;continue;
		 }
		 if(nums[i]==numB) {
			 countB++;continue;
		 }
		 if(countA>0&&countB>0) {countA--;
		countB--;continue;}
		 //新来的这个数可以匹配1个numA,1个numB
		 if(countA==0)
			 {numA=nums[i];countA=1;}
		 else if(countB==0) {numB=nums[i];countB=1;}
		 //匹配池中不能匹配(加上这个新数也没有3个互异数
		 //那么这个新数进入匹配池且未匹配度=1.
	 }
	 countA=0;countB=0;
	 for(i=0;i<nums.length;i++) 
		 if(nums[i]==numA)countA++;
		 else if(nums[i]==numB)countB++;
		 int n=nums.length;
	 if(countA>n/3)list.add(numA);
	 if(countB>n/3)list.add(numB);
	
	 return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {1,1,1,2,2,2,3,3,3};		
		List<Integer> list=new Q229().majorityElement(nums);
		for(Integer temp:list)System.out.println(temp);
		String a=new String("uvw");
		//a.charAt(0)='t';
	}

}
