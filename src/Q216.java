
import java.util.*;
public class Q216 {
public List<List<Integer>> combinationSum3(int k, int n) {
	List<List<Integer>> totalList=new ArrayList<List<Integer>>();
	List<Integer>list=new ArrayList<Integer>();
	generate(totalList,list,0,k,n);
	return totalList;
    }
private void generate(List<List<Integer>> totalList,
		List<Integer>list,int sum,int k,int n) {
	if(sum>n||list.size()>k)return ;
	if(list.size()==k&&sum==n)totalList.add(new ArrayList<Integer>(list));
	if(!list.isEmpty())
	for(int i=list.get(list.size()-1)+1;i<=9;i++)
	{
		list.add(i);
		generate(totalList,list,sum+i,k,n);
		list.remove(list.size()-1);
	}
	else for(int i=1;i<=9;i++)
	{
		list.add(i);
		generate(totalList,list,sum+i,k,n);
		list.remove(list.size()-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> totalList=new Q216().combinationSum3(3,7);
		for(int i=0;i<totalList.size();i++) {
			List<Integer> list=totalList.get(i);
			for(int j=0;j<list.size();j++)
				System.out.print(list.get(j));
			
		}
		System.out.println(1);

	}

}
