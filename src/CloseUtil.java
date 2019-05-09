

import java.io.Closeable;
import java.io.IOException;

public class CloseUtil {
public static void closeall(Closeable... a) {
for(Closeable temp:a)
	try {
		temp.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}