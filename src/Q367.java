import java.util.*;
public class Q367 {
	public boolean isPerfectSquare(int num) {
        if(num<0)return false;
        if(num==0)return true;
        long begin=1,end=num+1;
        while(begin<end){
            long mid=begin+(end-begin)/2;
            if(mid*mid==num)return true;
            else if(mid*mid>num)end=mid;
            else begin=mid+1;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print(new Q367().isPerfectSquare(4));
		HashMap<Integer,Integer>map1=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer>map2=new HashMap<Integer,Integer>();
		map1.put(1,2);map1.put(2,1);
		map2.put(2,1);map2.put(1,2);
		System.out.print(map1.equals(map2));
	}

}
