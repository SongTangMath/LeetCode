import java.util.*;

/**
*@author SongTang
*/
public class Q391 {
public boolean isRectangleCover(int[][] rectangles) {
	if (rectangles==null||rectangles.length==0) {
		return false;
	}
        HashMap<PointQ391,Integer>map=new HashMap<PointQ391,Integer>();
        int area=0;
        int left=Integer.MAX_VALUE;
        int bottom=Integer.MAX_VALUE;
        int upper=Integer.MIN_VALUE;
        int right=Integer.MIN_VALUE;
        for(int[] rect:rectangles) {
        	left=Math.min(left, rect[0]);
        	bottom=Math.min(bottom, rect[1]);
        	right=Math.max(right, rect[2]);
        	upper=Math.max(upper, rect[3]);
        	PointQ391 leftBottom=new PointQ391(rect[0],rect[1]);
        	PointQ391 rightUpper=new PointQ391(rect[2],rect[3]);
        	PointQ391 leftUpper=new PointQ391(rect[0],rect[3]);
        	PointQ391 rightBottom=new PointQ391(rect[2],rect[1]);
        	map.put(leftBottom, map.getOrDefault(leftBottom, 0)+1);
        	map.put(rightUpper, map.getOrDefault(rightUpper, 0)+1);
        	map.put(leftUpper, map.getOrDefault(leftUpper, 0)+1);
        	map.put(rightBottom, map.getOrDefault(rightBottom, 0)+1);
        	area+=(rect[2]-rect[0])*(rect[3]-rect[1]);
        }
        List<PointQ391>list=new ArrayList<PointQ391>();
        int countOdd=0;
        for(PointQ391 pointQ391:map.keySet()) {
        	if(map.get(pointQ391)==1) {
        		list.add(pointQ391);
        	}
        	if(map.get(pointQ391)%2==1) {
        		countOdd++;
        	}
        }
        boolean countArea= (area==(right-left)*(upper-bottom));
        boolean countTimes=(list.size()==4&&countOdd==4);
        boolean pointQ391Coincide=(list.contains(new PointQ391(left,bottom))&&
        		list.contains(new PointQ391(left,upper))&&
        		list.contains(new PointQ391(right,bottom))&&
        		list.contains(new PointQ391(right,upper)));
        return(countArea&&countTimes&&pointQ391Coincide);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]rectangles = { 
				{1,1,2,3},
				  {1,3,2,4},
				  {3,1,4,2},
				  {3,2,4,4}
		};
		System.out.print(new Q391().isRectangleCover(rectangles));
	}

}
class PointQ391{
	public int x,y;

	public PointQ391(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
			
		if (obj == null) {
			return false;
			}
		if (getClass() != obj.getClass()) {
			return false;}
		PointQ391 other = (PointQ391) obj;
		if (x != other.x||y != other.y) {
			return false;}
		
		return true;
	}
	
}