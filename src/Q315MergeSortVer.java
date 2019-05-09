import java.util.*;
public class Q315MergeSortVer {
	  public List<Integer> countSmaller(int[] nums) {
		  int[]res=new int[nums.length];
		  List<Integer>list=new ArrayList<Integer>();
		  int[][] bignums=new int[nums.length][2];
		  for(int i=0;i<nums.length;i++) {
			  bignums[i][0]=nums[i];
			  bignums[i][1]=i;
		  }
		  countSmallerRecursion(res,bignums,0,nums.length-1);
		  for(int i=0;i<nums.length;i++)list.add(res[i]);
		return list;
	        
	    }
	  
	  public void countSmallerRecursion(int[]res,int[][] bignums,int begin,int end) {
		if(begin>=end)return;
		int mid=begin+(end-begin)/2;
		countSmallerRecursion(res,bignums,begin,mid);
		countSmallerRecursion(res,bignums,mid+1,end);  
		//下面是合并过程
		int[][]temp=new int[end-begin+1][2];
		int i=begin,j=mid+1,k=0;
		while(i<=mid||j<=end) {
			if(i<=mid&&j<=end) {
				if(bignums[i][0]<=bignums[j][0]) {
					temp[k][0]=bignums[i][0];
					temp[k][1]=bignums[i][1];
					
					res[bignums[i][1]]+=(j-mid-1);
					k++;i++;
				}
					
				else {
					temp[k][0]=bignums[j][0];
					temp[k][1]=bignums[j][1];
					k++;j++;
					
				}
			}
			
			else if(i<=mid) {
				temp[k][0]=bignums[i][0];
				temp[k][1]=bignums[i][1];
				
				res[bignums[i][1]]+=(j-mid-1);
				k++;i++;
			}
			else {
				temp[k][0]=bignums[j][0];
				temp[k][1]=bignums[j][1];
				k++;j++;
			}
		}
		for(k=0;k<temp.length;k++) {
			bignums[begin+k][0]=temp[k][0];
			bignums[begin+k][1]=temp[k][1];
		}
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,2,6,1};
		List<Integer>list=new Q315MergeSortVer().countSmaller(nums);
		for(int i=0;i<list.size();i++)System.out.print(list.get(i)+" ");
	}

}
