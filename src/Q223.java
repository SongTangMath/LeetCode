

public class Q223 {
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	        int lenx=computeLength(A,C,E,G);
	        int leny=computeLength(B,D,F,H);
	        return (C-A)*(D-B)+(G-E)*(H-F)-lenx*leny;
	    }
	 private int computeLength(int a,int b,int c,int d) {
		 //计算[a,b],[c,d]交集长度
		 if(c>=b||d<=a)return 0;
		 return Math.min(d, b)-Math.max(a, c);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2;
		 System.out.println(new Q223().computeArea(A, B, C, D, E, F, G, H));
	}

}
