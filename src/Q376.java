import java.util.*;
public class Q376 {
	
public int wiggleMaxLength1(int[] nums) {
        
        if( nums.length == 0 ) return 0;
        
        int[] up = new int[nums.length];
        int[] down = new int[nums.length];
        
        up[0] = 1;
        down[0] = 1;
        
        for(int i = 1 ; i < nums.length; i++){
            if( nums[i] > nums[i-1] ){
                up[i] = down[i-1]+1;
                down[i] = down[i-1];
            }else if( nums[i] < nums[i-1]){
                down[i] = up[i-1]+1;
                up[i] = up[i-1];
            }else{
                down[i] = down[i-1];
                up[i] = up[i-1];
            }
        }
        
        return Math.max(down[nums.length-1],up[nums.length-1]);
    }
	 public int wiggleMaxLength(int[] nums) {
	        int n=nums.length;if(n<=1)return n;
	        List<Integer>list=new ArrayList<Integer>();
	        int[][]a=new int[n][2];
	        a[n-1][0]=1;a[n-1][1]=1;
	    for(int i=n-2;i>=0;--i){
	    	
	    	 List<Integer>list1=new ArrayList<Integer>();
	    	 List<Integer>list2=new ArrayList<Integer>();
	    	 
	    	for(int j=i+1;j<n;j++)
	    if(nums[i]<nums[j])list1.add(a[j][1]+1);
	    else if(nums[i]>nums[j])list2.add(a[j][0]+1);
	    	
	    	if(!list1.isEmpty())a[i][0]=Collections.max(list1);
	    	else a[i][0]=1;
	    	if(!list2.isEmpty())a[i][1]=Collections.max(list2);
	    	else a[i][1]=1;
	    }
	    
	        for(int i=0;i<n;i++){list.add(a[i][0]);list.add(a[i][1]);}
	        return Collections.max(list);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]nums= {1,17,5,10,13,15,10,5,16,8};
		int[]nums= {1,2,3,4,5,6,7,8,9,10};
		System.out.print(new Q376().wiggleMaxLength1(nums));
	}

}
