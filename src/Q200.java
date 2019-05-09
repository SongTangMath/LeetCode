

public class Q200 {
public int numIslands(char[][] grid) {
	if(grid.length==0)return 0;
	int m=grid.length,n=grid[0].length;
        boolean[][]visited=new boolean[m][n];
        boolean found=true;
        int count=0;
        while(found) {
        	found=false;
        	for(int i=0;i<m;i++)
        		for(int j=0;j<n;j++) 
        			if(grid[i][j]=='1'&&!visited[i][j]) {
        				found=true;
        				visited[i][j]=true;
        				startFrom(grid,visited,i,j);
        				count++;
        		}
        }
        return count;
    }
private void startFrom(char[][]grid,boolean[][]visited,int i,int j) {
	int m=grid.length,n=grid[0].length;
	if(i-1>=0&&!visited[i-1][j]&&grid[i-1][j]=='1') {
		visited[i-1][j]=true;
		startFrom(grid,visited,i-1,j);
	}
	if(i+1<m&&!visited[i+1][j]&&grid[i+1][j]=='1') {
		visited[i+1][j]=true;
		startFrom(grid,visited,i+1,j);
	}
	if(j-1>=0&&!visited[i][j-1]&&grid[i][j-1]=='1') {
		visited[i][j-1]=true;
		startFrom(grid,visited,i,j-1);
	}
	if(j+1<n&&!visited[i][j+1]&&grid[i][j+1]=='1') {
		visited[i][j+1]=true;
		startFrom(grid,visited,i,j+1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]grid= {
				{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'},
	};
		System.out.println(new Q200().numIslands(grid));
		
}}
