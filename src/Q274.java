import java.util.*;
public class Q274 {
	 public int hIndex(int[] citations) {
	        if(citations.length==0)return 0;
	        if(citations.length==1) {
	        	if(citations[0]==0)return 0;
	        	else return 1;
	        }
	        //����2����
	        boolean allSame=true;
	        int n=citations.length;
	        for(int i=1;i<n;i++)if(citations[i]!=citations[0]){allSame=false;break;}
	        if(allSame)return Math.min(n, citations[0]);
	        //����0�������ǽ�
	        Arrays.sort(citations);
	        
	        for(int i=Math.min(n,citations[citations.length-1]);i>=1;i--)
	            if(test(citations,i))return i;
	        return 0;
	    }
	    private boolean test(int[] citations,int h){
	    	//����citations�Ѿ���������
	        int n=citations.length;
	        if(h==n)return (citations[0]>=n);
	      return (citations[n-h]>=h&&citations[n-h-1]<=h);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]citations= {1,2,3};
		System.out.println(new Q274().hIndex(citations));
	}

}
