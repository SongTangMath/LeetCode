
import java.util.*;
public class Q54 {
	 public List<Integer> spiralOrder(int[][] matrix) {
		 List<Integer> list =new ArrayList<Integer>();
		 if(matrix.length==0)return list;
		 int m=matrix.length,n=matrix[0].length;
		 boolean[][]used=new boolean[m][n];
		 int i=0,j=0,count=1;used[0][0]=true;
		 list.add(matrix[0][0]);
		 while(count<m*n) {
			 
			 while(j+1<n&&!used [i][j+1]) 
			 {used[i][++j]=true;list.add(matrix[i][j]);count++;}
			 while(i+1<m&&!used [i+1][j]) 
			 {used[++i][j]=true;list.add(matrix[i][j]);count++;}
			
			 while(j-1>=0&&!used [i][j-1]) 
			 {used[i][--j]=true;list.add(matrix[i][j]);count++;}
			 while(i-1>=0&&!used [i-1][j]) 
			 {used[--i][j]=true;list.add(matrix[i][j]);count++;}
			
		 }
		 return list;
		 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matrix=
		{
		  {1, 2, 3, 4},
		  {5, 6, 7, 8},
		  {9,10,11,12}
		};
		List<Integer> list=new Q54().spiralOrder(matrix);
		for(int i=0;i<list.size();i++)System.out.print(list.get(i));
	}

}
