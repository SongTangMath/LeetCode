

public class Q75 {
public boolean searchMatrix(int[][] matrix, int target) {
	int m=matrix.length;
			if(m==0)return false;
			int n=matrix[0].length;
	if(n==0)return false;
	if(target<matrix[0][0]||target>matrix[m-1][n-1])return false;
	int rowlow=0,rowhigh=m;
	while(rowlow<rowhigh) {
		int mid=(rowlow+rowhigh)/2;
		if(target>matrix[mid][n-1])rowlow=mid+1;
		else if(target<matrix[mid][0])rowhigh=mid;
		else {rowlow=mid;rowhigh=mid;
	}}
		int low=0,high=n;
		while(low<high) {
			int mid1=(low+high)/2;
			if(target==matrix[rowlow][mid1])return true;
			else if(target<matrix[rowlow][mid1])high=mid1;
			else low=mid1+1;
		}
		return false;
	
    }

public void sortColors(int[] nums) {
    int n0=0,n1=0,n2=0;
    for(int i=0;i<nums.length;i++)
    {if(nums[i]==0)n0++;
    else if(nums[i]==1)n1++;
    else n2++;}
    for(int i=0;i<n0;i++)nums[i]=0;
    for(int i=n0;i<n0+n1;i++)nums[i]=1;
    for(int i=n0+n1;i<nums.length;i++)nums[i]=2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matrix = {
		          {1,   3,  5,  7},
		          {10, 11, 16, 20},
		          {23, 30, 34, 50}
		        };
		int[]nums= {0};
		new Q75().sortColors(nums);
		System.out.println(new Q75().searchMatrix(matrix, 16));
	}

}
