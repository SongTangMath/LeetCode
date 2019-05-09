

public class Q8 {
	
	public int charToint(char ch) {
		if(ch=='1')return 1;
		if(ch=='2')return 2;
		if(ch=='3')return 3;
		if(ch=='4')return 4;
		if(ch=='5')return 5;
		if(ch=='6')return 6;
		if(ch=='7')return 7;
		if(ch=='8')return 8;
		if(ch=='9')return 9;
		return 0;
	}
	public int pretreatedStringtoint(String str) {
		int currentpos=str.length()-1;
		int count=1;
		int ans=0;
		while(currentpos>=0) {
			ans+=count*charToint(str.charAt(currentpos));
			count*=10;
			currentpos--;
		}
		return ans;
	}
	
	   public int myAtoi(String str) {
		   String str1=str.trim();
		   String toBuild;
			if(str1.equals(""))return 0;
			char ch=str1.charAt(0);
			int sgn;
			if(Character.isDigit(ch)) {
				sgn=1;
				int index=1;
				while(index<str1.length()&&Character.isDigit(str1.charAt(index)))
						index++;
				toBuild=str1.substring(0, index);
						
			}
			//�����������������ܳ��������ź��沢��������
			else if(ch=='+'){
				sgn=1;
				int index=1;
				
				while(index<str1.length()&&Character.isDigit(str1.charAt(index)))
						index++;
				toBuild=str1.substring(1, index);
						
			}
			else if(ch=='-'){
				sgn=-1;
				int index=1;
				
				while(index<str1.length()&&Character.isDigit(str1.charAt(index)))
						index++;
				toBuild=str1.substring(1, index);
						
			}
			else return 0;//��һ���ַ���������Ҳ����������
			
			
			//�����Ѿ�ȷ��,toBuild�ַ����д��д�ת������,����toBuild���������ɸ�0��ͷ
			//����Ϊ��.���ǽ�0ȥ��
			if(toBuild.length()==0)return 0;
			int index=0;
			while(index<toBuild.length()&&toBuild.charAt(index)=='0')index++;
			toBuild=toBuild.substring(index, toBuild.length());
			//System.out.println(toBuild.length());
			if(sgn==1) {
				
				if(toBuild.length()>=11)return 2147483647;
				else if(toBuild.length()==10&&toBuild.compareTo("2147483647")>0)
					return 2147483647;
				else  return pretreatedStringtoint(toBuild);
				
				
			}
			
if(sgn==-1) {
				
				if(toBuild.length()>=11)return -2147483648;
				else if(toBuild.length()==10&&toBuild.compareTo("2147483648")>=0)
					return -2147483648;
				else   return pretreatedStringtoint(toBuild)*-1;
				
			}
	        return 0;
	    }
	public static void main(String[] args) {
		Q8 obj=new Q8();
		obj.myAtoi("    -0000");

	}

}
