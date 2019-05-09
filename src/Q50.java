
public class Q50 {
	 public double myPow(double x, int n) {
	        if(n>=0){
	            if(n==0)return 1;
	            if(n==1)return x;
	            if(n%2==0)return myPow(x*x,n/2);
	                else return myPow(x*x,n/2)*x;
	        }
	        else return 1/myPow( x, -n);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=0.00001;
		int n=2147483647;
System.out.print(new Q50().myPow(x,n));
	}

}
