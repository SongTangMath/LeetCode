

public class Q84 {
	 public int largestRectangleArea(int[] heights) {
	        if(heights==null||heights.length==0)return 0;
	        int[]left=new int[heights.length];
	        int[]right=new int[heights.length];
	        int[]maxArea=new int[heights.length];
	        left[0]=-1;
	        for(int i=1;i<heights.length;i++) {
	        	int p=i-1;
	        	while(p>=0&&heights[p]>=heights[i])p=left[p];
	        	left[i]=p;
	        }
	        right[heights.length-1]=heights.length;
	        for(int i=heights.length-2;i>=0;i--) {
	        	int p=i+1;
	        	while(p<heights.length&&heights[p]>=heights[i])p=right[p];
	        	right[i]=p;
	        }
	        for(int i=0;i<heights.length;i++) {
	        	maxArea[i]=heights[i]*(right[i]-left[i]-1);
	        }
	        int max=0;
	        for(int i=0;i<heights.length;i++)max=Math.max(max, maxArea[i]);
	        return max;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]heights= {2,1,5,6,2,3};
			System.out.println(new Q84().largestRectangleArea(heights));
	}

}
