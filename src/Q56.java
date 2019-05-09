
import java.util.*;
public class Q56 {
	 public List<Interval> merge(List<Interval> intervals) {
		 if(intervals==null||intervals.size()<=1)return intervals;
		 
		 Collections.sort(intervals,new Comparator<Interval>(){
			 public int compare(Interval v1,Interval v2){
			 if(v1.start<v2.start)return -1;
			 else if(v1.start==v2.start)return 0;
			 else return 1;}
			
			 });
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
		intervals.add(new Interval(1,3));
		intervals.add(new Interval(2,6));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(15,18));
		intervals=new Q56().merge(intervals);
		
		for(int i=0;i<intervals.size();i++)
		System.out.println(intervals.get(i).start+","+intervals.get(i).end);
	}

}
