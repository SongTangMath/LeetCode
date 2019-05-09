
public class Q303 {
	private int[] sums;
    public Q303(int[] nums) {
        sums=new int[nums.length+1];
        sums[0]=0;
        int cursum=0;
        for(int i=1;i<sums.length;i++){
            cursum+=nums[i-1];
            sums[i]=cursum;
        }
    }
    
    public int sumRange(int i, int j) {
        return sums[j+1]-sums[i];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= { -2, 0, 3, -5, 2, -1};
		Q303 obj=new Q303(nums);
		System.out.print(obj.sumRange(0, 5));

	}

}
