
import java.util.*;
public class Timertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Timer timer=new Timer();
timer.schedule(new MyTask(), new Date(System.currentTimeMillis()+1000),300);
	}

}
class MyTask extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("XYZ");
	}
	
}