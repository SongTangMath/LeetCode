
import java.util.*;
public  class Father<T> {
 T name;

	public static void main(String[]args) {
		Father<?> f=new Father<String>();
		f=new Father<Integer>();
		String test="With the latest technology and highly"
				+ " advanced materials";
		String[] Array=test.split(" ");
		for(int i=0;i<Array.length;i++)
			System.out.println(Array[i]);
		List<Integer> list=new ArrayList() ;
		list.add(2);
		list.add(4);
		list.add(3);
		int[]a= {2,8,5,6,3,4};
		
				Arrays.sort(a);
				for(int i:a)
					System.out.println(i);
				double j=Math.floor(3.5);
				System.out.println(j);
				String str1="abc";
				String str2="abcd";
				if(((Comparable)str1).compareTo(str2)>0);
				String[]strs=new String[3];
				strs[1]="const";
				strs[0]="latest";
				strs[2]="sigma";
				Arrays.sort(strs);
				for(String temp:strs)
					System.out.println(temp);
				System.out.println(System.currentTimeMillis());
				}
	
}


class Child<T> extends Father<T>
{
	public void test(Object t) {
		
	}
}