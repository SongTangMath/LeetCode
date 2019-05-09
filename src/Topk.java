
public class Topk {
private int findTopk(int []nums,int low,int high,int k) {
	//要求high-low+1>=k>=1
	int begin=low,end=high;
	int pivot=nums[begin];
	while(begin<end) {
		while(begin<end&&nums[end]>=pivot)end--;
		swap(nums,begin,end);
		while(begin<end&&nums[begin]<=pivot)begin++;
		swap(nums,begin,end);
	}
	//nums[low..begin=end]共有end-low+1个数
	//nums[begin=end,..high]共有high-end+1个数
	if(high-end+1==k)return nums[end];
	else if(high-end+1>k)return findTopk(nums,end+1,high,k);
	else return findTopk(nums,low,begin-1,k-(high-end+1));
}
public int findTopk(int []nums,int k) {
	if(nums==null||nums.length==0||k<=0||k>nums.length)
		throw new RuntimeException();
	return findTopk(nums,0,nums.length-1,k);
}
private void swap(int[]nums,int begin,int end) {
	int temp=nums[begin];
	nums[begin]=nums[end];
	nums[end]=temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {8,5,0,-2,7,9,9};
		System.out.print(new Topk().findTopk(nums, 7));
	}

}
