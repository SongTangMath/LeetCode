
public class Q289 {
	 public void gameOfLife(int[][] board) {
		 int m=board.length,n=board[0].length;
		 boolean[][]nextStep=new boolean[m][n];
		 for(int i=0;i<m;i++)
			 for(int j=0;j<n;j++)
				 nextStep[i][j]=nextState(board,i,j);
		 for(int i=0;i<m;i++)
			 for(int j=0;j<n;j++) {
				 if(nextStep[i][j])board[i][j]=1;
				 else board[i][j]=0;
			 }
	    }
	 private int countAlive(int[][] board,int i,int j) {
		 int m=board.length,n=board[0].length;
		 int count=0;
		 if(i-1>=0&&j-1>=0&&board[i-1][j-1]==1)count++;
		 //左上
		 if(i-1>=0&&board[i-1][j]==1)count++;
		 //上
		 if(i-1>=0&&j+1<n&&board[i-1][j+1]==1)count++;
		 //右上
		 
		 if(j-1>=0&&board[i][j-1]==1)count++;
		 //左
		 if(j+1<n&&board[i][j+1]==1)count++;
		 //右
		
		 if(i+1<m&&j-1>=0&&board[i+1][j-1]==1)count++;
		 //左下
		 if(i+1<m&&board[i+1][j]==1)count++;
		 //下
		 if(i+1<m&&j+1<n&&board[i+1][j+1]==1)count++;
		 //右下
		 return count;
	 }
	 private boolean nextState(int[][] board,int i,int j) {
		 int count=countAlive(board, i, j);
		 if(board[i][j]==1)return (count==2||count==3);
		 else return count==3;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board=
				{
		  {0,1,0},
		  {0,0,1},
		  {1,1,1},
		  {0,0,0}
		};
		Q289 obj=new Q289();
		 int m=board.length,n=board[0].length;
		 int count[][]=new int[m][n];
		 boolean nextStep[][]=	new boolean[m][n];	 
				 for(int i=0;i<m;i++)
			 for(int j=0;j<n;j++) {
				 count[i][j]=obj.countAlive( board, i, j);
				 nextStep[i][j]=obj.nextState(board, i, j);}
		 
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++)
				 System.out.print(count[i][j]);
			 System.out.println();
		 }
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++)
				 System.out.print(nextStep[i][j]);
			 System.out.println();
		 } 
		 obj.gameOfLife(board);
		 
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++)
				 System.out.print(board[i][j]);
			 System.out.println();
		 }
	}

}
