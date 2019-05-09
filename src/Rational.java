

import java.util.Objects;

public class Rational {
	int a,b;
	public static int gcd(int a,int b) {
		if(a==0||b==0)return 0;
		if(a<0)a=-a;
		if(b<0)b=-b;
		if(a%b==0)return b;
		if(b%a==0)return a;
		if(a>b) 			
			return gcd(a%b,b);
		else return gcd(b%a,a);
		
		
	}
	
	

	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(a,b);
	}





	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof Rational))return false;
		Rational q=(Rational)obj;
		return (this.a==q.a&&this.b==q.b);
	}





	public Rational(int a,int b) throws ArithmeticException{
		if(a==0) {
			this.a=0;this.b=1;
		}
		else if(b==0)throw new ArithmeticException();
		else {
			int sign=1;
			if((a<0&&b>0)||(a>0&&b<0))sign=-1;
			if(a<0)a=-a;
			if(b<0)b=-b;
			int gcd=gcd(a,b);
			a/=gcd;b/=gcd;
			if(sign==-1)a=-a;
			this.a=a;this.b=b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Rational.gcd(15, 35));
		Rational q=new Rational(35,-1);
		System.out.println();
	}

}
