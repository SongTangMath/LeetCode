import java.util.ArrayList;
import java.util.List;

public class Q327 {
	public int countNumbersInRange(long[][] bignums,int begin,
			  int end,long lower,long upper) {
		if(begin>end)return 0;
		//bignums[begin...end][0]中在[lower,upper]中的个数?二分查找
		
		int j1=-1,j2=-1;
		//求最小的j1使得bignums[j1][0]>=bignums[i][0]+lower
		//求最大的j2使得bignums[j2][0]<=bignums[i][0]+upper
		//则j的范围是[j1,j2]
		if(bignums[end][0]>=lower) {
			if(bignums[begin][0]>=lower)j1=begin;
			else {
				//搜索中保持low不满足high满足
				int low=begin,high=end;
				while(high-low>1) {
					int mid=low+(high-low)/2;
					if(bignums[mid][0]>=lower)high=mid;
					else low=mid;
				}
				j1=high;
			}
			
		}
		
		if(bignums[begin][0]<=upper) {
			if(bignums[end][0]<=upper)j2=end;
			else {
				//搜索中保持low满足high不满足
				int low=begin,high=end;
				while(high-low>1) {
					int mid=low+(high-low)/2;
					if(bignums[mid][0]<=upper)low=mid;
					else high=mid;
				}
				j2=low;
			}
			
		}
		if(j1!=-1&&j2!=-1)return j2-j1+1;
		else return 0;
		
		
	}
	 public int countRangeSum(int[] nums, int lower, int upper) {
		 long[]sum=new long[nums.length+1];
		 sum[0]=0;
		 for(int i=1;i<=nums.length;i++)sum[i]=sum[i-1]+nums[i-1];
		 List<Integer> count=countRange(sum,lower,upper);
		 int ans=0;
		 for(int temp:count)ans+=temp;
		 return ans;
	    }
	//求出lower<=nums[j]-nums[i]<=upper的指标对0<=i<j<=n-1个数
	  public List<Integer> countRange(long[] nums,int lower,int upper) {
		  int[]res=new int[nums.length];
		  List<Integer>list=new ArrayList<Integer>();
		  long[][] bignums=new long[nums.length][2];
		  for(int i=0;i<nums.length;i++) {
			  bignums[i][0]=nums[i];
			  bignums[i][1]=i;
		  }
		  countRangeRecursion(res,bignums,0,nums.length-1,lower,upper);
		  for(int i=0;i<nums.length;i++)list.add(res[i]);
		return list;
	        
	    }
	  
	  public void countRangeRecursion(int[]res,long[][] bignums,int begin,
			  int end,int lower,int upper) {
		if(begin>=end)return;
		int mid=begin+(end-begin)/2;
		countRangeRecursion(res,bignums,begin,mid,lower,upper);
		countRangeRecursion(res,bignums,mid+1,end,lower,upper);  
		//下面是合并过程
		long[][]temp=new long[end-begin+1][2];
		int i=begin,j=mid+1,k=0;
		//[mid+1,end]中寻找在[bignums[i][0]+lower,bignums[i][0]+upper]的个数
		while(i<=mid||j<=end) {
			if(i<=mid&&j<=end) {
				if(bignums[i][0]<=bignums[j][0]) {
					temp[k][0]=bignums[i][0];
					temp[k][1]=bignums[i][1];
					
					
					res[(int) bignums[i][1]]+=
		countNumbersInRange(bignums,mid+1,end,bignums[i][0]+lower,bignums[i][0]+upper);
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
				
				res[(int) bignums[i][1]]+=
		countNumbersInRange(bignums,mid+1,end,bignums[i][0]+lower,bignums[i][0]+upper);
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
		//int[] nums= {-2,5,-1};int lower=-2,upper=2;
		
		int[]nums= {-2147483647,0,-2147483647,2147483647};int lower=-564,upper=3864;
		//int[] nums= {-2,3,2};
		//List<Long>list=new Q327().countRange(nums,-2,2);
		//for(int i=0;i<list.size();i++)System.out.print(list.get(i)+" ");
		System.out.print(new Q327().countRangeSum(nums, lower, upper));
	}

}