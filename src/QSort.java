import java.util.*;
public class QSort {
public  void sort(int[]nums) {
	sort(nums,0,nums.length-1);
}
private int partition(int[]nums,int low,int high) {
	
	int pivot=nums[low];
	while(low<high) {
		while(low<high&&nums[high]>=pivot)high--;
		swap(nums,low,high);
		while(low<high&&nums[low]<=pivot)low++;
		swap(nums,low,high);
		
	}
	return low;
}
private void swap(int[]nums,int begin,int end) {
	int temp=nums[begin];
	nums[begin]=nums[end];
	nums[end]=temp;
}
private void sort(int[]nums,int low,int high) {
	if(low>=high)return ;
	int pos=partition(nums,low,high);
	sort(nums,low,pos-1);
	sort(nums,pos+1,high);
}
public void QsortNonRecursive(int[]nums) {
	int pivot=partition(nums,0,nums.length-1);
	Stack<Interval>stack=new Stack<Interval>();
	if(pivot>=2)stack.push(new Interval(0,pivot-1));
	if(nums.length-pivot>=2)stack.push(new Interval(pivot+1,nums.length-1));
	while(!stack.isEmpty()) {
		Interval temp=stack.pop();
		pivot=partition(nums,temp.start,temp.end);
		
		if(pivot-temp.start>=2)stack.push(new Interval(temp.start,pivot-1));
		if(temp.end-pivot>=2)stack.push(new Interval(pivot+1,temp.end));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {7,4,6,2,9,10,-1,-2};
		//int pivot=new QSort().partition(nums,0,nums.length-1);
		//System.out.print(pivot);
		new QSort().sort(nums);
		for(int i=0;i<nums.length;i++)System.out.print(nums[i]+" ");
	}

}

