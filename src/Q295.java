import java.util.*;
public class Q295 {
	List<Integer> list;
    /** initialize your data structure here. */
    public Q295() {
        list=new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        int pos=findInsertPos(num);
        if(pos==list.size())list.add(num);
        else list.add(pos,num);
    }
    
    public double findMedian() {
    	int n=list.size();
    	//a[0...2k-1]中位数是a[k-1],a[k]平均数
        if(n%2==0) {
        	int a=list.get(n/2),b=list.get(n/2-1);
        	return (a+b)/2.0;
        }
        else return list.get(n/2);
    }
    private int findInsertPos(int num){
    	if(list.size()==0)return 0;
        
        if(list.get(0)>=num)return 0;
        if(list.get(list.size()-1)<=num)return list.size();
        int begin=0,end=list.size();
        //保持list[begin]<=num,list[end]>num
        //pos应该使得list[pos]<=num list[pos+1]>num
        //考虑到可能有重复的如果已经找到相等的直接插入即可
        while(begin<end-1) {
        	int mid=begin+(end-begin)/2;
        	if(list.get(mid)==num)return mid;
        	else if(list.get(mid)>num)end=mid;
        	else begin=mid;
        }
        return end;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Q295 obj=new Q295();
			obj.addNum(6);
			obj.addNum(10);
			//System.out.println(obj.findMedian());
			obj.addNum(2);
			obj.addNum(6);
			obj.addNum(5);//2,5,6,6,10
			System.out.println(obj.findMedian());
	}

}
