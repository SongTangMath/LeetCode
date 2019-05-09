

public class Q36 {
	
	private boolean checkRow(char[][] board,int index) {
		int[] used=new int[10];
		for(int i=0;i<10;i++)used[i]=0;
		
		for(int i=0;i<9;i++) {
			
			if(49<=board[index][i]&&board[index][i]<=57)
			{
				if(used[board[index][i]-48]==1)return false;
				used[board[index][i]-48]=1;			
			}
		}
		return true;
	}
	
	private boolean checkColumn(char[][] board,int index) {
		int[] used=new int[10];
		for(int i=0;i<10;i++)used[i]=0;
		
		for(int i=0;i<9;i++) {
			
			if(49<=board[i][index]&&board[i][index]<=57)
			{
				if(used[board[i][index]-48]==1)return false;
				used[board[i][index]-48]=1;			
			}
		}
		return true;
	}
	
	private boolean checkSquare(char[][] board,int index) {
		
		int rowindex=(int) Math.ceil(index/3.0);
		int columnindex=-1;
		switch(index%3) {
		case 0:columnindex=3;break;
		case 1:columnindex=1;break;
		case 2:columnindex=2;break;
		}
		int centerx=3*rowindex-2;
		int centery=3*columnindex-2;
		
		char[] seq=new char[9];
		seq[0]=board[centerx-1][centery-1];
		seq[1]=board[centerx-1][centery];
		seq[2]=board[centerx-1][centery+1];
		seq[3]=board[centerx][centery-1];
		seq[4]=board[centerx][centery];
		seq[5]=board[centerx][centery+1];
		seq[6]=board[centerx+1][centery-1];
		seq[7]=board[centerx+1][centery];
		seq[8]=board[centerx+1][centery+1];
		int[] used=new int[10];
		for(int i=0;i<10;i++)used[i]=0;
		
		for(int i=0;i<9;i++) {
			
			if(49<=seq[i]&&seq[i]<=57)
			{
				if(used[seq[i]-48]==1)return false;
				used[seq[i]-48]=1;			
			}
		}
		return true;
	}
public boolean isValidSudoku(char[][] board) {
	for(int i=0;i<9;i++)
		if(!checkRow(board,i)||!checkColumn(board,i))
	return false;
	for(int i=1;i<=9;i++)
		if(!checkSquare(board,i))return false;
	return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]board={{'5','3','.','.','7','.','.','.','.'},
		               {'6','.','.','1','9','5','.','.','.'},
		               {'.','9','8','.','.','.','.','6','.'},
		               {'8','.','.','.','6','.','.','.','3'},
		               {'4','.','.','8','.','3','.','.','1'},
		               {'7','.','.','.','2','.','.','.','6'},
		               {'.','6','.','.','.','.','2','8','.'},
		               {'.','.','.','4','1','9','.','.','5'},
		               {'.','.','.','.','8','.','.','7','9'}};
		
		new Q36().isValidSudoku(board);
	}
	

}
