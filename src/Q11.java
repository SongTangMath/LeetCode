
//import java.lang.Math.*;
public class Q11 {
	 public int maxArea(int[] height) {
	        if(height.length<=1)return 0;
	        int ans=height[1]-height[0];
	        //int beginindex=0,endindex=1;
	        for(int i=0;i<height.length;i++) {
	        	for(int j=i+1;j<height.length;j++) {
	        		if((j-i)*Math.min(height[i],height[j])>ans) {
	        			ans=(j-i)*Math.min(height[i],height[j]);	        			
	        		}
	        	}
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
