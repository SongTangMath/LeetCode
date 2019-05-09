

import java.util.ArrayList;
import java.util.List;

public class Q79 {
	 
	 public boolean exist(char[][] board, String word){
		 
		 
		 if(board==null||word==null||word.length()==0||board[0].length==0)
			 return false;
		 int m=board.length,n=board[0].length;
		 boolean[][]used=new boolean[m][n];
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) 
				 if(board[i][j]==word.charAt(0)) {
					
					 used[i][j]=true;
					 if(generate(board,word,1,i,j,used))return true;
					 used[i][j]=false;
				 }
			 
		 }
		 return false;
	 }
	 
	 private boolean generate(
			  char[][] board, 
			  String word,int nextpos,int curx,int cury,boolean[][]used) {
		  if(nextpos==word.length()) 
		 return true;
		 if(curx+1<board.length&&!used[curx+1][cury]&&
				 board[curx+1][cury]==word.charAt(nextpos)) {
			
			 used[curx+1][cury]=true;
			 if(generate(board,word,nextpos+1,curx+1,cury,used))return true;
			
			 used[curx+1][cury]=false;
		  }
		 
		 if(curx-1>=0&&!used[curx-1][cury]&&
				 board[curx-1][cury]==word.charAt(nextpos)) {
			 
			 used[curx-1][cury]=true;
			 if(generate(board,word,nextpos+1,curx-1,cury,used))return true;
			
			 used[curx-1][cury]=false;
		  }
		 
		 if(cury+1<board[0].length&&!used[curx][cury+1]&&
				 board[curx][cury+1]==word.charAt(nextpos)) {
			
			 used[curx][cury+1]=true;
			 if(generate(board,word,nextpos+1,curx,cury+1,used))
				 return true;
			
			 used[curx][cury+1]=false;
		  }
		 
		 
		 if(cury-1>=0&&!used[curx][cury-1]&&
				 board[curx][cury-1]==word.charAt(nextpos)) {
			
			 used[curx][cury-1]=true;
			 if(generate(board,word,nextpos+1,curx,cury-1,used))
				 return true;
			 
			 used[curx][cury-1]=false;
		  }
		 return false;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]board =
				{
				  {'A','B','C','E'},
				  {'S','F','C','S'},
				  {'A','D','E','E'}
				};
		String word="ABCCED";
		
		
			System.out.println(new Q79().exist(board, word));
	}

}
