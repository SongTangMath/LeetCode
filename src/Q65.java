

public class Q65 {
	 public int[] plusOne(int[] digits) {
	        digits[digits.length-1]++;
	        for(int i=digits.length-1;i>=0;i--) {
	        	if(digits[i]==10&&i>0) {digits[i]=0;digits[i-1]++;}
	        	else if(i==0&&digits[i]==10)digits[i]=0;
	        }
	        if(digits[0]!=0)return digits;
	        int[] nums=new int[digits.length+1];
	        nums[0]=1;
	        for(int i=0;i<digits.length;i++)nums[i+1]=digits[i];
	        return nums;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits= {9,9,9};
		digits=new Q65().plusOne(digits);
		for(int i=0;i<digits.length;i++)System.out.print(digits[i]);
	}

}
