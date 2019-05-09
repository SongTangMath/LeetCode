

public class Q12 {
	  public String intToRoman(int num) {
	        int gewei=num %10;num/=10;
	int shiwei=num%10; num/=10;
	int baiwei=num%10; num/=10;
	int qianwei=num;//注意,十百千位都可能为0.
	String qianweiStr=new String("");
	String baiweiStr=new String("");
	String shiweiStr=new String("");
	String geweiStr=new String("");
	switch(qianwei){
	case 1: qianweiStr="M";break;
	case 2: qianweiStr="MM";break;
	case 3: qianweiStr="MMM";break;
	}
	switch(baiwei){
	case 1: baiweiStr="C";break;
	case 2: baiweiStr="CC";break;
	case 3: baiweiStr="CCC";break;
	case 4: baiweiStr="CD";break;
	case 5: baiweiStr="D";break;
	case 6: baiweiStr="DC";break;
	case 7: baiweiStr="DCC";break;
	case 8: baiweiStr="DCCC";break;
	case 9: baiweiStr="CM";break;
	}
	switch(shiwei){
	case 1: shiweiStr="X";break;
	case 2: shiweiStr="XX";break;
	case 3: shiweiStr="XXX";break;
	case 4: shiweiStr="XL";break;
	case 5: shiweiStr="L";break;
	case 6: shiweiStr="LX";break;
	case 7: shiweiStr="LXX";break;
	case 8: shiweiStr="LXXX";break;
	case 9: shiweiStr="XC";break;
	}
	switch(gewei){
	case 1: geweiStr="I";break;
	case 2: geweiStr="II";break;
	case 3: geweiStr="III";break;
	case 4: geweiStr="IV";break;
	case 5: geweiStr="V";break;
	case 6: geweiStr="VI";break;
	case 7: geweiStr="VII";break;
	case 8: geweiStr="VIII";break;
	case 9: geweiStr="IX";break;
	}
return qianweiStr+baiweiStr+shiweiStr+geweiStr;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new Q12().intToRoman(1994));
	}

}
