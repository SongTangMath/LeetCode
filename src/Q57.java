

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q57 {
	
	 
	  public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
	        if(intervals.size()==0)
		  {intervals.add(newInterval);return intervals;}
	        else {
	        	int index=0;
	        	while(index<intervals.size()&&
	        			intervals.get(index).start<=newInterval.start)
	        		index++;
	        	intervals.add(index, newInterval);
	        }
	        
	        int index=0;
			 while(index<intervals.size()-1) {
				 if(intervals.get(index).end>=intervals.get(index+1).start) {
					intervals.set(index, new Interval
							(intervals.get(index).start, 
					Math.max(intervals.get(index).end, intervals.get(index+1).end)));
					intervals.remove(index+1);
				 }
				 else index++;
			 }
			 return intervals;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> intervals=new ArrayList<Interval> ();
		intervals.add(new Interval(1,2));
		intervals.add(new Interval(3,5));
		intervals.add(new Interval(6,7));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(12,16));
		Interval newInterval=new Interval(4,8);
		intervals=new Q57().insert(intervals,newInterval);
		
		for(int i=0;i<intervals.size();i++)
		System.out.println(intervals.get(i).start+","+intervals.get(i).end);
	}

}
