
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Queue;
import java.util.Vector;
public class compare {

	class Dog{
	    public int age;
	    public String name;
	    public Dog(int age, String name) {
	        super();
	        this.age = age;
	        this.name = name;
	    }
	    @Override
	    public String toString() {
	        return "Dog [age=" + age + ", name=" + name + "]";
	    }
	    }
	    public static void main(String[] args) {
	    List<Dog> list= new ArrayList<>();
	    list.add(new compare().new Dog(5, "DogA"));
	    list.add(new compare().new Dog(6, "DogB"));
	    list.add(new compare().new Dog(7, "DogC"));
	    class MyComparator implements Comparator<Dog> {

	        @Override
	        public int compare(Dog o1, Dog o2) {
	        return o2.age - o1.age;
	        }
	    } 
	    MyComparator mycomp=new MyComparator();
	    
	    Collections.sort(list,mycomp );
	    System.out.println("给狗狗按照年龄倒序："+list);
	    Collections.sort(list, new Comparator<Dog>() {

	        @Override
	        public int compare(Dog o1, Dog o2) {
	        return o1.name.compareTo(o2.name);
	        }
	    });
	    System.out.println("给狗狗按名字字母顺序排序："+list);
	    BigInteger totalAmount =  new BigInteger("213");  
        totalAmount.add(new BigInteger("5000"));  
        System.out.println(totalAmount);
        System.out.println(list);
        Queue<Request> que=new ArrayDeque<Request>();
        for(int i=0;i<10;i++) {final int num=i;
        que.offer(new Request() {

			@Override
			public void deposit() {
				System.out.println("第"+(num+1)+"个人存款"+Math.random()*1000);
				// TODO Auto-generated method stub
				
			}
        	
        });
	    }
        dealwith(que);
        Vector<String> Mystr=new Vector<String>();
        Mystr.add("Boeing");
        Mystr.add("Airbus");
        Mystr.add("Bombardier");
        Enumeration<String>en=Mystr.elements();
        while(en.hasMoreElements())
        	System.out.println(en.nextElement());
	    }
	    public static void dealwith(Queue<Request> que) {
	    	if(que!=null) {
	    		while(que.peek()!=null) {
	    	Request req=que.peek();
	    	req.deposit();
	    	que.remove();
	    		}
	    	}
	    }
	    
}
interface Request{
	void deposit();
}