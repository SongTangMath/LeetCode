

public class Q168 {
public String convertToTitle(int n) {
        String ans="";
       
        while(n>0) {
        	int digit=n%26;
        	
        	if(digit==0)digit=26;
        	
        	n-=digit;n/=26;
        	
        	char ch=(char) ('A'+digit-1);
        	
        	ans=ch+ans;
        }
        return ans;
       
    }

public int titleToNumber(String s) {
	int ans=0;
    for(int i=s.length()-1;i>=0;i--) {
    	int j=s.length()-1-i;
    	ans+=Math.pow(26, j)*(s.charAt(i)+1-'A');
    }
    return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(new Q168().titleToNumber("ZY"));
	}

}
