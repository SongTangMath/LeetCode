import java.util.*;
public class Test1 {
	static boolean flag=true;
	class MyTask extends TimerTask{

	    @Override
	    public void run() {
	        flag=false;
	        System.out.println("��������!!!!");
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<String>list=new ArrayList<String>();
		String temp;
		
		 Timer t=new Timer();
	        //��3���ִ��MyTask���е�run����
	        t.schedule(new Test1().new MyTask(), 10000);
		while(flag&&sc.hasNextLine())		
			list.add(sc.nextLine());
		
		for(String temp1:list)	 System.out.println(temp1);
		 
		/*
		 * while(sc.hasNextInt()) {list.add(sc.nextInt()); } for(int
		 * temp:list)System.out.print(temp+" ");
		 */
	}

}
