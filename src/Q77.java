
import java.util.*;
public class Q77 {
	  public List<List<Integer>> combine(int n, int k) {
		  List<List<Integer>> totalList=new ArrayList<List<Integer>>();
		  List<Integer>list=new  ArrayList<Integer>();
		  generate(totalList,list,n,k);
		  return totalList;
	    }
	  private void generate(List<List<Integer>> totalList,
			  List<Integer>list,int n,int k) {
		  if(list.size()==k) {totalList.add(new ArrayList<Integer>(list));return;}
		  else if(list.size()>0)
		  for(int t=list.get(list.size()-1)+1;t<=n;t++) {
			  list.add(t);generate(totalList,list,n,k);
			  list.remove(list.size()-1);
		  }
		  else for(int t=1;t<=n;t++) {
			  list.add(t);generate(totalList,list,n,k);
			  list.remove(list.size()-1);
		  }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> totalList=new Q77().combine(4, 2);
		for(int i=0;i<totalList.size();i++) {
			List<Integer> temp=totalList.get(i);
			for(int j=0;j<temp.size();j++)System.out.print(temp.get(j));
			System.out.println();
		}
	}

}
