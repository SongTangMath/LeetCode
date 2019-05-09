

import java.util.ArrayList;
import java.util.List;

public class Q119 {
	 public List<Integer> getRow(int rowIndex) {
		 List<Integer> list=new ArrayList<Integer>();
		 if(rowIndex<0) return list;
		 list.add(1);		
		 if(rowIndex==0) return list;
		 for(int i=1;i<=rowIndex;i++) {
			 List<Integer> newlist=new ArrayList<Integer>();
			 newlist.add(1);
			 for(int j=0;j<list.size()-1;j++)
				 newlist.add(list.get(j)+list.get(j+1));
			 newlist.add(1);list=newlist;
			 
		 }
		 return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new Q119().getRow(5);
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
	}

}
