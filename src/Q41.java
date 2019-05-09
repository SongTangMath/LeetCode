

public class Q41 {
	
	public int firstMissingPositive1(int[] A) {
        int i = 0;
        while(i < A.length){
            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
            else i++;
        }
        i = 0;
        while(i < A.length && A[i] == i+1) i++;
        return i+1;
    }
    
    private void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        if(n==0)return 1;
        int temp=0,index=0,index1=0;
        int i=1;
        while(i<=n) {
        	if(nums[i-1]<=0||nums[i-1]>=n+1||nums[i-1]==i)i++;
        	
        	else  if(nums[i-1]!=nums[nums[i-1]-1]){
        	
        		index=i-1;index1=nums[i-1]-1;
        		temp=nums[index];
        		nums[index]=nums[index1];
        		nums[index1]=temp;
        		}
        	else i++;
        	}
        for(int j=1;j<=n;j++)if(nums[j-1]!=j)return j;
        return n+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {1,1};
		System.out.println(new Q41().firstMissingPositive(nums));
	}

}
