

import java.io.Closeable;
import java.io.IOException;

public class testfanxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static <T extends Closeable> void test(T...a)
{
	for(T temp:a) {
		try { if(temp!=null)
			temp.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
		
}
}
