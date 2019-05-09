

public class Q130 {
public void solve(char[][] board) {
	if(board==null||board.length==0||board[0].length==0)return;
        int m=board.length;int n=board[0].length;
        //边界条件为(i=0或n-1)或(j=0或m-1)
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++)
        	for(int j=0;j<n;j++) {
        		if((i==0||i==m-1)||(j==0||j==n-1))
        		{
        			if(board[i][j]=='O'&&!visited[i][j])
        				process(board,i,j,visited);
        		}
        	}
        for(int i=0;i<m;i++)
        	for(int j=0;j<n;j++)
        		if(board[i][j]=='O'&&!visited[i][j])board[i][j]='X';
    }
private void process(char[][] board,int i,int j,boolean[][]visited) {
	visited[i][j]=true;
	int m=board.length;int n=board[0].length;
	if(i-1>=0&&board[i-1][j]=='O'&&!visited[i-1][j])process(board,i-1,j,visited);
	if(i+1<m&&board[i+1][j]=='O'&&!visited[i+1][j])process(board,i+1,j,visited);
	if(j-1>=0&&board[i][j-1]=='O'&&!visited[i][j-1])process(board,i,j-1,visited);
	if(j+1<n&&board[i][j+1]=='O'&&!visited[i][j+1])process(board,i,j+1,visited);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			char[][]board= {
//					{'X','X' ,'X' ,'X'},
//					{'X','O' ,'O' ,'X'},
//					{'X','X' ,'O' ,'X'},
//					{'X','O' ,'X' ,'X'}
//			};
		char[][]board= {
				{'O','O' ,'O' },
				{'O','O' ,'O' },
				{'O','O' ,'O' },
				
		};
			new Q130().solve(board);
			 int m=board.length;int n=board[0].length;
			 for(int i=0;i<n;i++) {
		        	for(int j=0;j<m;j++)
		        		System.out.print(board[i][j]);
		        	System.out.println();
			 }
			 
	}

}
