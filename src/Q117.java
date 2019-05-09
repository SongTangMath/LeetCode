
import java.util.*;
public class Q117 {
	 public List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> totalList=new ArrayList<List<Integer>>();
		 if(numRows<=0)return totalList;
		 List<Integer> list=new ArrayList<Integer>();
		 list.add(1);
		 totalList.add(new ArrayList<Integer>(list));
		 if(numRows==1) return totalList;
		 for(int i=2;i<=numRows;i++) {
			 List<Integer> newlist=new ArrayList<Integer>();
			 newlist.add(1);
			 for(int j=0;j<list.size()-1;j++)
				 newlist.add(list.get(j)+list.get(j+1));
			 newlist.add(1);list=newlist;
			 totalList.add(new ArrayList<Integer>(list));
		 }
		 return totalList;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<List<Integer>> totalList=new Q117().generate(5);
		 for(int i=0;i<totalList.size();i++) {
			 List<Integer>temp=totalList.get(i);
			 for(int j=0;j<temp.size();j++)
				 System.out.print(temp.get(j)+" ");
			 System.out.println();
		 }
	}

}
