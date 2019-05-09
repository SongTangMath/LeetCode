
import java.util.*;
public class Q22 {
	private void generate(List list,int n,int left,int right, String currentstr) {
		if(left+right==2*n) {list.add(currentstr);return;}
		if(left>right) generate(list,n,left,right+1,currentstr+')');
		if(left<n) generate(list,n,left+1,right,currentstr+'(');
		
	}
	 public List<String> generateParenthesis(int n) {
		 List<String> list=new ArrayList<String>();
		 generate(list,n,0,0,"");
		 return list;
	    }
}
