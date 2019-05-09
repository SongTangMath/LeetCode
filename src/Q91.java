class Q91 {
    public int numDecodings(String s) {
              if(s.length()==0)return 1;
	        if(s.equals("0"))return 0;
	        if(s.length()==1&&!s.equals("0"))return 1;
	        String temp=s.substring(s.length()-2,s.length());
	        if(temp.equals("00")||temp.equals("30")
	        		||temp.equals("40")||temp.equals("50")
	        		||temp.equals("60")||temp.equals("70")
	        		||temp.equals("80")||temp.equals("90"))return 0;
	        if(temp.equals("10")||temp.equals("20")

	        		)return
	        				numDecodings(s.substring(0,s.length()-2));
	        int temp1=Integer.valueOf(temp);
	        if(11<=temp1&&temp1<=26&&temp1!=20)return 
	        		numDecodings(s.substring(0,s.length()-1))+
	        		numDecodings(s.substring(0,s.length()-2));
	        else return numDecodings(s.substring(0,s.length()-1));
    }
}
