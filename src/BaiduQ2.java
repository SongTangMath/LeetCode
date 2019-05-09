import java.util.*;
public class BaiduQ2 {
public List<Integer>findShortestPath(boolean[][]edges,int begin,int end){
	List<Integer> path=new ArrayList<Integer>();
	int n=edges.length;
	boolean visited[]=new boolean[n];
	int[]edgeTo=new int[n];
	LinkedList<Integer> queue=new LinkedList<Integer>();
	visited[begin]=true;
	queue.add(begin);
	while(!queue.isEmpty()) {
		int k=queue.size();	
		for(int i=0;i<k;i++)
			for(int j=0;j<n;j++)
				if(!visited[j]&&edges[queue.get(i)][j]) {
					visited[j]=true;
					edgeTo[j]=queue.get(i);
					queue.add(j);
					
				}
		for(int i=0;i<k;i++)
			queue.removeFirst();
		if(visited[end])break;
	}
	if(!visited[end])return null;
	int pos=end;
	while(pos!=begin) {
		path.add(pos);pos=edgeTo[pos];
	}
	path.add(begin);
	return path;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean[][]edges=new boolean[n][n];
		edges[0][1]=true;
		edges[0][2]=true;
		edges[0][3]=true;
		
		edges[1][0]=true;
		edges[2][0]=true;
		edges[3][0]=true;
		int begin=1,end=2;
		List<Integer>list=new BaiduQ2().findShortestPath(edges, begin, end);
		for(int temp:list)
			System.out.print(temp+" ");
	}

}
