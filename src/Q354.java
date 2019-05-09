import java.util.*;
public class Q354 {
public int longestPathInDAG(boolean[][]edges,int[]d,int index) {
	if(d[index]!=-1)return d[index];
	int n=d.length;
	List<Integer>list=new ArrayList<Integer>();
	list.add(0);
	for(int j=0;j<n;j++)
		if(edges[index][j])list.add(longestPathInDAG(edges,d,j));
	d[index]=1+Collections.max(list);
	return d[index];
}
public int longestPathInDAG(boolean[][]edges) {
	int n=edges.length;
	int[]d=new int[n];
	for(int i=0;i<n;i++)d[i]=-1;
	for(int i=0;i<n;i++)longestPathInDAG(edges,d,i);
	int max=-1;
	for(int i=0;i<n;i++)max=Math.max(max, d[i]);
	return max;
}
public int maxEnvelopes(int[][] envelopes) {
	if(envelopes==null||envelopes.length==0)return 0;
    int n=envelopes.length;
    boolean[][]edges=new boolean[n][n];
    for(int i=0;i<n;i++)
    	for(int j=0;j<n;j++)
    	{
    		int[]left=envelopes[i];
    		int[]right=envelopes[j];
    		if(left[0]<right[0]&&left[1]<right[1])
    			edges[i][j]=true;
    		else if (right[0]<left[0]&&right[1]<left[1])
    			edges[j][i]=true;
    	}
    return longestPathInDAG(edges);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
