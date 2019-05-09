

public class Q42 {
	 public int trap(int[] height) {
		 if(height==null||height.length<=2)return 0;
		 int n=height.length;
	        int left=0,right=n-1,maxleft=0,maxright=0,totalAmount=0;
	        while(left<=right) {
	        	maxleft=Math.max(maxleft, height[left]);
	        	maxright=Math.max(maxright, height[right]);
	        	if(maxleft<=maxright) {
	        		totalAmount+=maxleft-height[left];
	        		left++;
	        	}
	        	else {
	        		totalAmount+=maxright-height[right];
	        		right--;
	        	}
	        }
	        return totalAmount;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(new Q42().trap(height));
	}

}
