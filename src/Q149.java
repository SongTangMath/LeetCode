
import java.util.*;
public class Q149 {
	  public int maxPoints(Point[] points) {
	        if(points.length<=2)return points.length;
	        int []maxCount=new int[points.length] ;
	        for(int i=0;i<points.length;i++) {
	        	HashMap<Rational,Integer>map=new HashMap<Rational,Integer>();
	        	int noSlope=0;//计算斜率不存在的点个数.重复的点要单独算.
	        	int samePoint=0;
	        	for(int j=0;j<points.length;j++) {
	        		
	        		if(points[j].x!=points[i].x) {
	        			//斜率存在
	        			Rational slope=new Rational
	        					(points[j].y-points[i].y,points[j].x-points[i].x);
	        			if(!map.containsKey(slope))map.put(slope, 1);
	        			else map.put(slope,map.get(slope)+1);
	        		}
	        		else if(points[j].y!=points[i].y)noSlope++;
	        		else samePoint++;
	        	}
	        	int curMax=noSlope;
	        	for(int temp:map.values())
	        		if(curMax<temp)curMax=temp;
	        	
	        	maxCount[i]=curMax+samePoint;
	        }
	        		int max=0;
	        for(int temp:maxCount)
	        	if(max<temp)max=temp;
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
		Point[]points=new Point[4];
		points[0]=new Point(1,1);
		points[1]=new Point(1,1);
		points[2]=new Point(2,2);
		points[3]=new Point(2,2);
//		points[4]=new Point(2,3);
//		points[5]=new Point(1,4);
		System.out.println(new Q149().maxPoints(points));
	}

}
class Point {
	      int x;
	      int y;
	     Point() { x = 0; y = 0; }
	     Point(int a, int b) { x = a; y = b; }
	 }
