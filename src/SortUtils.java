
import java.util.*;
public class SortUtils {
private static int[] data= {-10,-1,2,3,9,7,5,8,6};
private static int[] a= {0,-10,-1,2,3,9,7,5,8,6};

public static void headAdjust(int s,int m) {
	int k=s;
if(2*s>m||(2*s+1<=m&&a[s]>a[2*s]&&a[s]>a[2*s+1])||(2*s==m&&a[s]>=a[2*s]))return;
while(2*k<=m){
	if(2*k+1<=m) {
		if(a[2*k+1]>=a[2*k]&&a[2*k+1]>a[k]){
			//��ʱӦ��a[k]��a[2k+1]��
			int temp=a[k];a[k]=a[2*k+1];a[2*k+1]=temp;k=2*k+1;}

			else if(a[2*k]>=a[2*k+1]&&a[2*k]>a[k])
			{int temp=a[k];a[k]=a[2*k];a[2*k]=temp;k=2*k;}

			}
	
//2k=m
else if(a[k]<a[2*k]) {
	int temp=a[k];a[k]=a[2*k];a[2*k]=temp;k=2*k;
}
else return;
	}
	

}
	
	public static void main(String[] args) {
		int n=data.length;
		for(int k=n/2;k>=1;k--)headAdjust(k,n);
		for(int k=n;k>=1;k--) {
			int temp=a[1];
			a[1]=a[k];
			a[k]=temp;
			System.out.println(a[k]);
			headAdjust(1,k-1);
		}
		
	}
		
		
}
