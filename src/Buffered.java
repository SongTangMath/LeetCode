
import java.io.*;
public class Buffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src="D:/javacode/hello.java";
		String dest="E:/javacode/hello.java";
		InputStream is=null;
		OutputStream os=null;
try {
	 is=new BufferedInputStream(new FileInputStream(src));
	 os=new BufferedOutputStream(new FileOutputStream(dest));
	 byte[] flush=new byte[1024];
	 int len=0;
	 while((len=is.read())!=-1)
os.write(flush, 0, len);
}
catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
