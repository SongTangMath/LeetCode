
import java.util.*;
public class Q120 {
	 public int minimumTotal(List<List<Integer>> triangle) {
	        int n=triangle.size();
	        if(n<=0)return 0;
	        int[][] a=new int[n][n];
	        a[0][0]=triangle.get(0).get(0);
	        for(int i=1;i<n;i++) {
	        	a[i][0]= triangle.get(i).get(0)+a[i-1][0];
	        	a[i][i]= triangle.get(i).get(i)+a[i-1][i-1];
	        	for(int j=1;j<i;j++)a[i][j]= 
	        			triangle.get(i).get(j)+Math.min(a[i-1][j],a[i-1][j-1]);

	        }
	        int min=a[n-1][0];
	        for(int i=1;i<n;i++)min=Math.min(min, a[n-1][i]);
	        return min;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> triangle=new ArrayList<List<Integer>> ();
		List<Integer>list =new ArrayList<Integer>();
		list.add(2);triangle.add(new ArrayList<Integer>(list));
		list.clear();list.add(3);list.add(4);
		triangle.add(new ArrayList<Integer>(list));
		list.clear();list.add(6);list.add(5);list.add(7);
		triangle.add(new ArrayList<Integer>(list));
		list.clear();list.add(4);list.add(1);list.add(8);list.add(3);
		triangle.add(new ArrayList<Integer>(list));
		System.out.println(new Q120().minimumTotal(triangle));
		
	}

}
