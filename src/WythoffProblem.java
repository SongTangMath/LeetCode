import java.util.*;
public class WythoffProblem {
public int canWin(int a,int b) {
	
	if(a>b)
		{		
		int temp=a;a=b;b=temp;
		}
	double k=b-a;
	double x=(1+Math.sqrt(5.0))/2;
	int t=(int) (k*x+k);
	if(t==b)return 0;
	else return 1;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		WythoffProblem obj=new WythoffProblem();
		List<String>list=new ArrayList<String>();
		while(sc.hasNextInt()) {int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(obj.canWin(a, b));
		}
	}

}
